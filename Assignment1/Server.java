import java.rmi.*;

public abstract class Server {
    public static void main(String[] args) {
        try{
            ServerImpl ServerImpl = new ServerImpl();
            Naming.bind("Server", ServerImpl);    
        } catch(Exception e) {
            System.out.println("Exception " + e);
        }        
    }    
}
