import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try{
            String ServerURL = "rmi://" + args[0] + "/Server";
            ServerIntf ServerIntf = (ServerIntf)Naming.lookup(ServerURL);
            System.out.println("The first number is: " + args[1]);
            double d1 = Double.valueOf(args[1]).doubleValue();
            System.out.println("The second number is: " + args[2]);
            double d2 = Double.valueOf(args[2]).doubleValue();
            System.out.println("The sum is: " + ServerIntf.add(d1, d2));
        } catch(Exception e) {
            System.out.println("Exception " + e);
        }
        

    }
}
