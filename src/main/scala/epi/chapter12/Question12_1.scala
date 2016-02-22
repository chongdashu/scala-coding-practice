package main.scala.epi.chapter12


object Question12_1 {
    
    /**
     * Returns the index of the **first** occurrence of that key in the array
     * @param array Array of `Int`s
     * @param value the `Int` to search for
     * @return index of `value` in `array`, otherwise `-1`. 
     */
    def findFirstOccurrence( array : Array[Int],  value : Int ) : Int = {
        if (array.length == 0) {
            // Case (a): empty list
            return -1;
        }
        
        if (array.length == 1) {
            if (value==array(0)) return 0 else return -1;
        }
        
        // Initialize the lower and upper bounds
        var indexLower = 0;
        var indexUpper = array.length -1;
        var middle = -1;
        
        var lowestIndex = -1;
        
        while (indexLower <= indexUpper) {
            middle = (indexUpper + indexLower) / 2;
            
//            println(s"L=$indexLower; U=$indexUpper");
//            println(s"middle=$middle; array($middle)=${array(middle)}");
            
            if (array(middle) == value) {
                lowestIndex = middle;    // save lowest index so far. 
                indexUpper = middle-1;
            }
            else if (value > array(middle)) {
                
                indexLower = middle+1;
            }
            else {
                indexUpper = middle-1;
            }
            
        }
        
        return lowestIndex;
        
    }
}