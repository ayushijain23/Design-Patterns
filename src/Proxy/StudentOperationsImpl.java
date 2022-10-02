package Proxy;

public class StudentOperationsImpl implements StudentOperations{

    @Override
    public void save(String user, Student student) {
        System.out.println("Student is saved");
    }

    @Override
    public void delete(String user, int id) {
        System.out.println("Student with "+id+" is deleted");
    }
}
