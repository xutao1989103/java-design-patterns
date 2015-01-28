package mycase;

/**
 * Created by Administrator on 1/27/2015.
 */
public interface CompanyFactory {
    public Boss createBoss();
    public WorkPlace findWorkPlace();
    public Workers HireWorkers();
}
