import java.io.Serializable;
import java.rmi.Naming;


public class CalculatorClient implements Serializable {
    public static void main(String[] args) throws Exception {
        CalculatorInterface c;

       try{
           c = (CalculatorInterface) Naming.lookup("rmi://localhost:1099/CalculatorImpl");



           System.out.println(c.sub(3,4));
           System.out.println(c.add(5,2));
           System.out.println(c.mul(3,2));
           System.out.println(c.div(9,3));
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
