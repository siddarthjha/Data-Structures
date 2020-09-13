class CheckBst
{
	boolean isBST()  
	{ 
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE); 
    } 
  
    boolean isBSTUtil(Node node, int min, int max) 
    { 
        /* an empty tree is BST */
        if (node == null) 
            return true; 
  
        /* false if this node violates the min/max constraints */
        if (node.data < min || node.data > max) 
            return false; 
  
        /* otherwise check the subtrees recursively 
        tightening the min/max constraints */
        // Allow only distinct values 
        return (isBSTUtil(node.left, min, node.data-1) && isBSTUtil(node.right, node.data+1, max)); 
    } 
	
	public static void main(String[] args)
	{
		BST obj = new BST();
		if (obj.isBST()) 
            System.out.println(" TREE IS BST"); 
        else
            System.out.println("Not a BST");
	}
}
