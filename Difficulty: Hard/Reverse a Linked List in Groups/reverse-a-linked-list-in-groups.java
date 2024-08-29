//{ Driver Code Starts
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

class ReverseInSize {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < s.length; i++) {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res, out);
            out.println();
        }
        out.close();
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
    }
}

// } Driver Code Ends


/*node class of the linked list

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

*/

class Solution {
    static Node kthNode(Node node , int k){
        Node temp = node;
        while(k>1){
            if(temp==null){
                return temp;
            }temp=temp.next;
            k--;
        }return temp;
    }static Node reverse(Node head){
        Node temp=head, prev=null, next;
        while(temp!=null){
            next=temp.next;
            temp.next = prev;

            prev=temp;
            temp=next;
        }return prev;
    }
    public static Node reverse(Node head, int k) {
        // Your code here
       Node temp=head,kthnode,nextNode, prevNode=null;
        while(temp!=null){
            kthnode = kthNode(temp,k);
            if (kthnode==null){
                if(prevNode!=null){
                    prevNode.next = reverse(temp);
                }
                break;
            }nextNode = kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthnode;
            }else{
                prevNode.next = kthnode;
            }prevNode = temp;
            temp = nextNode;
        }return head;
    }
}
