import java.util.*;
class Solution {
	static int factorial(int n) {
        if(n==0) return 1;
        int partialAns = factorial(n-1);
        return n*partialAns;
    }
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<0) System.out.println("Error");
        else System.out.println(factorial(n));
		
	}
    
}

// Nothing added!