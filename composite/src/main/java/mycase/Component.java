package mycase;

/**
 * Created by Administrator on 2/3/2015.
 */
public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public void display(int depth);
}
