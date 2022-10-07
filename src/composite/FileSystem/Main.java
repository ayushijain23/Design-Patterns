package composite.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory mainDirectory = new Directory("Main Directory");

        FileSystem veerzara = new File("Veer-zaara");
        Directory comedyMovies = new Directory("Comedy Movies");
        FileSystem welcome = new File("Welcome");

        comedyMovies.addFiles(welcome);
        mainDirectory.addFiles(veerzara);
        mainDirectory.addFiles(comedyMovies);

        mainDirectory.ls();
    }
}
