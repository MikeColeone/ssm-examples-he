package org.example.ioc_01;

public class DefaultServiceLocator {
    private static final ClientServiceImpl clientServiceImpl = new ClientServiceImpl();
    public ClientServiceImpl createClientServiceinstance(){
        return clientServiceImpl;
    }
}
