package com.faustobranco;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Reference: https://logging.apache.org/log4j/2.x/manual/customloglevels.html

        Logger logger = LogManager.getLogger(Main.class);

        LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
        File file = new File("src/main/resources/log4j2.xml");

        context.setConfigLocation(file.toURI());

        logger.debug("Hello from Log4j ");


        logger.log(Level.forName("DIAG", 350), "a diagnostic message");
        logger.log(Level.getLevel("NOTICE"), "another diagnostic message");
        logger.log(Level.getLevel("REPAIR"), "another REPAIR message");
        logger.log(Level.FATAL, "Logger Name :: "+logger.getName()+" :: Passed Message ::");



        logger.debug("{}");
        logger.trace("the built-in TRACE level");
        logger.debug("the built-in DEBUG level");
        logger.info("the built-in INFO level");
        logger.warn("the built-in WARN level");
        logger.error("the built-in ERROR level");
        logger.fatal("the built-in FATAL level");

    }
}
