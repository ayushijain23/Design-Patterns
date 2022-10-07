package composite.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private List<FileSystem> list;
    private String name;

    public Directory(String name) {
        this.list = new ArrayList<>();
        this.name = name;
    }

    public void addFiles(FileSystem fileSystem){
        list.add(fileSystem);
    }

    public void ls(){
        System.out.println("Directory Name : "+ name);
        for(FileSystem fs : list){
            fs.ls();
        }
    }
}
