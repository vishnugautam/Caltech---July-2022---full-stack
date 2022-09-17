package encryption;
import java.nio.ByteBuffer;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;


public class ChaCha20Poly1305 {
	// what encryption needed?
	private static final String ENCRYPT_ALGO = "ChaCha20-Poly1305";
	// it is like a random value - what should be the length of it?
	private static final int NONCE_LEN = 12;
	
	// encryption method - like a dummy method
	public byte[] encrypt(byte[] pText, SecretKey key) throws Exception{
		// pText stands for plain text 
		// nonce is a random number that gets added
		// it identifies weather the message is messed up or not
		// if user does not pass nonce, we call the actual method that has has been done
		// user might not be knowing nonce and all
		return encrypt(pText, key, getNonce());
	}
	
	private static byte[] getNonce() {
		// generate random value
		byte[] newNonce = new byte[12];
		new SecureRandom().nextBytes(newNonce);
		
		return newNonce;
	}

	// actual encryption happens
	// giving privilege to user 
	public byte[] encrypt(byte[] pText, SecretKey key, byte[] nonce) throws Exception{
		// what encryption we are going to use which is get by cipher
		Cipher cipher = Cipher.getInstance(ENCRYPT_ALGO);
		// initialization
		IvParameterSpec iv = new IvParameterSpec(nonce);
		
		// initialize the cipher with the encrypt mode 
		cipher.init(Cipher.ENCRYPT_MODE, key, iv);
		
		// this will do a multi-part encryption - what to encrypt?
		byte[] encryptedText = cipher.doFinal(pText);
		// adding to the encryptedText whatever nonce is created 
		byte[] output = ByteBuffer.allocate(encryptedText.length + NONCE_LEN).put(encryptedText).put(nonce).array();
		return output;
	}
	
	public byte[] decrypt(byte[] cText, SecretKey key) throws Exception{
		// we need to wrap the cipher text 
		ByteBuffer bb = ByteBuffer.wrap(cText);
		// in encryption we are adding nonce value
		// so to decrypt we need to strip the nonce out
		byte[] encryptedText = new byte[cText.length - NONCE_LEN];
		// again you have to get the nonce 
		byte[] nonce = new byte[NONCE_LEN];
		
		// get the encryptedTect
		bb.get(encryptedText);
		// get the nonce also
		bb.get(nonce);
		
		// we are running the below 2 lines in different modes
		// one in encryption mode and one in decryption mode
		// what encryption we are going to use which is get by cipher
		Cipher cipher = Cipher.getInstance(ENCRYPT_ALGO);
		// initialization
		IvParameterSpec iv = new IvParameterSpec(nonce);
		// initialize the cipher with the decrypt mode 
		cipher.init(Cipher.DECRYPT_MODE, key, iv);
		
		// decrypting giving encrypted text which we receive from user 
		byte[] output = cipher.doFinal(encryptedText);
		
		return output;
		
	}
	
}
