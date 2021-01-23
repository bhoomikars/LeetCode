// Reverse of the Integer
i/p = 12
o/p = 21

Logic: pop the last value and push it to the reverse 
for pop = number modulo by 10,  for push multiply reverse by 10 

class Solution {
    public int reverse(int x) {
         int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            // constraining to integer to avoid overflow
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            //push 
            rev = rev * 10 + pop;
        }
        return rev;
       
}
}
