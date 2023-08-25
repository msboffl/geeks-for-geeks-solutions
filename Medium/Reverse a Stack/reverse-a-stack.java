//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter out=new PrintWriter(System.out);
        
        //taking testcases
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		
    		//input n and d
    	    int n=Integer.parseInt(str);
    		Stack<Integer> stack=new Stack<>();
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		//inserting elements in the array
    		for(int j=0;j<n;j++)
    		{
    		    stack.push(Integer.parseInt(starr1[j]));
    		}
    		//calling reverse() function
            Solution.reverse(stack);
            for(int j:stack){
                out.print(j+" ");
            }
            out.println();
         }
         out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static void insertIntoStack(Stack<Integer> s, int value) {
        if(s.isEmpty()) {
            s.push(value);
            return;
        } else {
            int temp = s.pop();
			insertIntoStack(s,value);
			s.push(temp);
        }
        
    }
    public static void reverse(Stack<Integer> s)
    {
        if(!s.isEmpty()) {
            int value = s.pop();
            reverse(s);
            insertIntoStack(s, value);
        }
        // add your code here
    }
}