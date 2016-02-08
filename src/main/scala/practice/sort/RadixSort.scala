package com.chongdashu.scala.practice.sort

import scala.collection.mutable.ListBuffer

object RadixSort extends BaseSort {
    
    def sort( list : List[Int]) : List[Int] = {
        
        if (list.isEmpty) {
            return list;
        }
        
        var listBuffer : ListBuffer[Int] = ListBuffer.empty ++ list;
        
        // Find the max number of digits amongst all numbers in the list
        val maxDigits = (listBuffer.map { x => x.toString().length }).reduce(Math.max);
        
        for (digit <- 1 to maxDigits) {
           var index_digit_pairs : ListBuffer[(Int, Int)] = listBuffer.map { number => (listBuffer.indexOf(number), getNthDigitFromRight(number, digit)) }
           
           // (a) More verbose, but explicit way.
           // index_digit_pairs = index_digit_pairs.sortWith( (a :(Int, Int), b : (Int, Int)) => a._2 < b._2);
           
           // (b) More succinct way
           index_digit_pairs = index_digit_pairs.sortBy(x => x._2);
           
           listBuffer = index_digit_pairs.map( pair => listBuffer(pair._1));
        }
        
        return listBuffer.toList;
    }
    
    def getNthDigitFromRight(number : Int, digit : Int) : Int = {
        
        var numberString = number.toString();
        var numberOfDigits = numberString.length;
        
        if (digit >= 0 && digit <= number.toString().length) {
            return (numberString(numberOfDigits-digit) + "").toInt;    
        }
        
        return 0;
    }
}



