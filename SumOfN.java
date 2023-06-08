public class SumOfN {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        abc(n, sum);
    }

    static void abc (int n, int sum){
        sum = sum + n;
        if (n<=0){
            System.out.println(sum);
            return ;
        }
        abc(n-1, sum);
        
    }
}
