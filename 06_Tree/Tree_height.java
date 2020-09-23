int height(Node node)
{
  if(root == null)
      return 0;
  else
  {
    int lh = height(node.left);
    int rh = height(node.right);
    
    if(lh > rh)
        return (lh + 1);
    else
      return (rh + 1);
  }
}

