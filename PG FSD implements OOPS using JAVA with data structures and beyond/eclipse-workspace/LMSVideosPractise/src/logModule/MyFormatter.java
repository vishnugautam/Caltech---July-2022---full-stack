package logModule;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

// extending the Formatter given by log4j
public class MyFormatter extends Formatter{
	
	@Override
	public String format(LogRecord record) {
		// LoggingExample.java + :: + main method in the logger example + :: + log level we log + :: + time + :: + message you log
		return record.getSourceClassName() + " :: " + record.getSourceMethodName() + " :: " + record.getLevel() + " :: " + new Date(record.getMillis()) + " :: " + record.getMessage() + "\n";
	}
	
}
