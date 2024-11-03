//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
        int capacity=sc.nextInt();
        LFUCache obj = new LFUCache(capacity);
        int runs=sc.nextInt();
        for(int i = 0;i<runs;i++){
            int s=sc.nextInt();
            if(s==1){
                int key=sc.nextInt();
                int param_1 = obj.get(key);
                System.out.println(param_1);
            }else{
                int key=sc.nextInt(),value=sc.nextInt();
                obj.put(key,value);
            }
        }
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

// import java.util.HashMap;
// import java.util.LinkedHashSet;

class LFUCache {
    class Node {
        int key, value, frequency;
        Node(int k, int v) {
            key = k;
            value = v;
            frequency = 1;
        }
    }

    private final int capacity;
    private int minFrequency;
    private HashMap<Integer, Node> cache; // key -> Node
    private HashMap<Integer, LinkedHashSet<Node>> frequencyMap; // frequency -> nodes with this frequency

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFrequency = 0;
        cache = new HashMap<>();
        frequencyMap = new HashMap<>();
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) return -1;

        updateFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            updateFrequency(node);
        } else {
            if (cache.size() == capacity) {
                evictLFU();
            }

            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            minFrequency = 1;
            frequencyMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(newNode);
        }
    }

    private void updateFrequency(Node node) {
        int freq = node.frequency;
        frequencyMap.get(freq).remove(node);

        if (frequencyMap.get(freq).isEmpty()) {
            frequencyMap.remove(freq);
            if (minFrequency == freq) {
                minFrequency++;
            }
        }

        node.frequency++;
        frequencyMap.computeIfAbsent(node.frequency, k -> new LinkedHashSet<>()).add(node);
    }

    private void evictLFU() {
        LinkedHashSet<Node> nodes = frequencyMap.get(minFrequency);
        Node nodeToRemove = nodes.iterator().next();
        nodes.remove(nodeToRemove);
        if (nodes.isEmpty()) {
            frequencyMap.remove(minFrequency);
        }
        cache.remove(nodeToRemove.key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */