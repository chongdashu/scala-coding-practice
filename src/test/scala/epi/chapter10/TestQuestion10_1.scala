package test.scala.epi.chapter10

import org.junit.Assert._
import junit.framework.TestCase
import main.scala.epi.chapter10._;
import main.scala.practice.trees.BinaryTreeNode

class TestQuestion10_1 extends TestCase {
    var exampleTree : BinaryTreeNode[Int] = null;
    
    override def setUp() = {
        exampleTree = new BinaryTreeNode[Int](314,
                new BinaryTreeNode[Int](6,
                        new BinaryTreeNode[Int](271,
                                new BinaryTreeNode[Int](28, null, null),
                                new BinaryTreeNode[Int](0, null, null)),
                        new BinaryTreeNode[Int](561,
                                null,
                                new BinaryTreeNode[Int](3,
                                        new BinaryTreeNode(17,null,null),
                                        null))),
               new BinaryTreeNode[Int](6,
                       new BinaryTreeNode[Int](2,
                               null,
                               new BinaryTreeNode[Int](1,
                                       new BinaryTreeNode[Int](401,
                                               null,
                                               new BinaryTreeNode[Int](641,
                                                       null,
                                                       null)),
                                       new BinaryTreeNode[Int](257,
                                               null,
                                               null))
                                               ),
                       new BinaryTreeNode[Int](271,
                               null,
                               new BinaryTreeNode[Int](27, 
                                       null,
                                       null))));
    }
    
   
}