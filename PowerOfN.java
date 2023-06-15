public class PowerOfN {
    public static void main(String[] args) {
        System.out.println(func(1, 5, 1));
    }

    public static int func(int n, int i, int answer) {
        if (i<=0){
            return answer;
        }
        
        if (n <= 0){
            return -1;
        }

        answer = answer * n;
        
        return func(n, i-1, answer);
    }
    }

