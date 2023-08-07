//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] nums = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.Solve(n, nums);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> Solve(int n, int[] nums) {
        // int n = nums.length;
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(ls.size() == 0 || ls.get(0) != nums[i]) {
                int count = 0;
                for(int j = 0; j < n; j++) {
                    if(nums[i] == nums[j]) {
                        count++;
                    }
                }
                if(count > n / 3) {
                    ls.add(nums[i]);
                }
            }
            if(ls.size() == 2) break; 
        }
        if(ls.size() == 0) ls.add(-1);
        return ls;
        // code here
    }
}
        
