package mycase;

/**
 * Created by Administrator on 1/27/2015.
 */
public class MyAbstactFactoryTest {
    public static void main(String[] args){
        createCompany(new ITCompanyFactory());
    }
    public static void createCompany(CompanyFactory companyFactory){
        Boss boss = companyFactory.createBoss();
        System.out.println(boss.toString());
        Workers workers = companyFactory.HireWorkers();
        System.out.println(workers.toString());
        WorkPlace workPlace = companyFactory.findWorkPlace();
        System.out.println(workPlace.toString());
    }
}
