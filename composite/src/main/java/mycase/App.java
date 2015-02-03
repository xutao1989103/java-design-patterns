package mycase;

/**
 * Created by Administrator on 2/3/2015.
 */
public class App {
    public static void main(String[] args){
        Component root = new FileFolder("C:\\");
        Component programs = new FileFolder("Program Files");
        programs.add(new File("360杀毒"));
        programs.add(new File("Office 2007"));
        programs.add(new File("Movie Maker"));
        Component windows = new FileFolder("Windows");
        windows.add(new File("system"));
        windows.add(new File("system32"));
        windows.add(new File("temp"));
        Component autoexec = new File("AUTOEXEC.BAT");
        Component boot = new File("boot.ini");
        root.add(programs);
        root.add(windows);
        root.add(autoexec);
        root.add(boot);
        root.display(0);
    }
}
