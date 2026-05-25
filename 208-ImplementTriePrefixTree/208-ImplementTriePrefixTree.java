// Last updated: 5/25/2026, 7:20:49 PM
class TrieNode {
    boolean end = false;
    TrieNode[] childs = new TrieNode[26];
}

class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
     public void insert(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()) {
            int idx = c - 'a';
            if(node.childs[idx] == null)
                node.childs[idx] = new TrieNode();
            node = node.childs[idx];
        }
        node.end = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()) {
            int idx = c - 'a';
            if(node.childs[idx] == null)
                return false;
            node = node.childs[idx];
        }
        return node.end;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if(node.childs[idx] == null)
                return false;
            node = node.childs[idx];
        }
        return true;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */