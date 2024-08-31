package distributedApplications;

import java.rmi.Naming;

public class helloClient {
    public static void main(String[] args) {
        try {
            // Lookup the remote object
            hello remoteObject = (hello) Naming.lookup("rmi://localhost/joker");

            // Invoke remote method
            System.out.println(remoteObject.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
