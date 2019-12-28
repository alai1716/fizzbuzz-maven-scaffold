public class Rover {
	public static final String EAST = "E"; //东
	public static final String NORTH = "N"; //北
	public static final String SOUTH = "S"; //南
	public static final String WEST  = "W"; //西
	private Area area;
	private int x = 0;
	private int y = 0;
	private String direction;
	
	public void land(Area area, int x, int y, String direction) throws Exception {
		if (!area.containsPointWithX(x)) {
			throw new Exception("x=" + x + " is out of area");
		}
		if (!area.containsPointWithY(y)) {
			throw new Exception("Y=" + y + " is out of area");
		}
		this.area = area;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public String getPosition() {
		return "" + x +  y + direction;
	}

	public void move() throws Exception {
		if (NORTH.equals(direction)) {
			y++;
		} else if (SOUTH.equals(direction) && y > 0) {
			y--;
		} else if (EAST.equals(direction)) {
			x++;
		} else if (WEST.equals(direction) && x > 0) {
			x--;
		}
		
		if (!area.containsPointWithX(x)) {
			throw new Exception("不能移动到区域外");
		}
		
		if (!area.containsPointWithY(y)) {
			throw new Exception("不能移动到区域外");
		}
	}
	
	public void turnLeft() {
		if (NORTH.equals(direction)) {
    		direction = WEST;
		} else if (SOUTH.equals(direction)) {
			direction = EAST;
		} else if (EAST.equals(direction)) {
			direction = NORTH;
		} else if (WEST.equals(direction)) {
			direction = SOUTH;
		}
	}
	
    public void turnRight() {
    	if (NORTH.equals(direction)) {
    		direction = EAST;
		} else if (SOUTH.equals(direction)) {
			direction = WEST;
		} else if (EAST.equals(direction)) {
			direction = SOUTH;
		} else if (WEST.equals(direction)) {
			direction = NORTH;
		}
	}
	
}
