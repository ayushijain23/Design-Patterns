package chainOfResponsibility.Loggers;

public abstract class Loggers {
    protected static int info = 1;
    protected static int debug = 2;
    protected static int error = 3;

    public abstract void setNextLogger(Loggers nextLogger);
    public abstract void log(int type, String message);
}
