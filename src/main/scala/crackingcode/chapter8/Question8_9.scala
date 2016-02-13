package main.scala.crackingcode.chapter8

object Question8_9 {

    def getParens(nPairs : Int) : Set[String] = {
        
        // base case
        // npairs <= 1
       
        
        if (nPairs == 0) {
            return Set.empty;
        }
        
        if (nPairs == 1) { 
            return Set[String]("()");
        }
        
         var parens : Set[String] = Set.empty;
        
        
        return parens;
        
    }
}