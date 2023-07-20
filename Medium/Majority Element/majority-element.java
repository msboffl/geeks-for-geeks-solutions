//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int n)
    {
        // int n = nums.length;
        int count = 0;
        int el = 0;
        
        for(int i = 0; i < n; i++) {
            if(count == 0) {
                count = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == el) {
                count1++;
            }
        }
        if(count1 > n / 2) {
            return el;
        }
        return -1;
        // your code here
    }
}