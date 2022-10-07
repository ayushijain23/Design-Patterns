package composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String name;
    List<Object> objectList;

    public Directory(String s) {
        name = s;
        objectList = new ArrayList<>();
    }

    public void add(Object file){
        objectList.add(file);
    }

    public void ls(){
        for(Object obj : objectList){
            if(obj instanceof File){
                ((File) obj).ls();
            }
            else if(obj instanceof Directory){
                System.out.println("inside Directory");
                ((Directory) obj).ls();
            }
        }
    }

}
