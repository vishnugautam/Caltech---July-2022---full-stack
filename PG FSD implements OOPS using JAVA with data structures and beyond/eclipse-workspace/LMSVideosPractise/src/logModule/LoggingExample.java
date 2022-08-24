package logModule;

import java.io.IOException;
// used to read the file like config file - mylogging.properties
import java.io.FileInputStream;
	// logging related packages 
// to log the data to the console - stdout 
import java.util.logging.ConsoleHandler;
// is to write to the file
import java.util.logging.FileHandler;
// handler is to handle the file and do some customization 
import java.util.logging.Handler;
// log leveling 
import java.util.logging.Level;
// is the class which we are going to use the configuration file 
import java.util.logging.LogManager;
// using that object we are going to log the file 
import java.util.logging.Logger;

public class LoggingExample {
	// creating a Logger instance and log the data for this class, getLogger() is a method in Logger class
	static Logger logger = Logger.getLogger(LoggingExample.class.getName());
	public static void main(String[] args) {
		try {
			//how my log property should look like, the config file is get through LogManager 
			LogManager.getLogManager().readConfiguration(new FileInputStream("src/mylogging.properties"));
		} catch(SecurityException | IOException el) {
			el.printStackTrace();
		}
		// doing our own logging level than what is in the mylogging.properties, overloading 
		logger.setLevel(Level.FINE);
		// first add to console 
		logger.addHandler(new ConsoleHandler());
		// adding custom handler, add to the logger
		logger.addHandler(new MyHandler());
		
		try {
			//FileHandler file name with max size and number of log files limit 
			// all the logs has to go the file called logger.log, maximum of 2L lines, create upto 5 files 
			Handler fileHandler = new FileHandler("/tmp/logger.log", 200000, 5);
			// using our MyFormatter class to display the log - format of the file 
			fileHandler.setFormatter(new MyFormatter());
			// setting custom filter for FileHandler
			fileHandler.setFilter(new MyFilter());
			
			//we have to add to the logger 
			logger.addHandler(fileHandler);
			
			
			// actual program on which logging is performed 
			for(int i = 0; i < 1000; i++) {
				// logging messages
				if(i % 7 == 0) {
					logger.log(Level.SEVERE, "Something wrong" + i);
					continue;
				}
				else if (i % 5 == 0) {
					logger.log(Level.WARNING, "Just a warning message-" + i);
					continue;
				}
				logger.log(Level.INFO, "Logging message-" + i);
				logger.log(Level.CONFIG, "Config data");
			}
			// logger.log(Level.CONFIG, "config data");
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

	}

}
