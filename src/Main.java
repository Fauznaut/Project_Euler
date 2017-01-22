import Problems_One_To_Ten.B_Even_Fibonacci_Numbers;
import Problems_One_To_Ten.C_Largest_Prime_Factor;

import java.util.Scanner;

/**
 * Created by Johnny on 1/21/2017.
 */
public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int limit = scan.nextInt();
        System.out.println(C_Largest_Prime_Factor.LargestPrimeFactor(C_Largest_Prime_Factor.FactorList(limit, C_Largest_Prime_Factor.FactorNumber(limit))));
    }
}