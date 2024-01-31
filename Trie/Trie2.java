// Ninja has to implement a data structure ”TRIE” from scratch. Ninja has to complete some functions.
// 1) Trie2(): Ninja has to initialize the object of this “TRIE” data structure.
// 2) insert(“WORD”): Ninja has to insert the string “WORD”  into this “TRIE” data structure.
// 3) countWordsEqualTo(“WORD”): Ninja has to return how many times this “WORD” is present in this “TRIE”.
// 4) countWordsStartingWith(“PREFIX”): Ninjas have to return how many words are there in this “TRIE” that have the string “PREFIX” as a prefix.
// 5) erase(“WORD”): Ninja has to delete one occurrence of the string “WORD” from the “TRIE”.
// Note:
// 1. If erase(“WORD”) function is called then it is guaranteed that the “WORD” is present in the “TRIE”.
// 2. If you are going to use variables with dynamic memory allocation then you need to release the memory associated with them at the end of your solution.
// Can you help Ninja implement the "TRIE" data structure?
// Constraints:
// 1 <= “T” <= 50
// 1 <= “N” <= 10000
//  “WORD” = {a to z}
// 1 <= | “WORD” | <= 1000
// Where “T” is the number of test cases, “N” denotes how many times the functions(as discussed above) we call, “WORD” denotes the string on which we have to perform all the operations as we discussed above, and | “WORD” | denotes the length of the string “WORD”.
// Time limit: 1 sec.

// class Node{
//     Node links[] = new Node[26];
//     int cntPrefix=0;
//     int cntEndsWith=0;

//     public Node(){}

//     boolean containsKey(char ch){
//         return (links[ch-'a']!=null);
//     }
//     Node get(char ch){
//         return links[ch-'a'];
//     }
//     void put(char ch,Node node){
//         links[ch-'a'] = node;
//     }
//     void increaseEnd(){
//         cntEndsWith++;
//     }
//     void increasePrefix(){
//         cntPrefix++; 
//     }
//     void deleteEnd(){
//         cntEndsWith--;
//     }
//     void reducePrefix(){
//         cntPrefix--;
//     }
//     int getEnd(){
//         return cntEndsWith;
//     }
//     int getPrefix(){
//         return cntPrefix;
//     }
// }

// public class Trie2 {
//     private Node root;

//     public Trie2(){
//         root = new Node();
//     }

//     public void insert(String word){
//         Node node = root;
//         for(int i=0;i<word.length();i++){
//             if(!node.containsKey(word.charAt(i))){
//                 node.put(word.charAt(i),node);
//             }
//             node = node.get(word.charAt(i));
//             node.increasePrefix();
//         }
//         node.increaseEnd();
//     }

    
// 	public void erase(String word1){
//         Node node = root;
//         for(int i=0;i<word1.length();i++){
//             if(node.containsKey(word1.charAt(i))){
//                 node = node.get(word1.charAt(i));
//                 node.reducePrefix();
//             }
//             else return;
//         }
//         node.deleteEnd();
// 	}
//     private int  countWordsStartingWith(String word3){
//         Node node = root;
//         for(int i=0;i<word3.length();i++){
//             if(node.containsKey(word3.charAt(i))){
//                 node = node.get(word3.charAt(i));
//             }
//             else return 0;
//         } 
//         return node.getPrefix();
//     }

//     private int countWordsEqualTo(String word1) {
//         Node node = root;
//         for(int i=0;i<word1.length();i++){
//             if(node.containsKey(word1.charAt(i))){
//                 node = node.get(word1.charAt(i));
//             }
//             else{
//                 return 0;
//             }
//         }
//         return node.getEnd();
//     }
//     public static void main(String args[]) {
//         Trie2 T = new Trie2();
//         T.insert("apple");
//         T.insert("apple");
//         T.insert("apps");
//         T.insert("apps");
//         String word1 = "apps";
//         System.out.println("Count Words Equal to "+word1+" "+T.countWordsEqualTo(word1));
//         String word2 = "abc";
//         System.out.println("Count Words Equal to "+word2+" "+T.countWordsEqualTo(word2));
//         String word3 = "ap";
//         System.out.println("Count Words Starting With "+word3+" "+T.countWordsStartingWith
//         (word3));
//         String word4 = "appl";
//         System.out.println("Count Words Starting With "+word4+" "+T.countWordsStartingWith
//         (word4));
//         T.erase(word1);
//         System.out.println("Count Words equal to "+word1+" "+T.countWordsEqualTo(word1));
//     }
// }


class Node {
    Node links[] = new Node[26]; 
    int cntEndWith = 0;
    int cntPrefix = 0;
    
    public Node() {  
    }
    
    boolean containsKey(char ch) {
        return (links[ch - 'a'] != null); 
    }
    Node get(char ch) {
        return links[ch-'a']; 
    }
     void put(char ch, Node node) {
        links[ch-'a'] = node; 
        
    }
     void increaseEnd() {
        cntEndWith++;  
    }
     void increasePrefix() {
        cntPrefix++; 
    }
     void deleteEnd() {
        cntEndWith--; 
    }
     void reducePrefix() {
        cntPrefix--; 
    }
     int getEnd() {
        return cntEndWith; 
    }
     int getPrefix() {
        return cntPrefix; 
    }
}
public class Trie2 {
    private Node root; 

    //Initialize your data structure here

    Trie2() {
        root = new Node(); 
    }


    //Inserts a word into the trie

    public void insert(String word) {
        Node node = root;
        for(int i = 0;i<word.length();i++) {
            if(!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new Node()); 
            }
            node = node.get(word.charAt(i)); 
            node.increasePrefix(); 
        }
        node.increaseEnd(); 
    }


    public int countWordsEqualTo(String word) {
        Node node = root;
        for(int i = 0;i<word.length();i++) {
            if(node.containsKey(word.charAt(i))) {
                node = node.get(word.charAt(i));
            }
            else {
                return 0; 
            }  
        }
        return node.getEnd(); 
    }

    public int countWordsStartingWith(String word) {
        Node node = root;
        for(int i = 0;i<word.length();i++) {
            if(node.containsKey(word.charAt(i))) {
                node = node.get(word.charAt(i));
            }
            else {
                return 0; 
            }  
        }
        return node.getPrefix(); 
    }

    public void erase(String word) {
        Node node = root;
        for(int i = 0;i<word.length();i++) {
            if(node.containsKey(word.charAt(i))) {
                node = node.get(word.charAt(i));
                node.reducePrefix(); 
            }
            else {
                return;
            }
        }
        node.deleteEnd(); 
    }
 public static void main(String args[]) {
  Trie2 T=new Trie2();
  T.insert("apple");
  T.insert("apple");
  T.insert("apps");
  T.insert("apps");
  String word1 = "apps";
  System.out.println("Count Words Equal to "+word1+" "+T.countWordsEqualTo(word1));
  String word2 = "abc";
  System.out.println("Count Words Equal to "+word2+" "+T.countWordsEqualTo(word2));
  String word3 = "ap";
  System.out.println("Count Words Starting With "+word3+" "+T.countWordsStartingWith
  (word3));
  String word4 = "appl";
  System.out.println("Count Words Starting With "+word4+" "+T.countWordsStartingWith
  (word4));
  T.erase(word1);
  System.out.println("Count Words equal to "+word1+" "+T.countWordsEqualTo(word1));
  
}

}