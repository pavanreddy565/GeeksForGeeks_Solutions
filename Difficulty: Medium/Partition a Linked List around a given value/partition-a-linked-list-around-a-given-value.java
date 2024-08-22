//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Partition {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            int x = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            Node res = ob.partition(head, x);
            printList(res);
            System.out.println();
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node partition(Node head, int x) {
        // Your code here
        if(head==null || head.next ==null){
            return head;
        }
        Node less3= new Node(-1);
        Node equal3 =new Node(-1);
        Node more3 = new Node(-1);
        Node less3ptr = less3,more3ptr=more3, equal3ptr=equal3,ptr=head;
        while(ptr!=null){
            if(ptr.data==x){
                Node temp=new Node(ptr.data);
                equal3ptr.next=temp;
                equal3ptr=equal3ptr.next;
            }else if(ptr.data<x){
                Node temp=new Node(ptr.data);
                less3ptr.next=temp;
                less3ptr=less3ptr.next;
            }
            else{
                Node temp = new Node(ptr.data);
                more3ptr.next=temp;
                more3ptr=more3ptr.next;
            }ptr=ptr.next;
        }less3ptr.next=equal3.next;
        equal3ptr.next = more3.next;
        return less3.next;
    }
}