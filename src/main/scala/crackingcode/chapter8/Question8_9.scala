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
        
        var result: Set[String] = Set.empty;
        
        var prevParens : Set[String] = getParens(nPairs-1);
        for (parens <- prevParens) {
            result += (parens + "()");
            result += ("()" + parens);
            result += (s"($parens)");
        }
        
        return result;
        
    }
}