package Proxy;
/*
Proxy class implements same interface.
And calls the implemented class method. So istead of calling implementation class method directly,
 proxy is used to call them.

 Used in - preprocessing & postprocessing
           Logging & events
           for Security & Access
 */
public class MainApplication {
    public static void main(String[] args) {
        StudentOperations studentData = new StudentProxy();
        //testing saving
        try {
            studentData.save("Admin", new Student(1, "Ayushi"));
            studentData.save("localUser", new Student(2, "Ajay"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //testing deletion
        try{
            studentData.delete("SuperAdmin", 1);
            studentData.delete("Admin", 1);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
