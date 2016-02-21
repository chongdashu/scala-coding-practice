package test.scala.epi.chapter10

import org.junit.Assert._
import junit.framework.TestCase
import main.scala.epi.chapter10._
import main.scala.practice.trees.BinaryTreeNode
import test.scala.practice.trees.TestBinaryTree
import test.scala.practice.trees.TestBinaryTree

class TestQuestion10_3 extends TestCase {
    var exampleTree : BinaryTreeNode[Int] = null;
    var simpleTree : BinaryTreeNode[String] = null;
    
    override def setUp() = {
         exampleTree = TestBinaryTree.getExampleTree;  
         
         simpleTree = new BinaryTreeNode[String]("A",
                 new BinaryTreeNode("B", null, null),
                 new BinaryTreeNode("C", null, null)
         );
    }
    
    def testSimpleTreeGetNode = {
        val a = simpleTree.getNodeWithValue("A");
        val b = simpleTree.getNodeWithValue("B");
        val c = simpleTree.getNodeWithValue("C");
        
        val expected = b;
        
        assertEquals(a, a.getNodeIfExists(a));
        assertEquals(b, a.getNodeIfExists(b));
        assertEquals(c, a.getNodeIfExists(c));
    }
    
    def testSimpleTreeGetLCA = {
        val a = simpleTree.getNodeWithValue("A");
        val b = simpleTree.getNodeWithValue("B");
        val c = simpleTree.getNodeWithValue("C");
        
        val expected = a;
        val actual = a.getLCA(b, c);
        
        assertEquals(s"LCA(b,c) = ${expected.value} and not ${actual.value}.", expected, actual)
    }
    
    def testExampleTreeGetLCA = {
        val m = exampleTree.getNodeWithValue(641);
        val n = exampleTree.getNodeWithValue(257);
        val k = exampleTree.getNodeWithValue(1);
        
        assertNotNull("Node m should not be null", m);
        assertNotNull("Node n should not be null", n);
        assertNotNull("Node k should not be null", k);
        
        assertEquals("Node m should have value 641", m.value, 641);
        assertEquals("Node n should have value 257", n.value, 257);
        assertEquals("Node k should have value 1", k.value, 1);
        
        val expected = k;
        val actual = exampleTree.getLCA(m, n);
        
        assertNotNull("LCA(m, n) should not be null", actual);
        assertEquals("LCA(m, n) should not be k", expected, actual);
    }
    
   
}