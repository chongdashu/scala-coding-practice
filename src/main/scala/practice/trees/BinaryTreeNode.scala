package main.scala.practice.trees

class BinaryTreeNode[T](var value : T, var left : BinaryTreeNode[T], var  right :BinaryTreeNode[T]) {
    def traverseInOrder : List[T] = {
        
        if (left == null && right == null) {
            // this is a leaf
            return List(value);
        }
        
        var pathLeft : List[T] =  if (left == null) List.empty else left.traverseInOrder;
        var pathRight : List[T] = if (right == null) List.empty else right.traverseInOrder;
        
        
        return pathLeft ++ List(value) ++ pathRight;
    }
}
