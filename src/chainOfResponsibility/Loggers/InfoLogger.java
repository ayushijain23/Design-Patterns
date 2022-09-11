package chainOfResponsibility.Loggers;

public class InfoLogger extends Loggers{

    private Loggers nextLogger;

    @Override
    public void setNextLogger(Loggers nextLogger){
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(int type, String message) {
        if(type == Loggers.info){
            System.out.println("Info: "+message);
        }
        else{
            if(nextLogger != null){
                nextLogger.log(type, message);
            }
        }
    }
}
