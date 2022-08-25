package logModule;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

// extends default handler from log4j called StreamHandler 
public class MyHandler extends StreamHandler{

	// write my own logic 
	// we are overriding it but not doing anything on it just wanted to show we can override
	
	@Override
	public void publish(LogRecord record) {
		//add own logic to publish
		super.publish(record);
	}
	
	@Override
	public void flush() {
		super.flush();
	}
	
	@Override
	public void close() throws SecurityException{
		super.close();
	}
}
