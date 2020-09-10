class Node
{
	int data;
	Node left, right;
	
	public Node(int data)
	{
		this.data = data;
		left = right = null;
	}
}

class BST
{
	Node root;
	public BST(int data)
	{
		root = new Node(data);
	}
	public BST()
	{
		root = null;
	}
	BST obj = new BST();
	obj.root = new Node(40);
	obj.root.left = new Node(20);
	obj.root.right = new Node(60);
	
} 
