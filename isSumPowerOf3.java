public class isSumPowerOf3 {
    public static boolean checkPowersOfThree(int n){
        if (n == 0){
            return true;
        }
        if (n <= 0){
            return false;
        }

        if (n % 3 == 2 ) {
            return false;
        }
        return checkPowersOfThree(n/3);
    }

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(81));
    }
}
