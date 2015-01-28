package mycase;

/**
 * Created by Administrator on 1/28/2015.
 */
public enum HairType {
    BLACK,RED,WHITE;
    @Override
    public String toString(){
        return name().toLowerCase();
    }
}
