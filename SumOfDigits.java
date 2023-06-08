public class SumOfDigits {
    public static void main(String[] args) {
        sod(365, 0);
    }

    static void sod (int num, int sum){
        if(num==0){
            System.out.println("Sum "+sum);
            return ; 
        }
        int singleDigit = num % 10;
        sum = sum + singleDigit;
        sod(num/10, sum);
    }
}