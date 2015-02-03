package myclass;

import java.util.EnumMap;

/**
 * Created by Administrator on 2/3/2015.
 */
public class PhoneFactory {
    private EnumMap<PhoneEnum, Phone> phones = new EnumMap(PhoneEnum.class);
    public Phone createPhone(PhoneEnum phoneEnum){
        Phone phone = phones.get(phoneEnum);
        if(phone == null){
            switch (phoneEnum){
                case APPLE:
                    phone = new ApplePhone();
                    phones.put(PhoneEnum.APPLE, phone);
                    break;
                case MEIZU:
                    phone = new MeizuPhone();
                    phones.put(PhoneEnum.MEIZU, phone);
                    break;
                default:
                    break;
            }
        }
        return phone;
    }
}
