package interfaces;
import java.util.ArrayList;

public interface ICustomer {
   String getName();
   ArrayList<Double> getTansactions();
   void addTansaction(double transaction);

}
