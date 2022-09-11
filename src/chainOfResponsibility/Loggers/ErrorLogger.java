package chainOfResponsibility.Loggers;

public class ErrorLogger extends Loggers{
    private Loggers nextLogger;

    @Override
    public void setNextLogger(Loggers nextLogger){
        this.nextLogger = nextLogger;
    }
    @Override
    public void log(int type, String message) {
        if(type == Loggers.error){
            System.out.println("Error: "+message);
        }
        else{
            if(nextLogger != null){
                nextLogger.log(type, message);
            }
        }
    }
}
