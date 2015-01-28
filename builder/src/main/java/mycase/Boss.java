package mycase;

/**
 * Created by Administrator on 1/28/2015.
 */
public class Boss {
    private final Sex sex;
    private final HairType hairType;
    private final Title title;

    public Boss(BossBuilder bossBuilder){
        this.sex = bossBuilder.sex;
        this.hairType = bossBuilder.hairType;
        this.title = bossBuilder.title;
    }


    public static class BossBuilder{
        private final Sex sex;
        private  HairType hairType;
        private  Title title;

        public BossBuilder(Sex sex){
            if (sex == null) {
                throw new NullPointerException(
                        "sex can not be null");
            }
            this.sex = sex;
        }

        public BossBuilder withHairType(HairType hairType){
            if(hairType == null){
                throw new NullPointerException(
                        "hairType can not be null");
            }
            this.hairType = hairType;
            return this;
        }

        public BossBuilder withTitle(Title title){
            if(title == null){
                throw new NullPointerException("title can not be null");
            }
            this.title = title;
            return this;
        }

        public Boss Build(){
            return new Boss(this);
        }
    }

}
