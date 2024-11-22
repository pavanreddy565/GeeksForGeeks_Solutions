//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends




/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        while(! s.empty()){
            int ele=s.pop();
            while(!st1.empty() && st1.peek()>ele){
                st2.push(st1.pop());
            }st1.push(ele);
            while(! st2.empty()){
                st1.push(st2.pop());
            }
        }return st1;
    }
}