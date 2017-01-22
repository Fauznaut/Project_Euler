package Problems_One_To_Ten;

/**
 * Created by Johnny on 1/21/2017.
 */
public class C_Largest_Prime_Factor {

    public static C_Largest_Prime_Factor LargestPrimeFactor = new C_Largest_Prime_Factor();

    public static int FactorNumber(int product) {
        int factorNumber = 0;
        for (int currentNumber = 1; currentNumber <= product; currentNumber++) {
            if (product % currentNumber == 0)
                factorNumber++;
        }
        return factorNumber;
    }

    public static int[] FactorList(int product, int productFactors) {
        int factors[] = new int[productFactors];
        for (int currentItem = 0; currentItem < factors.length; currentItem++) {
            for (int currentNumber = 1; currentNumber <= product; currentNumber++) {
                if (product % currentNumber == 0 && (currentItem == 0 || currentNumber > factors[currentItem - 1])) {
                    factors[currentItem] = currentNumber;
                    break;
                }
            }
        }
        return factors;
    }

    public static int LargestPrimeFactor(int[] factorList) {
        int largePrime = 0;
        boolean primeControl = false;
        for (int currentFactor = 0; currentFactor < factorList.length; currentFactor++) {
            for (int currentProduct = 2; currentProduct < factorList[currentFactor]; currentProduct++) {
                if (factorList[currentFactor] % currentProduct == 0) {
                    primeControl = false;
                    break;
                } else {
                    primeControl = true;
                }
            }
            if (primeControl && factorList[currentFactor] > largePrime)
                largePrime = factorList[currentFactor];
        }
        return largePrime;
    }
}
