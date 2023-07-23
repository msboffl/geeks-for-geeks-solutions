//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        HashMap<Integer,Integer>mp=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            if(mp.containsKey(temp.data)){
                mp.put(temp.data,mp.get(temp.data)+1);
            }else{
                mp.put(temp.data,1);
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(mp.containsKey(0)){
                temp.data=0;
                mp.put(0,mp.get(0)-1);
                if(mp.get(0)==0)mp.remove(0);
            }
            else if(mp.containsKey(1)){
                temp.data=1;
                mp.put(1,mp.get(1)-1);
                if(mp.get(1)==0)mp.remove(1);
            }
            else{
                temp.data=2;
                mp.put(2,mp.get(2)-1);
                if(mp.get(2)==0)mp.remove(2);
            }
            temp=temp.next;
        }
        return head;
        // add your code here
    }
}


