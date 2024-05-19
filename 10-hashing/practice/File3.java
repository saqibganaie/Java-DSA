import java.util.*;

public class File3 {
    // * HashMap Implementation
    // * Key Points
    // 1. Hashmap is implemented as an Array of LinkedLists
    public static void main(String[] args) {
        MyHashMap<String, Integer> hashmap = new MyHashMap<>();
        hashmap.put("Saqib", 23); // Name and age
        hashmap.put("Person", 31);
        hashmap.put("Azhar", 18);
        hashmap.put("Akeel", 25);
        // System.out.println(hashmap.containsKey("Adnan"));
        // System.out.println(hashmap.get("Saqib"));
        // System.out.println(hashmapKeys);
        hashmap.remove("Person");
        System.out.println(hashmap.isEmpty());
        ArrayList<String> hashmapKeys = hashmap.keySet();
        for (String key : hashmapKeys) {
            System.out.println(key + ", " + hashmap.get(key));
        }
    }

}

class MyHashMap<K, V> { // using generics because we dont know the types
    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int n; // Number of nodes.
    private int N; // Number of buckets or size of array.
    private LinkedList<Node>[] arrayOfBuckets;

    public MyHashMap() {
        this.N = 4;
        this.arrayOfBuckets = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            this.arrayOfBuckets[i] = new LinkedList<>();
        }
    }

    private int hashFunction(K key) {
        int bucketIndex = key.hashCode();
        return Math.abs(bucketIndex) % N; // Positive bucketIndex between 0 - (N - 1)
    }

    private int searchInLinkedList(K key, int bucketIndex) {
        LinkedList<Node> listAtBucketIndex = arrayOfBuckets[bucketIndex];
        for (int i = 0; i < listAtBucketIndex.size(); i++) {
            if (listAtBucketIndex.get(i).key == key) {
                return i; // nodeIndex found
            }
        }
        return -1; // nodeIndex not found
    }

    private void rehash() {
        // Store the old array
        LinkedList<Node>[] oldArrayOfBuckets = arrayOfBuckets;
        // Increase the size of array
        this.N *= 2;
        this.arrayOfBuckets = new LinkedList[this.N];

        for (int i = 0; i < this.N; i++) {
            this.arrayOfBuckets[i] = new LinkedList<>();
        }

        // Transfer old values to new arrayOfBuckets
        for (LinkedList<Node> list : oldArrayOfBuckets) {
            for (Node node : list) {
                put(node.key, node.value);
            }
        }

    }

    public void put(K key, V value) {
        // * put(key, value) implementation
        // 1. Get hashCode for key using the hashCode(), to get the index (A.K.A
        // *buckets* ) where node is stored. NOTE: hashCode will always be between 0 -
        // (N - 1), where 'N' is the
        // size of array.
        // 2. Go to the index and search in the linkedList for the key.
        // 3. If key already exists then update it's value.
        // 4. If key does not exists then create a new key, value node.

        // * For time complexity of put
        // 1. Time complexity is O(λ), where λ= n/N (n is number
        // of nodes in all the LinkedLists and N is size of array or number of buckets).
        // 2. While adding a new element this λ should always be less than a certain
        // threshold value.
        // 3. If λ exceeds the threshold value then increase the size of array i.e do
        // *Rehashing*.

        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInLinkedList(key, bucketIndex);
        if (nodeIndex == -1) { // node doesn't exist
            arrayOfBuckets[bucketIndex].add(new Node(key, value));
            n++;
        } else {// node exists
            Node dataNode = arrayOfBuckets[bucketIndex].get(nodeIndex);
            dataNode.value = value;
        }

        double lambda = (double) n / N;
        if (lambda > 2.0) {
            rehash();
        }
    }

    // O(1)
    public boolean containsKey(K key) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInLinkedList(key, bucketIndex);
        if (nodeIndex == -1) {
            return false;
        }
        return true;
    }

    // O(1)
    public V remove(K key) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInLinkedList(key, bucketIndex);
        if (nodeIndex == -1) {
            return null;
        }
        Node nodeData = arrayOfBuckets[bucketIndex].remove(nodeIndex);
        this.n--;
        return nodeData.value;
    }

    // O(1)
    public V get(K key) {
        int bucketIndex = hashFunction(key);
        int nodeIndex = searchInLinkedList(key, bucketIndex);
        if (nodeIndex == -1) {
            return null;
        }
        Node nodeData = arrayOfBuckets[bucketIndex].get(nodeIndex);
        return nodeData.value;
    }

    public ArrayList<K> keySet() {
        if (isEmpty()) {
            return null;
        }
        ArrayList<K> keys = new ArrayList<>();
        for (LinkedList<Node> ll : arrayOfBuckets) {
            for (Node node : ll) {
                keys.add(node.key);
            }
        }
        return keys;
    }

    // O(N)
    public boolean isEmpty() {
        return n == 0;
    }
}