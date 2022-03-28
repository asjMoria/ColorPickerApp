import java.awt.Color;
import wheels.users.ConversationBubble;
import wheels.users.Frame;

public class App extends Frame
{
	private Slider slider1;
	private Slider slider2;
	private Slider slider3;
	private ColorSquare cs;
	private ConversationBubble bubble;
	
	public static void main(String[] args)
	{
		new App();
	}
	
	public App()
	{
		slider1 = new Slider(Color.RED, 10, 320, 680, 50);
		slider2 = new Slider(Color.GREEN, 10, 380, 680, 50);
		slider3 = new Slider(Color.BLUE, 10, 440, 680, 50);
		bubble = new ConversationBubble("");
		bubble.setLocation(400, 50);
		bubble.setTail(410, 200);
		bubble.setFrameThickness(4);
		cs = new ColorSquare(Color.BLACK, 50, 30, 255, 255, slider1, slider2, slider3, bubble);
		slider1.setColorSquare(cs);
		slider2.setColorSquare(cs);
		slider3.setColorSquare(cs);
	}
}
