package com.chongdashu.scala.practice.sort

import scala.collection.mutable.ListBuffer

class BucketSort(var bucketSize : Int) extends BaseSort  {
    
    def this() = {
        this(5);
    }
    
    def sort( list : List[Int]) : List[Int] = {
        
        // Base case
        if (list.isEmpty || list.length == 1) {
            return list;
        }
        
        // Get max and min values of the list.
        var min = list.reduce(Math.min);
        var max = list.reduce(Math.max);
        
        // Get number of buckets
        val nBuckets : Int = ((max - min) / (bucketSize)) + 1
        
        // Create the buckets
        var buckets : ListBuffer[ListBuffer[Int]] = ListBuffer.empty;
        for (bucketIndex <- 1 to nBuckets) {
            buckets += ListBuffer.empty;
        }
        
        // Iterate through the original list and place into buckets
        for (number <- list) {
            var chosenBucketIndex = (number - min) / bucketSize;
            buckets(chosenBucketIndex) += number;
        }
        
        // Iterate through buckets, sort, and concat
        var sortedBuckets = buckets.map { x => x.sorted}.flatten
        
        // Return the sorted list
        return sortedBuckets.toList;
        
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





