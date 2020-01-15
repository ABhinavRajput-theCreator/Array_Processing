package Task1;
import java.util.Scanner;


public class ArrayProcessing {

    public static void main(String[] args) {

        int[] arrInt = new int[10];                                                                     // create an array to store integer
        System.out.print("Default value of an array :   ");
        System.out.print(arrInt[0]);
        for (int i = 1; i < arrInt.length; i++) {
            System.out.print(", " + arrInt[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");


        int option = 0;
        Scanner objsc = new Scanner(System.in);
        System.out.println("Options :   ");
        System.out.println("For static initialization of array, press:  1 ");
        System.out.println("For command line initialization of array, press:  2 ");
        System.out.println("For user initialization of array, press:  3  ");
        System.out.println("");
        System.out.println("");

        option = objsc.nextInt();





        if (option == 1) {
            int increment = 1050;
            for (int p = 0; p < 10; p++) {
                arrInt[p] = increment;                                                                // static initialization of array
                increment = increment + 632;
            }


            System.out.println("Static value of an array :  ");
            System.out.print(arrInt[0]);
            for (int i = 1; i < arrInt.length; i++) {
                System.out.print(", " + arrInt[i]);                                                    // print the array.
            }
        }






        else if (option == 2) {
            for (int i = 0; i < args.length && i < arrInt.length; i++) {
                arrInt[i] = Integer.parseInt(args[i]);                                          // command line initialization of array
            }


            System.out.println("Array initialize by command line value :  ");
            System.out.print(arrInt[0]);
            for (int i = 1; i < arrInt.length; i++) {
                System.out.print(", " + arrInt[i]);
            }
        }






        else if (option == 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 10 integers :  ");                                     // user initialization of array using scanner class
            for (int i = 0; i < arrInt.length; i++) {
                arrInt[i] = sc.nextInt();
            }
            System.out.println("");
            System.out.println("Array initialized by user :  ");
            System.out.print(arrInt[0]);
            for (int i = 0; i < arrInt.length; i++) {
                System.out.print(", " + arrInt[i]);
            }
        }







        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");






        int OP = 0;
        System.out.println("To print sum, press 1  ");
        System.out.println("To print avg, press 2  ");
        Scanner obj2 = new Scanner(System.in);
        OP = obj2.nextInt();




        if (OP == 1) {
            double Sum = 0;
            for (int i = 0; i < arrInt.length; i++) {
                Sum = Sum + arrInt[i];                                                                      //Sum  of all elements
            }
            System.out.println("The Sum of the given array :  " + Sum);
        }




        else if (OP == 2) {
            double Sum = 0;
            for (int i = 0; i < arrInt.length; i++) {
                Sum = Sum + arrInt[i];                                                                      //Sum  of all elements
            }
            double avg = (double) Sum / 10;
            System.out.println("The avg values  :  " + avg);                                               //Avg  of all elements
        }




        
    }
}