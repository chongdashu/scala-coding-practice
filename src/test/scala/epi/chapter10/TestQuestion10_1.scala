package test.scala.epi.chapter10

import org.junit.Assert._
import junit.framework.TestCase
import main.scala.epi.chapter10._
import main.scala.practice.trees.BinaryTreeNode
import test.scala.practice.trees.TestBinaryTree
import test.scala.practice.trees.TestBinaryTree

class TestQuestion10_1 extends TestCase {
    var exampleTree : BinaryTreeNode[Int] = null;
    var simpleTree : BinaryTreeNode[String] = null;
    var exampleBalancedTree : BinaryTreeNode[String] = null;
    
    override def setUp() = {
         exampleTree = TestBinaryTree.getExampleTree; 
         exampleBalancedTree = TestBinaryTree.getExampleBalancedTree;
         
         simpleTree = new BinaryTreeNode[String]("A",
                 new BinaryTreeNode("B", null, null),
                 new BinaryTreeNode("C", null, null)
         );
    }
    
    def testExampleTreeIsNotBalanced = {
        val unexpected = true;
        val actual = exampleTree.isBalanced;
        
        assertNotSame(unexpected, actual);
    }
    
    def testExampleBalancedTreeIsBalanced = {
        val expected = true;
        val actual = exampleBalancedTree.isBalanced;
        
        assertEquals(expected, actual);
    }
    
    
    
   
}