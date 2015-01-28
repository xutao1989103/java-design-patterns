package mycase;

/**
 * Created by Administrator on 1/28/2015.
 */
public class BigCustomer extends Customer {

    @Override
    public void visit() {
        getImpl().visit();
    }
    @Override
    public BigCustomerImpl getImpl(){
        return (BigCustomerImpl) impl;
    }

    public BigCustomer(BigCustomerImpl bigCustomerImpl){
        super(bigCustomerImpl);
    }
}
