class Solution {
    public double myPow(double x, int n) {
        long binForm = n;
        if(n<0){
            x = 1/x;
            binForm = -binForm;
        }

        double res = 1;

        while (binForm > 0){
            if (binForm % 2 == 1){
                res *= x;
            }
            x *= x;
            binForm /= 2;
        }
        return res;
    }
}