import java.util.ArrayList;

public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);

        // a) Invoke add() to enter the following names in sequence: Alice, Bob, Connie, David,
        //      Edward, Fran, Gomez, Harry. Print the ArrayList again.
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println("a) " + names);
        
        // b) Invoke get() twice to retrieve and print the first name in the list and the last name
        //      in the list.
        String firstNameInList = names.get(0);
        String lastNameInList = names.get(7);
        System.out.println("b) first name in list: " + firstNameInList +
                "; lastname in list: " + lastNameInList);
        
        // c) Print the size() of the ArrayList.
        System.out.println("c) size of list: " + names.size());
        
        // d) Use size() to help you print the last name in the list.
        lastNameInList = names.get(names.size() - 1);
        System.out.println("d) lastname in list: " + lastNameInList);
        
        // e) Use set() to change ?Alice? to ?Alice B. Toklas?. Print the ArrayList to verify the
        //      change.
        names.set(0, "Alice B. Toklas");
        System.out.println("e) " + names);
        
        // f) Use the alternate form of add() to insert ?Doug? after ?David?. Print the ArrayList
        //      again.
        names.add(4, "Doug");
        System.out.println("f) " + names);
        
        // g) Use an enhanced for loop to print each name in the ArrayList.
        System.out.println("g)");
        
        /*
         * Use variable names that represent the values they contain. name is a good variable
         *  name (note the use of the singular form for the loop varaible and the plural form
         *  for the list variable). i is not a good variable name as it typically represents
         *  an index and not a value.
         */
        for (String name : names)
        {
            System.out.println(name);
        }
        
        // h) Create a second ArrayList called names2 that is built by calling the ArrayList
        //      constructor that accepts another ArrayList as an argument. Pass names to the
        //      constructor to build names2. Then print the ArrayList.
        
        /*
         * Please note that we are creating a second array list, but we are not creating any
         *      additional string objects. The values of the elements in both array lists
         *      reference the same string objects.
         *      
         *  If we wanted to clone the array list, we would have to create a new empty array
         *      list and then use a loop to create new objects and add their references to the
         *      new list.
         *      
         *  In this particular case, since string objects are immutable, it doesn't matter.
         *      However, for any other class type, it definitely does!
         */
        ArrayList<String> names2 = new ArrayList(names);
        System.out.println("h) " + names2);
        
        // i) Call names.remove(0) to remove the first element. Print names and names2.
        //      Verify that Alice B. Toklas was removed from names, but not from names2.
        names.remove(0);
        System.out.println("i) names: " + names);
        System.out.println("\tnames2: " + names2);
    }
} 