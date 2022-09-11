package singleton;

public class LoggerClass {
    //make contructor private
    //Example of Early Initialisation
    private static LoggerClass logger = new LoggerClass();
    private LoggerClass(){
      System.out.println("inside constructor");
    }

    public static LoggerClass getInstance(){
        return logger;
    }

    public void printSomething(){
        System.out.println("you are beautiful");
    }
}
