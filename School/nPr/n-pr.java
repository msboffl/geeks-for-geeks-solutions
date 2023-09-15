//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            Long n = Long.parseLong(a[0]);
            Long r = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nPr(n, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long fact(long n) {
        if(n == 0) return 1;
        if(n == 1) return n;
        long ans = n * fact(n-1);
        return ans;
    }
    static long nPr(long n, long r){
        long ans = fact(n) / fact(n-r);
        return ans;
        // code here
    }
}