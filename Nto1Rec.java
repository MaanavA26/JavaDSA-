public class Nto1Rec {
    public static void main(String[] args) {
        int n = 14;
        printfun(n);
    }

    static void printfun(int n){
        if (n<=0){
            return ;
        }
        System.out.println(n);
        printfun(n-1);
    }
}
