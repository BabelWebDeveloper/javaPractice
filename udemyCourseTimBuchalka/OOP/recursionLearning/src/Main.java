import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    //    recursion(1);
//        System.out.println(reverseString("Hello"));
//        System.out.println(isPalindrome("racecar"));
//        String binary = findBinary(233,"");
//         int result = recursiveSummation(5);
//         System.out.println(result);
        recursion2(1);

    }


//    RECURSION:
//     public static void recursion(int value){
//         if (value == 10){
//             return;
//         }
//         System.out.println("Before: " + value);
//         recursion(value + 1);//recursion repeat everything above recursion calling and then below back to the same value, this is known as "Call stack" so first code have to do everything to the end of recursion (this example when value == 10) and then back to initial value
// //        method return final value after do all orders
//         System.out.println("After: " + value);
//     }

//    RECURSION2:
    public static void recursion2(int value){
        // Breakpoint:
        if (value == 5){
            System.out.println("Max number of tasks per employee reached, now you start work from the closest task.");
            return;
        }
        System.out.println("The boss giving you task nr: " + value);
        recursion2(value + 1);//everyhing from method is doing form to this point, after brakpoint everything is done below recursion calling from the lastest to the oldest
        System.out.println("Task nr: " + value + " is done.");
    }


//    REVERSE STRING:
//     public static String reverseString(String input){
// //        What is the base case? - When can I no longer continue? :
//         if (input.equals("")){
//             return "";
//         }
// //        What is the smallest amount of work I can do in each iteration? - Between each invocation, what is the small unit I can reverse? :
//         return reverseString(input.substring(1)) + input.charAt(0);//at first iteration we create string of every letter without first (zero index) by substring + first letter (zero index) by charAt, so in first iteration if we pass in the beginning "hello", in recursion call we pass "ello" + "h" = "elloh"

// //        reverseString(input.substring(1)) - shrink the problem space
// //        input.charAt(0) - the smallest unit of work to contribute

// //        when recursion stop, in call stack we have "olleH" and it is returned below the recursion call
// //        Metoda substring zwraca wybrany fragment ciągu znaków o podanym zakresie indeksów.
// //        Metoda charAt zwraca znak znajdujący się pod wskazanym indeksem. W przypadku przekroczenia zakresu indeksu wyrzuci wyjątek: StringIndexOutOfBoundsException.
//     }


//    IS PALINDROME:
//     public static boolean isPalindrome(String input){
// //        Define the base-case / stopping condition
//         if (input.length() == 0 || input.length() == 1){
//             return true;
//         }

// //        Do some work to shrink the problem space
//         if (input.charAt(0) == input.charAt(input.length() - 1)){
//             return isPalindrome(input.substring(1,input.length() - 1));
//         }

// //        If not palindrome
//         return false;
//     }


// FIND BINARY:
//    public static String findBinary(int decimal, String result){
//        if (decimal == 0){
//            return result;
//        }
//
//        result = decimal % 2 + result;//przypisanie do result reszty z dzielenia -> result = reszta z dzielenia + poprzedni result
//        // czyli w miejscu decimal % 2 mogłoby być multiplication of two elements in array
//        // if i == 0 -> result = array[i]
//        // if length <= 2 -> result = array[i] + result
//        return findBinary(decimal / 2, result);
//    }


//    RECRSIVE SUMMATION:
//    //    TUTAJ NIEŹLE I KRÓTKO OPISANE:
//    public static int recursiveSummation(int inputNumber){
//        if(inputNumber <= 1){
//            return inputNumber;//gdy następuje brakpoint poniższy return pobiera wartości inputNumber z call stacka i je sumuje
//        }
//        return inputNumber + recursiveSummation(inputNumber - 1);//wywołanie metody i wrzucenie wartości do call stack
//    }
}
