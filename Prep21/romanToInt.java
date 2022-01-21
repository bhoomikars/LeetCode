class Solution {
    public int romanToInt(String s) {
        
         Character ch=null;
        Character next = null;int sum =0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i=0;i<s.length();i++)
        {
             ch=s.charAt(i);
            if(i+1<s.length()) {
                next = s.charAt(i + 1);
            }
            if(next!=null && map.get(ch)<map.get(next))
            {
                sum-=map.get(ch);
            }
            else
            {
                sum=sum+map.get(ch);
            }
        }
        return sum;
        
    }
}
