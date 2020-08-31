package chain.logger;

public class LoggerPipeline {
    private AbstractLogger logger;
    private AbstractLogger lastLogger;
    private Object objLock = new Object();

    public LoggerPipeline addLast(AbstractLogger logger){
        if(this.logger == null){
            this.logger = logger;
            this.lastLogger = logger;
        }else{
            this.lastLogger.setNextLogger(logger);
            this.lastLogger = logger;
        }
        return this;
    }

    public AbstractLogger getLogger() {
        return logger;
    }
}
