package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	 int value = 1;
     if (value == 1) {
         System.out.println("Value = 1");
     } else if (value == 2) {
         System.out.println("Value = 2");
     } else {
         System.out.println("Value was not 1 or 2");
     }

     int switchValue = 3;
     switch (switchValue) {
         case 1:
             System.out.println("Value switch = 1");
             break;
         case 2:
             System.out.println("Value switch = 2");
             break;
         case 3: case 4: case 5:
             System.out.println("Value switch was 3 ,4 or 5.");
             System.out.println("Actually was a " + switchValue);
             break;
         default:
             System.out.println("Value switch was not 1 or 2 or 3 or 4 or 5");
     }

//     Challange
        char switchChar = 'A';
        switch (switchChar) {
            case 'A':
                System.out.println("Value char = A");
                break;
            case 'B':
                System.out.println("Value char = B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value char was C ,D or E.");
                System.out.println("Actually was a " + switchChar);
                break;
            default:
                System.out.println("Value char was not A or B or C or D or E");
        }

//        To lower case:
        String month = "JaNUarY";
        switch (month.toLowerCase(Locale.ROOT)) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Not sure");
        }


    }
}
