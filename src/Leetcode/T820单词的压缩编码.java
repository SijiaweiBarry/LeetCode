package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author SijiaweiBarry
 * @create 2020/5/19 21:16
 */
public class T820单词的压缩编码 {
    class Trie{
        TrieNode root = new TrieNode();
        public int insert(String word){
            TrieNode cur = root;
            boolean newWord = false;
            for (int i = word.length()-1; i >=0 ; i--) {
                int index = word.charAt(i)-'a';
                if (cur.children[index]==null){
                    newWord = true;
                    cur.children[index] = new TrieNode();
                }
                cur = cur.children[index];
            }
            return newWord==true?word.length()+1:0;
        }
    }
    class TrieNode{
        TrieNode children[] = new TrieNode[26];
        TrieNode(){};
    }

    public int minimumLengthEncoding(String[] words) {
        if (words.length==0)return 0;
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        int res = 0;
        Trie trie = new Trie();
        for (int i = 0; i <words.length ; i++) {
            res += trie.insert(words[i]);
        }
        return res;
    }
}
