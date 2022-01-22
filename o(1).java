class RandomizedSet {
private HashMap<Integer,Integer> map;
    private ArrayList<Integer> list;
    private Random random;
    public RandomizedSet() {
         map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
        
    }
    
    public boolean insert(int val) {
         if(map.containsKey(val))
        {
            return false;
        }
        else
        {
            map.put(val,list.size());
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
         if(!map.containsKey(val))
            return false;
        else
        {
            int idx = map.get(val);
            int last= list.get(list.size()-1);
            list.set(idx,last);
            map.put(last,idx);
            map.remove(val);
            list.remove(list.size()-1);
            return true;
        }

    }
    
    public int getRandom() {
        int indx = random.nextInt(list.size());
       return list.get(indx);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
