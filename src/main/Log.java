package main;

import java.util.logging.Logger;

public abstract class Log {

    private Log() {
    }

    private static final Logger logger = Logger.getLogger(Log.class.getName());

    public static void info(String message) {
        logger.info(message);
    }

}
