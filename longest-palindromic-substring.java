// - generate all possible substrings and check for their palindromicity
// -A 
// -AS 
// -ASA 
// -Asaa
// -Asaas
// -ASAASB 
// - 5
// - 4
// - 3
// - 2
// - 1
 
// sum of n = n * (n + 1) / 2 = 21 = n
 
// int dp[N][N] = N number of characters in the substrings
// dp[i][j] = true = palindrome if i th to j th index (including) is palindrome
// String str = new String("aaabb");
// boolean[][] dp = new boolean[str.size() + 1] [str.size() + 1];
// every single character is a palindrome
 

class Solution {
    public String longestPalindrome(String s) {
        
        int length = s.length();
        // len = 1
        int max_length=1; int start=0;
        boolean[][] table = new boolean[s.length()][s.length()];
        for(int i=0;i<length;i++)
        {
            table[i][i]=true;
        }
        
        //len =2
        
        for(int i =0;i<length-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {   
                start = i;
                table[i][i+1]=true;
                max_length = 2;
            }
        }
        // len >2
        
        
        
    for(int k = 3;k<=length;k++) 
    {
    for(int i = 0; i<length-k+1;i++)
    {
        int last = i+k-1;
        if(s.charAt(i)==s.charAt(last) && table[i+1][last-1]==true)
        {
            table[i][last] = true;
                if(k>max_length )
                {
                    start =i;
                    max_length = k;
                }
        }
        
    }
    }
       return s.substring(start,start+max_length);
        
    }
}
