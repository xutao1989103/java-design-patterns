package mycase;

/**
 * Created by Administrator on 2/3/2015.
 */
public class Decorator implements Component {
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void operate() {
        component.operate();
    }
}
