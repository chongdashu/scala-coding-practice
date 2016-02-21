package test.scala.practice.trees

import org.junit.Assert._
import junit.framework.TestCase
import main.scala.practice.trees.BinaryTreeNode

class TestBinaryTree extends TestCase {
    
    var exampleTree : BinaryTreeNode[Int] = null;
    var exampleBalancedTree : BinaryTreeNode[String] = null;
    var oneNodeTree : BinaryTreeNode[Int] = null;
    
    
    override def setUp() = {
        
        oneNodeTree = new BinaryTreeNode[Int](1337, null, null);
        exampleBalancedTree = TestBinaryTree.getExampleBalancedTree;
        exampleTree = TestBinaryTree.getExampleTree;
    }
    
    def testExampleTreeHeight() = {
        val expected = 5;
        val actual = exampleTree.height;
        assertEquals(expected, actual);
    }
    
    def testExampleBalancedTreeIsBalanced() = {
        var expected = true;
        var actual = exampleBalancedTree.isBalanced;
        assertEquals(expected, actual);
    }
    
    def testExampleTreeIsNotBalanced() = {
        var expected = false;
        var actual = exampleTree.isBalanced;
        assertEquals(expected, actual);
    }
    
    def testOneNodeTreeHeight() = {
        val expected = 0;
        val actual = oneNodeTree.height;
        assertEquals(expected, actual);
    }
    
    def testTraverseInOrderExampleTree() = {
        val expected : List[Int] = List(
             28, 271, 0, 6, 561, 17, 3, 314,
             2, 401, 641, 1, 257, 6, 271, 28
        ); 
        val actual : List[Int] = exampleTree.traverseInOrder;
        assertEquals(expected, actual);
    }
    
    def testTraversePreOrderExampleTree() = {
        val expected : List[Int] = List(
             314, 6, 271, 28, 0, 561, 3, 17,
             6, 2, 1, 401, 641, 257, 271, 28
        ); 
        val actual : List[Int] = exampleTree.traversePreOrder;
        assertEquals(expected, actual);
    }
    
    def testTraversePostOrderExampleTree() = {
        val expected : List[Int] = List(
            28, 0, 271, 17, 3, 561, 6, 641, 401, 257, 1, 2, 28, 271,  6, 314
        ); 
        val actual : List[Int] = exampleTree.traversePostOrder;
        assertEquals(expected, actual);
    }
    
    
    
}

object TestBinaryTree {
    
    /**
     * Returns the example tree shown in Figure 10.1 
     * of the EPI book.
     */
    def getExampleTree : BinaryTreeNode[Int] = {
        return new BinaryTreeNode[Int](314,
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
                               new BinaryTreeNode[Int](28, 
                                       null,
                                       null))));
    }
    
    /**
     * Returns the example balanced tree shown in Figure 10.2 
     * of the EPI book.
     */
    def getExampleBalancedTree : BinaryTreeNode[String] = {
        return new BinaryTreeNode[String]("A",
                new BinaryTreeNode("B",
                        new BinaryTreeNode("C",
                                new BinaryTreeNode("D",
                                        new BinaryTreeNode("E", null, null),
                                        new BinaryTreeNode("F", null, null)
                                 ),
                                 new BinaryTreeNode("G", null, null)
                        ),
                        new BinaryTreeNode("H",
                                new BinaryTreeNode("I", null, null),
                                new BinaryTreeNode("J", null, null)
                        )
                ),
                new BinaryTreeNode("K",
                        new BinaryTreeNode("L",
                                new BinaryTreeNode("M", null, null),
                                new BinaryTreeNode("N", null, null)
                        ),
                        new BinaryTreeNode("O", null, null)
                )
        );
    }
}