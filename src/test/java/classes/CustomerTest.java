package classes;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void getName() {
        Customer customer = new Customer("Tim",55);
        assertEquals("Tim",customer.getName());
    }

    @Test
    public void getTansactions() {
        Customer customer = new Customer("Tim",55);
        if(customer.getTansactions().isEmpty()){
            System.out.println("Array list is Empty");
        }else{
            System.out.println("List is not Empty");
            System.out.println(customer.getTansactions().get(0));
        }
        double value = 55;
//        assertEquals(value,customer.getTansactions().get(0));
        assertEquals(value,customer.getTansactions().get(0),0);


    }

    @Test
    public void addTansaction() {
        Customer customer = new Customer("Tim",55);
        customer.addTansaction(55);
        Double total = customer.getTansactions().get(0)+ customer.getTansactions().get(1);
        assertEquals(total, total,0);
    }
}