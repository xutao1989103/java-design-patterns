package mycase;

/**
 * Created by Administrator on 1/28/2015.
 */
public enum Title {
    CEO,CFO,CIO;
    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
