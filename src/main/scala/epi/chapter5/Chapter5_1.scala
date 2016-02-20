package main.scala.epi.chapter5

object Chapter5_1 {
    
    def calculateParityA(value : Long) : Long = {
        var result : Long = 0;
        var v : Long = value;
        while (v > 0) {
            result += (value & 1)
            v = v >> 1;
        }
        
        return result % 2;
    }
  
}