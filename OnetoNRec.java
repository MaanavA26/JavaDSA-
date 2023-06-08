public class OnetoNRec {
    public static void main(String[] args) {
        int n = 14;
        printfun(n, 0);
    }

    static void printfun(int n, int i){
        if (i==n+1){
            return ;
        }
        System.out.println(i);
        printfun(n, i+1);
    }
}
