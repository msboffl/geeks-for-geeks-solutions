//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    Stack<Integer> st2 = new Stack<Integer>();
	    while(!s.isEmpty()) {
	        int temp = s.pop();
	        while(!st2.isEmpty() && st2.peek() > temp) {
	            s.push(st2.pop());
	        }
	        st2.push(temp);
	    }
	    return st2;
		//add code here.
	}
}