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

public class MinimalTree
{
  static Node root;
  Node BST(int arr[], int start, int end)
  {
    if(start > end)
        return null;
    int mid = (start + end) / 2;
    Node n = new Node(arr[mid]);
    n.left = BST(arr, start, mid - 1);
    n.right = BST(arr, mid + 1, end);
    
    return n;
  }
  
  public void preorder(Node root)
  {
    if(root == null)
        return;
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }
  
  
  public static void main(String[] args)
  {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
	  MinimalTree obj = new MinimalTree();
    root = obj.BST(arr, 0, arr.length -1);
    obj.preorder(root);
  }
}
  
