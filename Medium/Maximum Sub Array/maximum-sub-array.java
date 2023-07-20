//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxSum = 0, sum = 0;
        int start = -1, end = -1;
        int len = 0,  maxLen = 0;
        for(int i = 0; i <= n; ++i) {
            if(i == n || a[i] < 0) {
                if(maxSum < sum) {
                    maxSum = sum;
                    maxLen = len;
                    end = i - 1;
                    start = end - len + 1;
                }
                else if(maxSum == sum && maxLen < len) {
                    maxLen = len;
                    end = i - 1;
                    start = end - len + 1;
                }
                len = 0;
                sum = 0;
            }
            else {
                sum += a[i];
                ++len;
            }
        }
        
        if(start == -1) list.add(-1);
        else {
            for(int i = start; i <= end; ++i) {
                list.add(a[i]);   
            }
        }
        return list;
        // code here
    }
}