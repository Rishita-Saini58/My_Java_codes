class Solution {
    static int value(char ch)
    {
        int i = 0;
        char[] c = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
          int[] a = {1,   5,  10,  50,  100,  500,  1000};
        for (; i < c.length; i++)
        if(c[i] == ch)
        break;
        return a[i];
    }
    public int romanToInt(String s) 
    {

        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            // char ch = s.charAt(i);//'i = 0 (I)', 'I', 'I';
        char ch = s.charAt(i); 

//              length more   &&    
            if((i+1)<s.length() && value(ch) < value(s.charAt(i+1)))
            sum = sum - value(ch);
            else
            sum = sum + value(ch);
        }
        return sum;
    }
}