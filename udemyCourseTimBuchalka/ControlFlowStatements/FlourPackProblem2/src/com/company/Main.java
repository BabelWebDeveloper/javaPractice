package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(FlourPacker(-3,2,11));
    }

    public static boolean FlourPacker(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        else {

            int bigTotal = bigCount * 5;
            int smallTotal = smallCount;

            if (bigTotal + smallTotal == goal){
                return true;
            }

            else {

                while (bigTotal % goal != 0 && bigTotal > goal){
                    System.out.println("Big total");
                    System.out.println(bigTotal);
                    bigTotal -=5;
                }

                if (bigTotal + smallTotal == goal){
                    return true;
                }

                else {

                    while (bigTotal + smallTotal > goal){/*tutaj istotny błąd*/
                        System.out.println("Small total");
                        smallTotal--;
                    }

                    if (bigTotal + smallTotal == goal){
                        return true;
                    }

                    else {
                        return false;
                    }
                }
            }
        }
    }
}
