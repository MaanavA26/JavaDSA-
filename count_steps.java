public class count_steps {
    public static void main(String[] args) {
        System.out.println(count(14));
    }

    static int count(int number){
        return helper(number, 0);
    }

    static int helper(int n, int c){
        if(n == 0){
            return c;
        }

        if (n % 2 == 0){
            return helper(n/2, c+1);
        }

        return helper(n-1, c+1);
    }
}