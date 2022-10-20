public class Problem4BilanganPrima {
    private static boolean primeNumber(int number){
        if (number == 0 || number == 1){
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                   return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}