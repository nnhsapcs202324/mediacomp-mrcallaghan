import java.util.ArrayList;

/**
 * Write a description of class Store here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Store
{
    private ArrayList<Customer> customers;

    /**
     * Constructor for objects of class Store
     */
    public Store()
    {
        this.customers = new ArrayList<Customer>();
    }

    public void addSale(String customerName, double amount)
    {
        Customer newCustomer = new Customer(customerName, amount);
        this.customers.add(newCustomer);
    }

    public String nameOfBestCustomer()
    {
        Customer bestCustomer = null;
        double maxAmountSpent = 0.0;

        for(Customer customer : this.customers)
        {
            if(customer.getAmountSpent() > maxAmountSpent)
            {
                maxAmountSpent = customer.getAmountSpent();
                bestCustomer = customer; 
            }
        }
        
        // or
        
        for(int i = 0; i < this.customers.size(); i++)
        {
            Customer customer = this.customers.get(i);
            if(customer.getAmountSpent() > maxAmountSpent)
            {
                maxAmountSpent = customer.getAmountSpent();
                bestCustomer = customer; 
            }
        }

        return bestCustomer.getName();
    }
}