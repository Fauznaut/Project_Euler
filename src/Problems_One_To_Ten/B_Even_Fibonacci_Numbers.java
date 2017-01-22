package Problems_One_To_Ten;

/**
 * Created by Johnny on 1/21/2017.
 */
public class B_Even_Fibonacci_Numbers {

    public static B_Even_Fibonacci_Numbers EvenFibNums = new B_Even_Fibonacci_Numbers();

    public static int EvenFibonacciSum(int limit) {
        int sum = 0, numberLast = 0, numberCurrent = 1;
        while (numberCurrent < limit) {
            numberCurrent += numberLast;
            if (numberCurrent % 2 == 0)
                sum += numberCurrent;
            numberLast = numberCurrent - numberLast;
        }
        return sum;
    }
}