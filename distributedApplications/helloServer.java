package distributedApplications;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class helloServer {
    public static void main(String[] args) {
        try {
            // Create and export a remote object
            helloImpl localObject = new helloImpl();

            // Create RMI registry on default port
            LocateRegistry.createRegistry(1099);

            // The RMI runtime creates a Stub for this object registered under the name
            // "joker".
            // When a client later performs a lookup using
            // Naming.lookup("rmi://localhost/joker"), they receive a reference to this
            // Stub, not the actual helloImpl object.

            Naming.rebind("rmi:///joker", localObject);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
