package distributedApplications;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implement the remote interface
public class helloImpl extends UnicastRemoteObject implements hello {

    protected helloImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello, World!";
    }
}
