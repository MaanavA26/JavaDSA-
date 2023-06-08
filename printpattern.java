/* WAP to print the following

*
**
***
****
*****
*/

public class printpattern {
    public static void main(String[] args) {
        pattern(5, 5);
    }
    static void pattern(int row, int star){
        if (row < 1){
            return ;
        }
        else if (star <= row){
            System.out.print("*");
            pattern(row, star+1);
        }

        else{
            System.out.println("");
            pattern(row-1, 1);
        }
        
    }
}
