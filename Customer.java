
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private double amountSpent;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String initialName, double initialAmountSpent)
    {
        this.name = initialName;
        this.amountSpent = initialAmountSpent;
    }

    public String getName()
    {
        return this.name;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public double getAmountSpent()
    {
        return this.amountSpent;
    }
    
    public void setAmountSpent(double newAmountSpent)
    {
        this.amountSpent = newAmountSpent;
    }
}