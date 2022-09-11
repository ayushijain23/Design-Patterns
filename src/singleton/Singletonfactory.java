package singleton;

public class Singletonfactory {
    public static void main(String arg[]){
        LoggerClass early = LoggerClass.getInstance();
        early.printSomething();

        JDBCSingleton jdbcSingleton1 = JDBCSingleton.getJdbcInstance();
        System.out.println(jdbcSingleton1.message());

        JDBCSingleton jdbcSingleton2 = JDBCSingleton.getJdbcInstance();
        System.out.println(jdbcSingleton2.message());
    }
}
