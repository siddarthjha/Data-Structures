boolean s = true; // global variable
	int height(Node node)
	{
		if(node == null)
			return 0;
		else
		{
			int lh = height(node.left);
			System.out.println("Lh = " + lh);
			int rh = height(node.right);
			System.out.println("Rh = " + rh);
			if(!(Math.abs(lh-rh) <= 1))
			{
				s = false;
				return 0;
			}
			if(lh > rh)
				return (lh + 1);
			else
				return (rh + 1);
		}
		
	}
