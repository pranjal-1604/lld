package SingletonDesignPattern;

public class Logger {
    public static Logger logger = null;
    private Logger(){}
    public static Logger getInstance(){
        synchronized (Logger.class) {
            if (logger == null) {
                logger = new Logger();
            }
        }
        return logger;
    }
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
