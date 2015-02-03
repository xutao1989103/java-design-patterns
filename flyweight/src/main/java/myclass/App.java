package myclass;

/**
 * Created by Administrator on 2/3/2015.
 */
public class App {
    public static void main(String[] args){
        PhoneFactory factory = new PhoneFactory();
        Phone iPhone1 = factory.createPhone(PhoneEnum.APPLE);
        iPhone1.call();
        Phone iPhone2 = factory.createPhone(PhoneEnum.APPLE);
        iPhone2.call();
    }
}
