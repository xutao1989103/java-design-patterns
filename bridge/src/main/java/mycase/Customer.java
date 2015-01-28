package mycase;

/**
 * Created by Administrator on 1/28/2015.
 */
public abstract class Customer {
    public CustomerImpl impl;
    public abstract void visit();
    public CustomerImpl getImpl() {
        return impl;
    }
    public Customer(CustomerImpl impl){
        this.impl = impl;
    }
    public Customer(){

    }
}
