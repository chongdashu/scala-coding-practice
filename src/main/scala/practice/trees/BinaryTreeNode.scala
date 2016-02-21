package main.scala.practice.trees

class BinaryTreeNode[T](var value : T, var left : BinaryTreeNode[T], var  right :BinaryTreeNode[T]) {
    def traverseInOrder : List[T] = {
        
        if (left == null && right == null) {
            // this is a leaf
            return List(value);
        }
        
        
        var path : List[T] = List.empty;
        return path;
    }
}
