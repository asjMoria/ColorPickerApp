import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.Line;
import wheels.users.Rectangle;

public class Slider extends Rectangle
{
	private Line mark;
	private Color mainColor;
	private int colorIntensity;
	private ColorSquare cs;
	
	public Slider(Color color, int x, int y, int w, int h)
	{
		cs = null;
		mainColor = color;
		this.setColor(Color.BLACK);
		this.setLocation(x, y);
		this.setSize(w, h);
		
		mark = new Line();
		mark.setColor(Color.BLACK);
		mark.setPoints(x, y, x, y + h);
		mark.setThickness(3);
	}
	
	public void setColorSquare(ColorSquare cs)
	{
		this.cs = cs;
	}
	
	private void eventful(MouseEvent e)
	{
		if (e.getX() <= (this.getWidth() + this.getXLocation()) && e.getX() >= this.getXLocation())
		{
			mark.setPoints(e.getX(), this.getYLocation(), e.getX(), this.getYLocation() + this.getHeight());
		}
		changeColor();
	}
	
	public void mousePressed(MouseEvent e)
	{
		eventful(e);
	}
	
	public void mouseDragged(MouseEvent e)
	{
		eventful(e);
	}
	
	public void changeColor()
	{
		colorIntensity = (int)(((mark.getX1() - this.getXLocation()) * 1.0  / this.getWidth()) * 255);
		if (mainColor.equals(Color.RED))
		{
			this.setColor(new Color(colorIntensity, 0, 0));
		}
		else if (mainColor.equals(Color.GREEN))
		{
			this.setColor(new Color(0, colorIntensity, 0));
		}
		else if (mainColor.equals(Color.BLUE))
		{
			this.setColor(new Color(0, 0, colorIntensity));
		}
		cs.changeColor();
	}
	
	public int getColorIntensity()
	{
		return colorIntensity;
	}
}
