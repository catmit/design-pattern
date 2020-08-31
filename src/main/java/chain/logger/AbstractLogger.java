package chain.logger;

public abstract class AbstractLogger {

    public static final int INFO = 0;
    public static final int DEBUG = 1;
    public static final int ERROR = 2;

    protected int level;
    protected AbstractLogger nextLogger;

    public void logMsg(int level, String msg){
        if(level <= this.level){
            write(msg);
        }else{
            nextLogger.logMsg(level, msg);
        }
    }

    protected AbstractLogger setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
        return this.nextLogger;
    }

    abstract protected void write(String msg);
}
