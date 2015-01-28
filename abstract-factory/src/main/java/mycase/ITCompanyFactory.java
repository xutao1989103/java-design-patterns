package mycase;

/**
 * Created by Administrator on 1/27/2015.
 */
public class ITCompanyFactory implements CompanyFactory {
    @Override
    public Boss createBoss() {
        return new ITBoss();
    }

    @Override
    public WorkPlace findWorkPlace() {
        return new ITWorkPlace();
    }

    @Override
    public Workers HireWorkers() {
        return new ITWorkers();
    }
}
