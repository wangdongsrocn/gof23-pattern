package org.learn.business_delegate;

public class EJBService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB service");
    }
}
