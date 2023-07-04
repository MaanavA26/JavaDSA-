class count_zero{
    public static void main(String[] args) {
        System.out.println(count(120004));
    }

    static int count(int number){
        return helper(number, 0);
    }

    static int helper(int n, int count){
        if (n == 0){
            return count;
        }

        int rem = n % 10;
        if (rem == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}