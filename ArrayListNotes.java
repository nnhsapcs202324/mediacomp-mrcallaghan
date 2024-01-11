import java.util.ArrayList;

/**
 * Write a description of class ArrayListNotes here.
 *
 * @author mrcallaghan
 * @version 10jan2024
 */
public class ArrayListNotes
{
    public static void main(String[] args)
    {
         /*
         * The ArrayList is a Java Generic.
         * 
         * We have to specify the class type of the elements in angle brackets (i.e., <>) after
         *  every ArrayList identifier.
         *  
         *  Primitives (e.g., int, double, boolean) are not classes and cannot be specified as a type
         *      of teh element in a generic.  Instead, we can use corrensponding wrapper classes (e.g.,
         *      Boolean, Integer, Double).
         */
         ArrayList<Double> myList;
         myList = createRandomDoubleList(10, 20);
         System.out.println(myList);
         removeLessThan(myList, 10.0);
         System.out.println(myList);
    }
    
    /**
     * Creates and returns a reference to an ArrayList of the specified number of
     *      Double elements where each element is assigned a random value between
     *      1 and range.
     *      
     *  @param size     the number of Double elements to add to the list
     *  @param range    the range of random values to assign to each element [0, range)
     *  
     *  @return a reference to the newly created and initialized list
     */
    public static ArrayList<Double> createRandomDoubleList(int size, int range)
    {
        ArrayList<Double> list = new ArrayList<Double>();
        
        for(int i = 0; i < size; i++)
        {
            double value = Math.random() * range;
            
            /*
             * The add method adds the specified object to the end of the list.
             * 
             * Autoboxing:
             *  Primitive values are automatically converted to their corersponding
             *      wrapper class.  However, type promotion does not occur.
             */
            list.add(value);
            
            
        }
        
        return list;
    }
         
    
    /**
     * Removes even numbers from the specified list.
     * 
     * @param list  the list of number of potentially remove
     */
    public static void removeLessThan(ArrayList<Double> list, double limit)
    {
        /*
         * The size method returns the number of elements in the list.
         */
        //int n = list.size();
        for(int i = 0; i < list.size(); i++)
        {
            /*
             * The get method returns the value of the element at the specified index.
             */
            double value = list.get(i);
            if (value < limit)
            {
                /*
                 * The remove method deletes the element at the specified index from the list.
                 */
                list.remove(i);
                i--;
                
            }
        }
    }
    
    public static void removeLessThanAlt(ArrayList<Double> list, double limit)
    {
        for(int i = list.size() - 1; i >= 0; i--)
        {
            if(list.get(i) < limit)
            {
                list.remove(i);
            }
        }
    }
    
    public static double sumList(ArrayList<Double> list)
    {
        int sum = 0;
        
        
        
        return sum;
    }
}