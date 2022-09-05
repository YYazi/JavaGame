package Game;

public class Kugel {
	
	
	//Koordinaten
	private int x = 0;
	private int y = 0;
	
	//Breite und Höhe der Kugel
	private int width = 2;
	private int height = 2;
	private String icon = "";
	
	private int velocity = 4;
	
	public Kugel(int y)
	{
		this.y = y;
	}
	
	
	
	
	public Kugel(int y, int x, int width, int height, String icon, int velocity) {
		this(y);
		this.x = x;
		this.width = width;
		this.height = height;
		this.icon = icon;
		this.velocity = velocity;
	}



	public int getY() {
		return y;
	}




	public void setY(int y) {
		this.y = y;
	}




	public void move()
	{
		y-= velocity;
	}
	
}
