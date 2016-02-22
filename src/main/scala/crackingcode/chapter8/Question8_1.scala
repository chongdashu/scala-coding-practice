package main.scala.crackingcode.chapter8

object Question8_1 {
    
    def countWaysToNSteps(n : Int) : Int = {
        var TT : Array[Int] = new Array[Int](n+1);
        
        if (n==0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        
        TT(0) = 0;    // staircase with zero steps -> zero ways
        TT(1) = 1;    // staircase with one step -> [1step] -> one way
        TT(2) = 2;    // staircase with two steps -> [1step,1step] + [2steps] -> 2 ways
        TT(3) = 4;    // staircase with three steps -> [1step,1step,1step] + 
                      //                               [1step, 2steps] +
                      //                               [2steps, 1step] +
                      //                               [3steps]                -> 4 ways
        
        for (i <- 4 to n) {
            TT(i) = TT(i-1) + TT(i-2) + TT(i-3);
//            println("TT("+i+")=" + TT(i));
        }
        
//        for (i <- 4 to n) {
//            TT(i) = 1;
//            for (j <- i-3 to i-1) {
//                var oldTTi = TT(i);
//                TT(i) += TT(j);
//                println("TT(i=" + i + ")=[TT(i=" + i +")=" + oldTTi + " + " + "TT(j=" + j +")=" + TT(j) +"]=" + TT(i));
//                
////                println("TT(j=" + j + ")=" + TT(j));
////                println("TT(i=" + i + ")="+TT(i));
//            }
//            
//        }
    
        
        return TT(n);
    }
}