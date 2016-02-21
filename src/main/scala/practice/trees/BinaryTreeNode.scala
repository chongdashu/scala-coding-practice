package main.scala.practice.trees

class BinaryTreeNode[T](var value : T, var left : BinaryTreeNode[T], var  right :BinaryTreeNode[T]) {
    
    var parent : BinaryTreeNode[T] = null;
    
    if (this.left != null) {
        left.parent = this;
    }
    if (this.right != null) {
        right.parent = this;
    }
        

    
    /**
     * Retrieves the lowest common ancestor of two given nodes;
     * uses the `BinaryTreeNode.parent` links to compute this.
     * 
     *  - Time complexity:  O(h): iteratively climb up the tree
     *  - Space complexity: O(1): only need to store parent each time.
     *  
     * e.g.,
     * {{{
     *             [A]             depth = 0
     *           /     \
     *         [B]     [E]         depth = 1
     *        /   \       \
     *      [C]   [D]      [F]     depth = 2
     *           /
     *         [G]                 depth = 3
     *            \
     *             [H]             depth = 4
     * }}}
     * 
     *  - LCA(C, D) is B
     *  - LCA(B, E) is A
     *  - LCA(C, F) is A
     *  - LCA(C, H) is B 
     */
    def getLCAUsingParentLinks(node1 : BinaryTreeNode[T], node2 : BinaryTreeNode[T]) : BinaryTreeNode[T] = {
        
        if (node1 == this || node2 == this) {
            // Base case: if node1 or node2 are the current node, return this
            return this;
        }
        
        var node1Depth : Int= 0;
        var node2Depth : Int = 0;
        
        var node1Parent = node1;
        while (node1Parent != null) {
            node1Parent = node1Parent.parent;
            node1Depth += 1;
        }
        
        var node2Parent = node2;
        while (node2Parent != null) {
            node2Parent = node2Parent.parent;
            node2Depth += 1;
        }
        
        println(s"node1Depth=${node1Depth}");
        println(s"node2Depth=${node2Depth}");
        
        var candidateNode1  = node1;
        var candidateNode2  = node2;
        
        var depthDelta = node1Depth - node2Depth;
        if (depthDelta > 0) {
           // node1 is deeper
//           println(s"Node ${node1.value} is deeper by ${depthDelta}");
           for (i <- 1 to depthDelta) {
               candidateNode1 = candidateNode1.parent;
           }
            
        }
        else {
           // node2 is deeper
            // node1 is deeper
           for (i <- 1 to Math.abs(depthDelta)) {
//               println(s"Node ${node2.value} is deeper by ${depthDelta}");
               candidateNode2 = candidateNode2.parent;
           }
        }
        
        // Now both candidate nodes are at equal level
        
       while (candidateNode1 != null && candidateNode2 != null && 
               candidateNode1 != candidateNode2) {
           
//           println(s"candidateNode1 <- ${candidateNode1.value}.parent = ${candidateNode1.parent.value}");
//           println(s"candidateNode2 <- ${candidateNode2.value}.parent = ${candidateNode2.parent.value}");
           
           candidateNode1 = candidateNode1.parent;
           candidateNode2 = candidateNode2.parent;
           
           
       }
        
       return candidateNode1;
    }
    
    /**
     * Retrieves the lowest common ancestor of two given nodes.
     * e.g.,
     * {{{
     *             [A]
     *           /     \
     *         [B]     [E]
     *        /   \       \
     *      [C]   [D]      [F]     
     * }}}
     * 
     *  - LCA(C, D) is B
     *  - LCA(B, E) is A
     *  - LCA(C, F) is A
     */
    def getLCA (node1 : BinaryTreeNode[T], node2 : BinaryTreeNode[T]) : BinaryTreeNode[T] = {
            
        // Base case: 
        //    - if node1 == this || node2 == this, return this;
        if ((node1 == this) || (node2 == this)) {
            return this;
        }
        
        var lcaLeft = if (left != null) left.getLCA(node1, node2) else null;
        var lcaRight = if (right!= null) right.getLCA(node1, node2) else null;
        
        if (lcaLeft != null && lcaRight != null) {
            // nodes exist on separate sub-trees
            return this;
        }
        
        else if (lcaLeft != null) {
            // nodes exist on only left sub-tree
            return lcaLeft;
        }
        
        else if (lcaRight != null) {
            // nodes exist on only right sub-tree
            return lcaRight;
        }
        
        return null;
        
        
        // Brute-force version below
        // Has O(n^2) time complexity in worse case.
        // Because at each node, we are searching and checking both subtrees (size=n)

       
       
//        // Base case:
//        //   - if node1 and node2 in different subtrees, return this
//        var node1InleftMaybe = if (left == null) null else left.getNodeIfExists(node1);
//        var node2InleftMaybe = if (left == null) null else left.getNodeIfExists(node2);
//        
//        var node1InRightMaybe = if (right == null) null else right.getNodeIfExists(node1);
//        var node2InRightMaybe = if (right == null) null else right.getNodeIfExists(node2);
//        
//        if (node1InleftMaybe != null && node2InRightMaybe != null ||
//            node2InleftMaybe != null && node1InRightMaybe != null) {
//            return this;
//        }
//        
//        // Recusive case:
//        //    - if not recurse on the sub-tree that has both nodes
//        
//        if (node1InleftMaybe != null && node2InleftMaybe != null) {
//            // node1 and node2 are in the left tree
//            return left.getLCA(node1, node2);
//        }
//        
//        if (node1InRightMaybe != null && node2InRightMaybe != null) {
//            // node1 and node2 are in the left tree
//            return right.getLCA(node1, node2);
//        }
//        
//        return null;
        
        
    }
    
    def getNodeIfExists(node : BinaryTreeNode[T]) : BinaryTreeNode[T] = {
        if (this == node) {
            return this;
        }
        var leftNodeIfExists = if (left == null) null else left.getNodeIfExists(node);
        var rightNodeIfExists = if (right == null) null else right.getNodeIfExists(node);
        
        if (leftNodeIfExists != null) {
            return leftNodeIfExists;
        }
        
        if (rightNodeIfExists != null) {
            return rightNodeIfExists;
        }
        
        return null;
    }
    
    /**
     * Retrieves the first node it finds with a matching value.
     */
    def getNodeWithValue (value_ : T) : BinaryTreeNode[T] = {
            
        if (value.equals(value_)) {
            return this;
        }
        
        var nodeLeft = if (left == null) null else left.getNodeWithValue(value_);
        var nodeRight = if (right == null) null else right.getNodeWithValue(value_);
        
        if (nodeLeft != null) {
            return nodeLeft;
        }
        if (nodeRight != null) {
            return nodeRight;
        }
        return null;
    }
    
    /**
     * A binary tree is balanced if
     *  - for each subtree `left` and `right`:
     *   	|`left.height` - `right.height`| <= 1
     */
    def isBalanced : Boolean = {
        
        if (left == null && right == null) {
            return true;
        }
        
        var leftHeight = if (left == null) 0 else left.height;
        var rightHeight = if (right == null) 0 else right.height;
        
        var leftBalanced = if (left == null) true else left.isBalanced;
        var rightBalanced = if (right == null) true else right.isBalanced;
        
        var diff = Math.abs(leftHeight - rightHeight);
        
        return leftBalanced && rightBalanced && diff <= 1;
        
    }
    
    def height : Int = {
        
        if (left == null && right == null) {
            return 0;
        }
        
        var leftHeight = if (left == null) 0 else left.height;
        var rightHeight = if (right == null) 0 else right.height;
        
        return Math.max(leftHeight, rightHeight) + 1;
        
    }
    
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
