package composite.problem;
/*
here we dont know type of onject, hence need to use instance of
 */
public class Main {
    public static void main(String[] args) {
        File scienceNotes = new File("Science");

        Directory dir = new Directory("Class 10");
        dir.add(new File("Maths"));

        Directory dir2 = new Directory("class 12");
        dir2.add(new File("Physics"));
        dir2.add(dir);
        dir2.add(scienceNotes);

        dir2.ls();

    }
}
