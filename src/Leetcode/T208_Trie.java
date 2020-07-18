package Leetcode;

/**
 * @Author SijiaweiBarry
 * @create 2020/8/11 14:02
 */
public class T208_Trie {
    TrieNode root;
    class TrieNode{
        TrieNode[]child;
        boolean is_end;
        public TrieNode(){
            is_end = false;
            child = new TrieNode[26];
        }
    }

    /** Initialize your data structure here. */
        public T208_Trie(){
            root = new TrieNode();
        }


    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode ptr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ptr.child[c-'a'] == null){
                ptr.child[c-'a'] = new TrieNode();
            }
            ptr = ptr.child[c-'a'];
        }
        ptr.is_end = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode ptr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ptr.child[c-'a']==null){
                return false;
            }
            ptr = ptr.child[c-'a'];
        }
        return ptr.is_end;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode ptr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (ptr.child[c-'a']==null){
                return false;
            }
            ptr = ptr.child[c-'a'];
        }
        return true;
    }
}
