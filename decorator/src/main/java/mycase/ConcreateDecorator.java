package mycase;

/**
 * Created by Administrator on 2/3/2015.
 */
public class ConcreateDecorator extends Decorator {
    public ConcreateDecorator(Component component) {
        super(component);
    }
    @Override
    public void operate(){
        super.operate();
        this.addOperate();
    }
    private void addOperate(){
        System.out.println("add");
    }
}
