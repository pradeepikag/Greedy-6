class Solution {
    public int brokenCalc(int X, int Y) {
        
        //edge case
        if(X==Y) return 0;
        
        int count=0;
        if(Y<X) return X-Y;
        
        //Logic
        if(Y>X){
            count=0;
            while (Y > X) {
                if(Y%2!=0) Y++;
                else Y=Y/2;
            count++;
            }
        return  count + X - Y;
        }
        
        return 0;
    }
}
