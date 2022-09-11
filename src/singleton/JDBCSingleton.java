package singleton;

import java.util.Objects;

public class JDBCSingleton {
    //Example of Lazy Initialisation
    private static JDBCSingleton jdbcObj= null;
    private JDBCSingleton(){
        System.out.println("inside jdbc constructor");
    }

    public static JDBCSingleton getJdbcInstance() {
        if(jdbcObj == null) {
            synchronized (JDBCSingleton.class) {
                if (jdbcObj == null) {
                    System.out.println("instance Created");
                    jdbcObj = new JDBCSingleton();
                }
            }
        }
        return jdbcObj;
    }

    public String message(){
        return "You are Strong";
    }
}
