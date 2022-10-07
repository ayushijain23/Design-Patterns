package composite.problem;

public class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public void ls(){
        System.out.println("file is opening "+name);
    }
}
