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
	
	public BST()
	{
		root = null;
	}
	
	void insert(int data)
	{
		Node newnode = new Node(data);
		
		if(root == null)
		{
			root = newnode;
			return;
		}
		else
		{
			Node current = root;
			Node parent = null;
			while(true)
			{
				parent = current;
				
				if(data < current.data)
				{
					current = current.left;
					if(current == null)
					{
						parent.left = newnode;
						return;
					}
				}
				else
				{
					current = current.right;
					if(current == null)
					{
						parent.right = newnode;
						return;
					}
				}	
			}
		}
	} 
	
	
	
	void inorder(Node node)
	{
		if(root == null)
		{
			System.out.println("Empty tree");
			return;
		}
		else
		{
			if(node != null)
			{
				inorder(node.left);
				System.out.println(node.data);
				inorder(node.right);
			}
		}
	}
	
	public Node delete(Node node, int data)
	{
		if(root == null)
		{
			System.out.println("Empty tree");
			return null;
		}
		else
		{
			if(data < node.data)
			{
				node.left = delete(node.left, data);
			}
			else if(data > node.data)
			{
				node.right = delete(node.right, data);
			}
			else
			{
				if(node.left == null && node.right == null) // No child node of the node to delete
				{
					node = null;
				}
				else if(node.left == null) // Only child is right node
				{
					node = node.right;
				}
				else if(node.right == null) // Only child is left node
				{
					node = node.left;
				}
				// If node has two child nodes
				else
				{
					Node temp = min(node.right); // Find the minmum node 
					node.data = temp.data; // Exchange the data node with temp
					node.right = delete(node.right, temp.data); // Delete the duplicate node
				}
			}
		}
		
		return node;
	}
	
	public Node min(Node root)
	{
		if(root.left != null)
		{
			return min(root.left);
		}
		else
		{
			return root;
		}
	}
	
	public Node search(Node root, int data)
	{
		if(root == null || root.data == data)
		{
			return root;
		}
		if(root.data > data)
		{
			return search(root.left, data);
		}
		else if(root.data < data)
		{
			return search(root.right, data);
		}
		return root;
	}
	
	public static void main(String args[])
	{
		BST obj = new BST();
		obj.insert(50);
		obj.insert(30);
		obj.insert(20);
		obj.insert(40);
		obj.insert(70);
		obj.insert(60);
		obj.insert(80);
		obj.inorder(obj.root);
		Node del = null;
		del = obj.delete(obj.root, 40);
		System.out.println("Data after deleting 40");
		obj.inorder(obj.root);
	}
} 
