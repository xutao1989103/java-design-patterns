package mycase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2/3/2015.
 */
public class FileFolder implements Component {
    private List<Component> files = new ArrayList<Component>();
    private String name;
    public FileFolder(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        this.files.add(c);
    }

    @Override
    public void remove(Component c) {
        this.files.remove(c);
    }

    @Override
    public void display(int depth) {
        String sketon = "";
        for(int i = 0; i < depth; i++){
            sketon += "-";
        }
        System.out.println(sketon + name);
        for(Component c : files){
            c.display(depth + 2);
        }
    }
}
