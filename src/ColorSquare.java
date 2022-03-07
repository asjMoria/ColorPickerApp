import java.awt.Color;
import wheels.users.ConversationBubble;
import wheels.users.Rectangle;

public class ColorSquare extends Rectangle
{
	private Slider s1;
	private Slider s2;
	private Slider s3;
	private ConversationBubble bubble;
	
	public ColorSquare(Color color, int x, int y, int w, int h, Slider s1, Slider s2, Slider s3, ConversationBubble bubble)
	{
		this.setColor(color);
		this.setLocation(x, y);
		this.setSize(w, h);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.bubble = bubble;
	}
	
	public void changeColor()
	{
		this.setColor(new Color(s1.getColorIntensity(), s2.getColorIntensity(), s3.getColorIntensity()));
		this.bubble.setText(this.colorString());
	}
	
	public String colorString()
	{
		String asString = "Red: " + s1.getColorIntensity() + "\nGreen: " + s2.getColorIntensity() + "\nBlue: " + s3.getColorIntensity();
		return asString;
	}
}
