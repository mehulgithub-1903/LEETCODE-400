//https://leetcode.com/problems/zigzag-conversion/


class Solution {
    public String convert(String s, int row) {
        
        
        int col=0;
        
        int i=0;
        int n=s.length();
        
        if(n<=row || row==1) return s;
        
        
        int cnt=1;
        while(i<n){
            if(cnt%2!=0){
                col++;
                i+=row; 
                cnt++;
            }
            else if(cnt%2==0){
                col+=row-2;
                i+=row-2; 
                cnt++;
            }
        }
        System.out.println(col);
        char mat[][]=new char[row][col];
        
       for(int m=0;m<row;m++){
          for(int j=0;j<col;j++) mat[m][j]='0';
       }
        
        int c=0;
        int r=0;
        i=0;
        while(i<n){
            while(i<n && r<row && c<col){
                mat[r][c]=s.charAt(i);
                r++;
                i++;
            }
            if(r==row) r-=2;
            
            c++;
            
            while(i<n && r>0 && c<col){
                mat[r][c]=s.charAt(i);
                c++;
                r--;
                i++;
            }
            
            
        }
        
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<row;k++){
            for(int j=0;j<col;j++){
                if(mat[k][j]!='0') sb.append(mat[k][j]);
                
            }
        }
        // System.out.println(col);
        return sb.toString();
        
        
        
    }
}
