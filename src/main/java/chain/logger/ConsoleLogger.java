package chain.logger;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(){
        this.level = AbstractLogger.INFO;
    }
    protected void write(String msg) {
        System.out.println("CONSOLE: " + msg);
    }
}
