/* Find whether a given number is Prime or not using Recursion
*/

public class Prime
{
	public static void main(String[] args) {
		int n = 11;
		if(isPrime(n,2)){
		    System.out.print("Is Prime");
		}
		else {
		    System.out.print("Is Not Prime");
		}
	}
	
	static boolean isPrime (int n, int i){
	    if (i == n){
            return true;
        }
        if (n <=2 ){
	        return (n==2) ? true : false ;
	    }
	    
	    if (n % i ==0){
	        return false;
	    }
	    
	    return isPrime (n, i+1);
	}
}
