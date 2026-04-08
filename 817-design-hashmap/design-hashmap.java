class MyHashMap {
    int array[];

    public MyHashMap() {
        this.array = new int[1000001];
        Arrays.fill(array,-1);
        
    }
    
    public void put(int key, int value) {
        this.array[key] = value;
        
    }
    
    public int get(int key) {
        return this.array[key];
        
    }
    
    public void remove(int key) {
        this.array[key] = -1;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */