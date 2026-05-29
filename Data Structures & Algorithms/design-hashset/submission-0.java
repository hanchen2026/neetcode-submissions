class MyHashSet {
    boolean[] set;

    public MyHashSet() {
        this.set = new boolean[1000000];
    }
    
    public void add(int key) {
        if (this.set == null) return;
        set[key] = true;
    }
    
    public void remove(int key) {
        if (this.set == null) return;
        set[key] = false;
    }
    
    public boolean contains(int key) {
        if (this.set == null) return false;
        return set[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */