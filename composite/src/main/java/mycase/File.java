package mycase;

/**
 * Created by Administrator on 2/3/2015.
 */
public class File implements Component{
    private String name;
    public File(String name){
        this.name = name;
    }
    @Override
    public void add(Component c) {
        System.out.println("can not add");
    }

    @Override
    public void remove(Component c) {
        System.out.println("can not remove");
    }

    @Override
    public void display(int depth) {
        System.out.println(this.name);
    }
}
