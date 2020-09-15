import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Edge
{
	int src, dest;
	
	public Edge(int src, int dest)
	{
		this.src = src;
		this.dest = dest;
	}
}

public class Graph
{
	// A list of lusts to represent Adjacency List
	List<List<Integer>> adj = new ArrayList<>();
	
	public Graph(List<Edge> edges)
	{
		// Allocate memory for Adjacecny lIst
		for(int i = 0; i < edges.size(); i++)
		{
			adj.add(i, new ArrayList<>());
		}
		// Add edges to undirected graph
		for(Edge current : edges)
		{
			// Allocate new node in Adjacency List 
			adj.get(current.src).add(current.dest);
			// Allocate new node in Adjacency list
			//aj.get(current.src).add(current.dest); Uncomment it for undirected graph
		}
	}
	
	private static void print(Graph graph)
	{
		int src = 0;
		int n = graph.adj.size();
		while(src < n)
		{
			for(int dest : graph.adj.get(src))
			{
				System.out.print("(" + src + "-->" + dest + ")\t");
			}
			System.out.println();
			src++;
		}
	}
	
	public static void main(String[] args)
	{
		List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(1, 2), new
							Edge(2, 0), new Edge(2, 1), new Edge(3, 2), new 
							Edge(4, 5), new Edge(5, 4));
		Graph graph = new Graph(edges);
		print(graph);
	} 
}
