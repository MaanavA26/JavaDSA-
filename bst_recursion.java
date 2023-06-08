/* Binary search tree using recursion
*/

public class bst_recursion {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 55, 66};
        int target = 77;
        System.out.println(bst(arr, target, 0, arr.length));
    }

    static int bst (int arr[], int target, int s, int e){
        if(s > e){
            return -1;
        }

        int m = s + (e-s)/2 ;

        if (arr[m] == target){
            return m;
        }

        if(target > arr[m]){
            return bst(arr, target, m+1, e);
        }

        else{
            return bst(arr, target, s, m-1);
        }
    }
}
