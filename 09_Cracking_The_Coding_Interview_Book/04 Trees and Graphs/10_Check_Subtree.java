boolean areIdentical(Node root1, Node root2)  // Checking root2 tree is a subtree of root1
    {   
        if (root1 == null && root2 == null) 
            return true; 
   
        if (root1 == null || root2 == null) 
            return false; 
   
        /* Check if the data of both roots is same and data of left and right 
           subtrees are also same */
        return (root1.data == root2.data && areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right)); 
    }
