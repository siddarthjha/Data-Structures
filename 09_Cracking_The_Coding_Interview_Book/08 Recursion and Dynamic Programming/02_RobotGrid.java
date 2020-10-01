import java.util.Scanner;
import java.util.ArrayList;

class Point 
{
    int x, y;
    public Point (int x, int y) 
	{
        this.x = x;
        this.y = y;
	}
	
	public String toString() 
	{
        return String.format("[%d, %d]", x, y);
    }
}

public class RobotGrid
{
	static int n = 3; //substitute your n value here
    static ArrayList<Point> current_path = new ArrayList<Point>();
    static boolean[][] blockedCell = new boolean[n][n];
    public static void FindAllWay(int x, int y) // BackTracking Method
    {
        if (x <0 || y < 0) return;
        Point p = new Point(x, y);
        current_path.add(p);

        if (0 == x && 0 == y)
		{
            System.out.println(current_path.toString());
           	current_path.remove(current_path.size() - 1);
			//System.out.println(current_path.toString());
            return;
        }

        if ((x > 0) && !blockedCell[x-1][y]) //go right
        {
            blockedCell[x-1][y] = true;
            FindAllWay(x-1, y);
            blockedCell[x-1][y] = false;
        }
        if ((y > 0) &&!blockedCell[x][y-1]) // go down
        {
            blockedCell[x][y-1] = true;
            FindAllWay(x, y-1);
            blockedCell[x][y-1] = false;
        }
        current_path.remove(current_path.size()-1);

    }

    public static void main(String[] args)
    {
        FindAllWay(n-1, n-1);
		
    }
}
