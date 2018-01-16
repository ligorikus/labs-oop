package lab5;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CashDeskMain{
	public static void main(String[] args) throws InterruptedException {
        List<Cashier> cashiers = new LinkedList<>();
        Queue<Customer> customers = new LinkedList<Customer>();

        for (int i = 0; i < 3; i++) {
            cashiers.add(new Cashier("Cashier "+ i, customers));
        }

        for (int i = 0; i < 10; i++) {
            synchronized (customers) {
                customers.add(new Customer("Customer " + i, 1 + (int) (9 * Math.random())));
                customers.notifyAll();
            }
        }

        synchronized (customers){
            while (!customers.isEmpty()){
                customers.wait();
            }
        }

        System.out.println("All customers have been served");


	}
}
