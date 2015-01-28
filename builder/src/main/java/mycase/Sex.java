package mycase;

/**
 * Created by Administrator on 1/28/2015.
 */
public enum Sex {
    MALE, FAMALE;
    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
