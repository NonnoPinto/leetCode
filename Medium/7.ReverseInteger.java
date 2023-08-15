class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int sol = 0;
        int abs = Math.abs(x);
        int digits = (int)Math.log10(abs);
        
        for(int i = 0; i <= digits; i++){
            sol += ((int)(abs / Math.pow(10, digits-i))) * Math.pow(10, i);
            abs = abs % (int)Math.pow(10, digits-i);
        }

        if(sol >= max || sol <= min) sol = 0;

        return (x<0)? -sol : sol;
    }
}