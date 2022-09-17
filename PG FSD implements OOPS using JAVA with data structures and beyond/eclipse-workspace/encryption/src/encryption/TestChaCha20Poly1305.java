package encryption;

import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TestChaCha20Poly1305 {
	private static final int NONCE_LEN = 12;
	private static final int MAC_LEN = 16;
	
	public static void main(String[] args) throws Exception {
		String input = "ChaCha20Poly1305 program demonstration";
		
		// this class will have how to encrypt and decrypt
		ChaCha20Poly1305 cipher = new ChaCha20Poly1305();
		
		SecretKey key = getKey();
		
		System.out.println("Input: " + input);
		// convert input to hex form - bytes to hex 
		System.out.println("Input (hex): " + covertBytesToHex(input.getBytes()));
		
		System.out.println("\n Encyption: ");
		byte[] cText = cipher.encrypt(input.getBytes(), key);
		System.out.println("key(hex): " + covertBytesToHex(key.getEncoded()));
		System.out.println("Encrypted (hex): " + covertBytesToHex(cText));
		// MAC is message authentication code 
		System.out.println("\n Print MAC and Nonce: ");
		// entire cipher text is in the bytebuffer
		// from here we are going to get the data
		ByteBuffer bb = ByteBuffer.wrap(cText);
		
		byte[] originalCText = new byte[input.getBytes().length];
		byte[] nonce = new byte[NONCE_LEN];
		byte[] mac = new byte[MAC_LEN];
		
		bb.get(originalCText);
		bb.get(mac);
		bb.get(nonce);
		System.out.println("Cipher original (hex): " + covertBytesToHex(originalCText));
		System.out.println("MAC(hex): " + covertBytesToHex(mac));
		System.out.println("Nonce(hex): " + covertBytesToHex(nonce));
		
		System.out.println("\n Decryption: ");
		System.out.println("Input(hex): " + covertBytesToHex(cText));
		
		byte[] pText = cipher.decrypt(cText, key);
		System.out.println("key(hex): " + covertBytesToHex(key.getEncoded()));
		System.out.println("Decrypted(hex): " + covertBytesToHex(pText));
		// converting to string
		System.out.println("Decrypted: " + new String(pText));
		
		
		
	}
	
	private static SecretKey getKey() throws NoSuchAlgorithmException{
		// it generates a key for you
		// what is the algorithm we are going to use?
		// 20 indicates the number of rounds the algorithm runs
		KeyGenerator keyGen = KeyGenerator.getInstance("ChaCha20");
		// initilisation 
		keyGen.init(256, SecureRandom.getInstanceStrong());
		
		return keyGen.generateKey();
	}

	private static String covertBytesToHex(byte[] bytes) {
		// convert bytes to hex values 
		StringBuilder result = new StringBuilder();
		
		// convert each byte to hex decimal and appending it to the result 
		for(byte temp: bytes) {
			// %02x 2 digit hexadecimal value 
			result.append(String.format("%02x", temp));
		}
		// and converting it to string 
		return result.toString();
	}

}
