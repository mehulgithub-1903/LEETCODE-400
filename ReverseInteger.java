// https://leetcode.com/problems/reverse-integer/submissions/

class Solution {
    public int reverse(int x) {
      
        
        int res=0;
        
        int fn=0;
        
        
        while(x!=0){
            int rem=x%10;
            
             fn=res*10+rem;
            
            if((fn-rem)/10!=res) return 0;
            
            res=fn;
            x=x/10;
            
        }
        
        return fn;
        
        
    }
}
