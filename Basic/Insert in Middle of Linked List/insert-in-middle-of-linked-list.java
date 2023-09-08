//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            int n = sc.nextInt();   
            Node head = new Node(sc.nextInt());
            Node tail = head;
            
            for(int i=0; i<n-1; i++){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int key = sc.nextInt();
            
            //display(head);
            Solution obj = new Solution();
            obj.insertInMid(head, key);
            display(head);
            System.out.println();
        }
    }
    
    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node newNode = new Node(data);
        Node temp = head;
        if(temp == null) {
            return newNode;
        }
        
        int cnt = 0;
        while(temp != null) {
            cnt++;
            temp = temp.next;
        }
        
        int mid = 0;
        if(cnt % 2 == 0) {
            mid = cnt / 2;
        } else {
            mid = cnt / 2 + 1;
        }
        
        int start = 1;
        Node temp2 = head;
        while(start < mid) {
            start++;
            temp2 = temp2.next;
        }
        newNode.next = temp2.next;
        temp2.next = newNode;
        
        return head;
    }
}