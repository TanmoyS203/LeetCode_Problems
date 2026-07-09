class Solution {
    //I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
    
    private int ri(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
    public int romanToInt(String s) {
        int sum=0;
        for(int i =0; i<s.length()-1; i++){
          if(ri(s.charAt(i))>=ri(s.charAt(i+1))){
              sum+=ri(s.charAt(i));
          }
         else{
             sum-=ri(s.charAt(i));
         }
        }
        
        sum+=ri(s.charAt(s.length()-1));
        
        return sum;
        
    }
}