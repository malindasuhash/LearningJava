package greetings;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class HelloComponent2 extends JComponent implements MouseMotionListener
{

	String theMessage;
	int messageX = 125, messageY = 95;
	
	public HelloComponent2(String message)
	{
		theMessage = message;
		addMouseMotionListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawString(theMessage, messageX, messageY);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}