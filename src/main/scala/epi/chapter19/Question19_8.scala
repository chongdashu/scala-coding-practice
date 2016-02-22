package main.scala.epi.chapter19
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Stack
import scala.collection.mutable.HashMap
import scala.collection.mutable.Queue

object Question19_8 {
 
    def getProductionSequence(dict : Set[String], start: String, end : String) : List[String] = {
        var productionSequence : ListBuffer[String] = ListBuffer.empty;
        
        var queue: Queue[String] = new Queue();
        var parentOf : HashMap[String, String] = new HashMap;
        
        // Start the queue with the first word
        queue += start;
        
        var d = dict;
        
        while (!queue.isEmpty) {
            var curr = queue.dequeue();
//            println(s"curr=${curr}");
            d = d - (curr);
            if (curr == end) {
                // Goal State:
                // Rebuild the path
                
                var next : String = curr;
                productionSequence += next;
                while (parentOf.contains(next)) {
                    // While there's a parent to follow...
//                    println(s"Traceback: $next -> ${parentOf(next)}");
                    next = parentOf(next);
                    productionSequence += next;
                }
                
                // The production sequence is in reverse here, 
                // un-reverse it.
                
                return productionSequence.reverse.toList;
            }
            
            var neighbors : Set[String] = Set.empty;
            for (charIndex <- 0 to curr.length()-1) {
                // Iterate across all chars in the word
                for (char <- 'a' to 'z') {
                    // Try all letters in the lowercase alphabet
                    var neighborWord = 
                        curr.substring(0, charIndex) + char.toString() + curr.substring(charIndex+1);
//                    println(s"Trying neighborWord=${neighborWord}");
                    if (d.contains(neighborWord)) {
                        neighbors += neighborWord;
                        parentOf(neighborWord) = curr;
//                        println(s"parentOf(${curr})=$neighborWord");
                    }
                }
            }
            queue ++= neighbors;
        }
        
        
        
        return productionSequence.toList;
    }
}