//{ Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	}
}
}
// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
	    int digit = 0;
	    int i = 0;
	    while(n > 0) {
	        int ld = n % 10;
	        if(ld == 0) {
	            ld = 5;
	        }
	        digit += ld * Math.pow(10, i);
	        i++;
	        n = n / 10;
	    }
	    return digit;
    //add code here.
    }
}