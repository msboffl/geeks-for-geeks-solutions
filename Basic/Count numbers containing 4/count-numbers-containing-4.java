//{ Driver Code Starts
//Initial Template for Java

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
            System.out.println(ob.countNumberswith4(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countNumberswith4(int N) {
        int cnt = 0;
        for(int i = 1; i <= N; i++) {
            int num = i;
            int flag = 0;
            while(num > 0) {
                int rem = num % 10;
                if(rem == 4) {
                    flag = 1;
                }
                num = num / 10;
            }
            if(flag == 1) {
                cnt++;
            }
        }
        return cnt;
        // code here
    }
};