/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

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
