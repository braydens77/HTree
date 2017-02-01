import edu.princeton.cs.algs4.StdDraw;
public class HTree {
	public static int canvasSize = 256;
	public static int size = canvasSize /2;
	
	public static void main(String[]args)
	{
		StdDraw.setCanvasSize();
		StdDraw.setScale(0,canvasSize);
		StdDraw.setPenColor(0,0,0);
		StdDraw.setPenRadius(.001);
		//drawH((canvasSize/2) - (size/2), canvasSize/2, size);
		drawRecursively(Integer.parseInt(args[0]), canvasSize/2, canvasSize/2, size);
	}
	
	public static void drawH(double x, double y, double size)
	{
		double newX = x -(size/2);
		StdDraw.line(newX, y, newX + size, y);
		StdDraw.line(newX, y-(size/2), newX, y+(size/2));
		StdDraw.line(newX+size, y-(size/2), newX + size, y + (size/2));
		StdDraw.show(020);
	}
	
	public static void drawRecursively(int n, double x, double y, double size)
	{
		if(n>1)
		{
			System.out.print(n + " ");
			drawH(x, y, size);
			drawRecursively(n-1, x-size/2, y+size/2, size/2);
			drawRecursively(n-1, x-size/2, y-size/2, size/2);
			drawRecursively(n-1, x + size/2, y + size/2, size/2);
			drawRecursively(n-1, x + size/2, y - size/2, size/2);
		}
		if(n==1)
		{
			System.out.print(n + " ");
			drawH(x, y, size);
		}
	}
	
}
