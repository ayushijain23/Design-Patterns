package chainOfResponsibility.Loggers;

public class MainLogging {
    private static Loggers logger;
    private static void setupLoggersChain(){
        logger = new InfoLogger();
        Loggers debugLogger = new DebugLogger();
        Loggers errorLogger = new ErrorLogger();
        logger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(null);
    }

    public static void main(String[] args) {
       setupLoggersChain();
       logger.log(Loggers.info, "Just for information");
       logger.log(Loggers.error, "oh no ! Error again");
       logger.log(Loggers.debug,"developers love debugginggg");
        logger.log(4, "developers love debugging");
    }
}
