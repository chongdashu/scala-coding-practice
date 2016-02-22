package main.scala.crackingcode.chapter8

import scala.collection.mutable.Set;

object Question8_9 {

    def getParens(nPairs : Int) : Set[String] = {
        var balancedParenStrings : Set[String] = Set.empty;
        
        getParensHelper(nPairs, nPairs, "", balancedParenStrings);
        
        return balancedParenStrings;
        
    }

  def getParensHelper(nLeftParensRemaining: Int, nRightParensRemaining: Int, prefix: String, balancedParenStrings: Set[String]) : Unit = {
      
//      println(s"nLeft=${nLeftParensRemaining}, nRight=${nRightParensRemaining}");
      if (nLeftParensRemaining == 0 && nRightParensRemaining == 0) {
           balancedParenStrings += (prefix);
      }
      
      if (nLeftParensRemaining > 0){
          // assuming prefix is valid, and we have "(" remaining, 
          // start new parenthesis pair after prefix.
          getParensHelper(nLeftParensRemaining-1, nRightParensRemaining, prefix + "(", balancedParenStrings);
      }
      
      if (nLeftParensRemaining < nRightParensRemaining) {
          // assuming prefix is valid, and we have less "(" than ")"
          // we close existing pairs
          getParensHelper(nLeftParensRemaining, nRightParensRemaining-1, prefix + ")", balancedParenStrings)

      }
      
    }
}