package chain.logger;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger() {
        this.level = AbstractLogger.ERROR;
    }

    @Override
    protected void write(String msg) {
        System.out.println("ERROR: " + msg);
    }
}
