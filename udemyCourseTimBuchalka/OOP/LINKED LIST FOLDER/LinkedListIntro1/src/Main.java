import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;//reference to customer
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        intList.add(1,2);//adding to index 1 element: 2 - doesn't delete the previous element, just move it down
        System.out.println();
        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
//        every element in linked list hold a link to next and previous elements
    }
}

//java figure out which physical memory address is used to store data in linked list by adding 4 bytes to initial address index, f.e based address index is 100 matched to main index of 0, if we want to look for index of 3 java calculate 3 * 4 = 12 and add it to 100, so address index for index of 3 is 112
