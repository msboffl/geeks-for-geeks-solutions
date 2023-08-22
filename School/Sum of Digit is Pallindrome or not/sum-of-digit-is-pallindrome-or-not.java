//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        int sum = 0;
        while(N > 0) {
            int ld = N % 10;
            sum += ld;
            N = N / 10;
        }
        
        int dup = sum;
        int rev = 0;
        while(dup > 0) {
            int ld = dup % 10;
            rev = rev * 10 + ld;
            dup = dup / 10;
        }
        if(rev == sum) {
            return 1;
        } else {
            return 0;
        }
        // code here
    }
}