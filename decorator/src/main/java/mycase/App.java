package mycase;

/**
 * Created by Administrator on 2/3/2015.
 */
public class App {
    public static void main(String[] args){
        Component concreateDecorator = new ConcreateDecorator(new ConcreateComponent());
        concreateDecorator.operate();
    }
}
