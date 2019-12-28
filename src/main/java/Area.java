public class Area {
	private int X = 0;
	private int Y = 0;
	public Area(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
	public boolean containsPointWithX(int x) {
		return (0 <= x) && (x <= X);
	}
	
	public boolean containsPointWithY(int y) {
		return (0 <= y) && (y <= Y);
	}
}