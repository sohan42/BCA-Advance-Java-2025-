package Unit5;

import java.rmi.registry.*;

public class MClient {
    public static void main(String args[]){
        try{
            Registry r = LocateRegistry.getRegistry("localhost", 1099);
            MRemote stub = (MRemote) r.lookup("abc");
            System.out.println("Sum is: "+stub.sum(10, 20));
            System.out.println("Product is: "+stub.product(10, 20));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

//Write a client/server application in RMI to find the largest among three number.