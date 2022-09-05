package Game;

public class Player {
	
	private String icon = ""; 
	
	private int x = 0;
	private int y = 0;

	private int width = 3;
	private int height = 3;
	private int shots = 0;
	private int score = 0;
	private int maxShots = 5;
	
	
	public Player(int score)
	{
		this.shots = shots;
		
	}
	
	
	
	public Player(String icon, int x, int y, int width, int height, int shots, int score, int maxShots) {
		this(shots);
		this.icon = icon;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.score = score;
		this.maxShots = maxShots;
	}



	void reload()
	{	
		
		int currentShots = 0; 
		currentShots = maxShots;
		
	}
	
	void shoot()
	{
		if(shots > 0)
		{
			maxShots-=1;
		}
		
	}
	
	void onhit()
	{
		this.score +=1;
	}
	
	
}
