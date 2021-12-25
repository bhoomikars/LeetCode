public class Palindrom
{
    public static void main (String[] args)
    {
        String s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring (String s)
    {
        int res = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            //deafult value is false
            boolean[] visted = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visted[s.charAt(j)] == true)
                    break;
                else {
                    visted[s.charAt(j)] = true;
                    res = Math.max(res, j - i + 1);
                }
            }
            visted[s.charAt(i)] = false;
        }
        return res;

    }
}
