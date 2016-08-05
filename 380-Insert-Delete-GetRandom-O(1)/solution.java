public class RandomizedSet {
    
    private Set<Integer> set = new HashSet<>();
    private ArrayList<Integer> list = new ArrayList<>();

    /** Initialize your data structure here. */
    public RandomizedSet() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (set.contains(val)){
            return false;
        } else {
            set.add(val);
            list.add(val);
        }
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (! set.contains(val)){
            return false;
        } else {
            set.remove(val);
            list.remove(Integer.valueOf(val));
        }
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int size = list.size();
        int index = getRandomIndex(size);
        return list.get(index);
    }
    
    private int getRandomIndex(int total){
        int index = (int)(Math.random() * total);
        return index;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */