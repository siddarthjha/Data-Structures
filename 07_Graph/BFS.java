import java.util.*;
import java.io.*;

class Graph 
{
  	  private LinkedList<Integer> adjLists[];
	  private boolean visited[];
	  int v;
	
	  // Graph creation
	  Graph(int vertices) 
	  {	
	  		v = vertices;
		    adjLists = new LinkedList[vertices];
		    visited = new boolean[vertices];
		    for (int i = 0; i < vertices; i++)
			{
		      	adjLists[i] = new LinkedList<Integer>();
			}
	  }
	
	  // Add edges
	  void addEdge(int src, int dest) 
	  {
	    	adjLists[src].add(dest); // Directed Graph
			adjLists[dest].add(src); // Undirected Graph
	  }
	
	  // DFS algorithm
	  void DFS(int vertex) 
	  {
		    visited[vertex] = true;
		    System.out.print(vertex + " ");
		    Iterator<Integer> ite = adjLists[vertex].listIterator();
		    while (ite.hasNext()) 
			{
		      int adj = ite.next();
		      if (!visited[adj])
		        DFS(adj);
		    }
	  }
	  
	  void BFS(int vertex)
	  {
	  		// Queue for BFS
	  		LinkedList<Integer> queue = new LinkedList<Integer>();
			boolean visited[] = new boolean[v];
			visited[vertex] = true; // Mark current vertex visited
			queue.add(vertex);
			
			while(queue.size()!= 0)
			{
				vertex = queue.poll(); // Dequeue vertex from queue and print
				System.out.print(vertex + " ");
				Iterator<Integer> i = adjLists[vertex].listIterator();
				while(i.hasNext())
				{
					int n = i.next();
					if(!visited[n])
					{
						visited[n] = true;
						queue.add(n);
					}
				}
			} 	
				
	  }
	
	  public static void main(String args[]) 
	  {
		    Graph g = new Graph(4);
		    g.addEdge(0, 3);
		    g.addEdge(0, 2);
		    g.addEdge(1, 2);
		    //g.addEdge(2, 1);
		
		    System.out.println("Following is Depth First Traversal");
		
		    g.DFS(0);
			System.out.println();
			System.out.println("Following is Breadth First Traversal");
			g.BFS(0);
	  }
}
