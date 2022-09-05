package Game;
import java.awt.Color;

import view.GameFrame;
import view.GameFrameWork;
import view.Message;

public class Controller {
	
	public Controller()
	{
		GameFrameWork gameFramework = new GameFrameWork();
		gameFramework.setSize(1500,1000);
		gameFramework.setBackgroundColor(Color.MAGENTA);
		Message message  = new Message("Du bist cool!",200,100,48,Color.BLACK);
		gameFramework.addMessage(message);
		Message message2 = new Message("Hello!!",100,400,50,Color.CYAN);
		gameFramework.addMessage(message2);

	}
		
	
}
