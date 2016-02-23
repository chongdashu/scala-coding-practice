package main.scala.epi.chapter12


object Question12_5 {
    
    /**
     * Given a `value`, returns the *largest** integer `x` 
     * where `x<sup>2</sup> &le; value`.
     * 
     * @param value the upper bound
     * @return integer `x` where `x<sup>2</sup> &le; value`  
     */
    def squareRoot(value : Int) : Int =  {
        if (value <= 1) {
            return value;
        }
        
        // Crete an interval [left, right]
        // All values x <= left will be x*x <= value
        // All values y > right will be y*y > value
        var left = 0;
        var right = value;
        
        while (left <= right) {
            var mid = (left + right) / 2;
            var midSq = mid*mid;
            if (midSq <= value) {
                left += 1;
            }
            else {
                right -= 1;
            }
        }
        
        return left-1;
    }
}