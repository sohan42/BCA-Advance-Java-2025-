
package Unit5;

import java.rmi.registry.*;

public class MServer {
    public static void main(String args[]){
        try{
             MRemoteObject obj = new MRemoteObject();
            Registry r = LocateRegistry.createRegistry(1099);
            r.bind("abc", obj);
            System.out.println("Server is online...");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
