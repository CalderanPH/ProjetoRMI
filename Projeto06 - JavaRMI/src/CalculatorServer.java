import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;


public class CalculatorServer {
    public CalculatorServer() {
        try{
            System.setProperty("java.rmi.server.hostname", "localhost");
            LocateRegistry.createRegistry(1099);
            CalculatorImpl c = new CalculatorImpl();
            Naming.bind("CalculatorImpl", (Remote) c);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception{
        new CalculatorServer();

    }
}
