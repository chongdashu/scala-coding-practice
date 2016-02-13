package main.scala.crackingcode.chapter8

import scala.collection.mutable.Stack
import scala.collection.mutable.ListBuffer


object Question8_6 {
    
    var moves : ListBuffer[String] = ListBuffer[String]();
    
    def hanoi(nDisks : Int) : Array[String] = {
        
        moves = ListBuffer[String]();
        
        var towers : Array[Tower] = new Array[Tower](3);
        
        for (i <- 0 to towers.size-1) {
            towers(i) = new Tower(i, new Stack[Int]);
        }
        
        for (i <- 0 to nDisks-1) {
            towers(0).addDisk(nDisks-i);
        }
        
        towers(0).print();
        move(nDisks, towers(0), towers(2), towers(1));
        
        return moves.toArray;
    }
    
    def move(n : Int, towerFrom : Tower, towerTo : Tower, towerBuffer : Tower) : Unit = {
//                "Move disk 1 from T0 to T2",
//                "Move disk 2 from T0 to T1",
//                "Move disk 1 from T2 to T1",
//                "Move disk 3 from T0 to T2",
//                "Move disk 1 from T1 to T0",
//                "Move disk 2 from T1 to T2",
//                "Move disk 1 from T0 to T2"
        
        if (n > 0) {
            
            move(n-1, towerFrom, towerBuffer, towerTo);
            var m = towerFrom.popDiskTo(towerTo);
            println(m);
            moves += m;

            move(n-1, towerBuffer, towerTo, towerFrom);
        }
        
        
        
        
    }
    
    def main(args : Array[String]) : Unit = {
        var tower : Tower = new Tower(0, Stack(1,2,3));
        tower.print();
    } 
}

case class Tower(var index : Int, disks : Stack[Int]) {
    
    def addDisk(disk : Int) = {
        disks.push(disk);
    }
    
    def popDiskTo(tower : Tower) : String = {
        var disk : Int = disks.pop();
        tower.addDisk(disk);
        
        return s"Move disk $disk from T${index} to T${tower.index}"; 
    }
    
    def print() : Unit = {
        println(printString())
    }
    
    def printString() : String = {
        return s"Contents of Tower $index: $disks";   
    }
}

