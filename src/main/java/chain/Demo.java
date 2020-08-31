package chain;

import chain.logger.*;

public class Demo {
    public static void main(String[] args) {
        LoggerPipeline loggerPipeline = new LoggerPipeline();
        AbstractLogger logger = loggerPipeline.addLast(new ConsoleLogger())
                .addLast(new FileLogger())
                .addLast(new ErrorLogger()).getLogger();
        logger.logMsg(AbstractLogger.INFO, " INFO LEVEL");
        logger.logMsg(AbstractLogger.DEBUG, " DEBUG LEVEL");
        logger.logMsg(AbstractLogger.ERROR, " ERROR LEVEL");
    }
}
