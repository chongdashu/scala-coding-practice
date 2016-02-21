package test.scala.practice.trees

import org.junit.Assert._
import junit.framework.TestCase
import main.scala.practice.trees.BinaryTreeNode

class TestBinaryTree extends TestCase {
    
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
                               new BinaryTreeNode[Int](28, 
                                       null,
                                       null))));
    }
    
    def testTraverseExampleTree() = {
        val expected : List[Int] = List(
             28, 271, 0, 6, 561, 17, 3, 314,
             2, 401, 641, 1, 257, 6, 271, 28
        ); 
        val actual : List[Int] = exampleTree.traverseInOrder;
        assertEquals(expected, actual);
    }
    
}