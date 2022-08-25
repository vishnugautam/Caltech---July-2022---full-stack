package logModule;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

// extends log4j package called Filter 
public class MyFilter implements Filter {

	@Override
	public boolean isLoggable(LogRecord log) {
		// i don't want to log any messages unless it is config log level 
		if(log.getLevel() == Level.CONFIG) return true;
		return true;
	}

	
	
	
}
