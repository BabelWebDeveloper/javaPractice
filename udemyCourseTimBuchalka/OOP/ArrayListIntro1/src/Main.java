import java.util.ArrayList;
class intClass {
    private int myValue;

    public intClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        how to add primitive data types without autoboxing (we can't just assign intArray to ArrayList type <>):
        ArrayList<intClass> intClasses = new ArrayList<intClass>();
        intClasses.add(new intClass(54));

//        how to get around it:
        Integer integer = new Integer(54);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));//here is autoboxing
        }
//        for (int i = 0; i <= 10; i++){
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());//here is unboxing
//        }

//        some shortcut:
        Integer integer2 = 56; //is the same as - Integer.valueOf(56)
//        some explanation:
        int myInt = integer2;//is the same as - integer2.intValue() - give accesses to primitive int value of class Integer

//        example with double:
        ArrayList<Double> myDoubleArray = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5){//loop for assigning values to array list
            myDoubleArray.add(Double.valueOf(dbl));//autoboxing - primitive double into Class Double
        }
        for (int i = 0; i < myDoubleArray.size(); i++){
            double val = myDoubleArray.get(i).doubleValue();//returning double value - unboxing Class double into primitive double
            System.out.println(i + " --> " + val);
        }
    }
}
