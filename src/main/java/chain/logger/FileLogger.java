package chain.logger;

public class FileLogger extends AbstractLogger{

    public FileLogger() {
        this.level = AbstractLogger.DEBUG;
    }

    @Override
    protected void write(String msg) {
        System.out.println("DEBUG: " + msg);
    }
}
