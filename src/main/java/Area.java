public class Area {
   private int areaX = 0;
   private int areaY = 0;
   public Area(int areaX, int areaY) {
      this.areaX = areaX;
      this.areaY = areaY;
   }
   public int getAreaX() {
      return areaX;
   }
   public void setAreaX(int areaX) {
      this.areaX = areaX;
   }
   public int getAreaY() {
      return areaY;
   }
   public void setAreaY(int areaY) {
      this.areaY = areaY;
   }
   
   public boolean containsPointWithX(int x) {
      return (0 <= x) && (x <= areaX);
   }
   
   public boolean containsPointWithY(int y) {
      return (0 <= y) && (y <= areaY);
   }
}
