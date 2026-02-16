
package Unit5;

import java.rmi.*;

public interface MRemote extends Remote{
    public int sum(int a, int b) throws RemoteException; 
    public int product(int a, int b) throws RemoteException; 
}
