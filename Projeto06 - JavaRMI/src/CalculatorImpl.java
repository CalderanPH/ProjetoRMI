import java.io.Serial;
import java.rmi.RemoteException;


public class CalculatorImpl extends  java.rmi.server.UnicastRemoteObject implements CalculatorInterface{

    @Serial
    private static final long serialVersionUID = 1L;

    public CalculatorImpl() throws java.rmi.RemoteException{
        super();
    }

    @Override
    public long add(long a, long b) throws RemoteException {
        System.out.println(a + "+" + b + "=" + (a+b));
        return a+b;
    }

    @Override
    public long sub(long a, long b) throws RemoteException {
        System.out.println(a + "-" + b + "=" + (a-b));
        return a-b;
    }

    @Override
    public long mul(long a, long b) throws RemoteException {
        System.out.println(a + "*" + b + "=" + (a*b));
        return a*b;
    }

    @Override
    public long div(long a, long b) throws RemoteException {
        System.out.println(a + "/" + b + "=" + (a/b));
        return a/b;
    }
}
