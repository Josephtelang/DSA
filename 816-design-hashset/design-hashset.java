class MyHashSet {
    boolean array[];

    public MyHashSet() {
        this.array = new boolean[((int)Math.pow(10,6)+1)];

        
    }
    
    public void add(int key) {
        if(array[key]==false){
            array[key] = true;
        }
        
    }
    
    public void remove(int key) {
        if(array[key] == true){
            array[key]= false;
        }
        
    }
    
    public boolean contains(int key) {
            return array[key]==true? true : false;
    }
        
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */