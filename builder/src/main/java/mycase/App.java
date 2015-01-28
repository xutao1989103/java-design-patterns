package mycase;

/**
 * Created by Administrator on 1/28/2015.
 */
public class App {
    public static void main(String[] args){
        Boss.BossBuilder bossBuilder = new Boss.BossBuilder(Sex.FAMALE);
        bossBuilder.withHairType(HairType.BLACK);
        bossBuilder.withTitle(Title.CEO);
        Boss boss = bossBuilder.Build();

        Boss xt = new Boss.BossBuilder(Sex.FAMALE).withHairType(HairType.RED).withTitle(Title.CEO).Build();
    }
}
