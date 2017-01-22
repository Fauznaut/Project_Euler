package Problems_One_To_Ten;

/**
 * Created by Johnny on 1/21/2017.
 */
public class A_Multiples_Of_3_and_5 {

    public static A_Multiples_Of_3_and_5 Mult3And5 = new A_Multiples_Of_3_and_5();

    public static int MultiplesOfThreeAndFiveSum(int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }
}
