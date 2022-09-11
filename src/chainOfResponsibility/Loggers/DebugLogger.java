package chainOfResponsibility.Loggers;

public class DebugLogger extends Loggers{
    private Loggers nextLogger;

    @Override
    public void setNextLogger(Loggers nextLogger){
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(int type, String message) {
        if(type == Loggers.debug){
            System.out.println("Debug: "+message);
        }
        else{
            if(nextLogger != null){
                nextLogger.log(type, message);
            }
        }
    }
}
