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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(N);
            for(int i = 0;i < ans.size();i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> F(int N, ArrayList<Integer> sequence) {
        sequence.add(N);
        int k;
        if (N % 2 == 0) {
            k = (int) Math.pow(N, 0.5);
        } else {
            k = (int) Math.pow(N, 1.5);
        }
        if (k == N) {
            return sequence;
        }
        return F(k, sequence);
    }

    static List<Integer> jugglerSequence(int N) {
        ArrayList<Integer> sequence = new ArrayList<>();
        return F(N, sequence);
    }
}