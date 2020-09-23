// INORDER TRAVERSAL WILL GIVE SORTED VALUES IF NOT SORTED THEN NOT BST
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
				System.out.print(node.data+ " ");
				inorder(node.right);
			}
		}
		//System.out.println();
	}
