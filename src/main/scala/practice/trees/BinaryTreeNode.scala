package main.scala.practice.trees

class BinaryTreeNode[T](var value : T, var left : BinaryTreeNode[T], var  right :BinaryTreeNode[T]) {
    
    /**
     *         (A)
     *        /   \
     *      (B)   (C)
     *      
     * traverseInOrder = [ B, A, C ]     
     */
    def traverseInOrder : List[T] = {
        
        if (left == null && right == null) {
            // this is a leaf
            return List(value);
        }
        
        var pathLeft : List[T] =  if (left == null) List.empty else left.traverseInOrder;
        var pathRight : List[T] = if (right == null) List.empty else right.traverseInOrder;
        
        
        return pathLeft ++ List(value) ++ pathRight;
    }
    
    /**
     *         (A)
     *        /   \
     *      (B)   (C)
     *      
     * traverseInOrder = [ A, B, C ]     
     */
    def traversePreOrder : List[T] = {
        
        if (left == null && right == null) {
            // this is a leaf
            return List(value);
        }
        
        var pathLeft : List[T] =  if (left == null) List.empty else left.traversePreOrder;
        var pathRight : List[T] = if (right == null) List.empty else right.traversePreOrder;
        
        
        return List(value) ++ pathLeft ++ pathRight;
    }
    
    /**
     *         (A)
     *        /   \
     *      (B)   (C)
     *      
     * traverseInOrder = [ B, C, A ]     
     */
    def traversePostOrder : List[T] = {
        
        if (left == null && right == null) {
            // this is a leaf
            return List(value);
        }
        
        var pathLeft : List[T] =  if (left == null) List.empty else left.traversePostOrder;
        var pathRight : List[T] = if (right == null) List.empty else right.traversePostOrder;
        
        
        return pathLeft ++ pathRight ++ List(value);
    }
}
