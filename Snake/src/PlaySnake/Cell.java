package PlaySnake;
/**
 * 
 * @author azl11
 *haah1134543
 */
public class Cell {
	 int l=25; 
	 int x;
	 int y;
	 Cell(){
		 this(0, 0);
	 }
	
	Cell(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
