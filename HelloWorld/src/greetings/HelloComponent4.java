package greetings;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

public class HelloComponent4 extends JComponent 
implements MouseMotionListener, ActionListener, Runnable {

	String theMessage;
	int messageX = 125, messageY = 95;
	JButton theButton;
	
	int colourIndex;
	static Color[] someColours = { Color.RED, Color.GREEN };
	
	boolean blinkState;
	
	public HelloComponent4(String message)
	{
		theMessage = message;
		theButton = new JButton("Change colour");
		setLayout(new FlowLayout());
		
		add(theButton);
		theButton.addActionListener(this);
		addMouseMotionListener(this);
		
		Thread t = new Thread(this);
		t.start();
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(blinkState ? getBackground() : currentColour());
		g.drawString(theMessage, messageX, messageY);
	}
	
	private Color currentColour() {
		return someColours[colourIndex];
	}
	
	synchronized private void changeColour()
	{
		if (++colourIndex == someColours.length)
		{
			colourIndex = 0;
		}
		
		setForeground(currentColour());
		repaint();
	}

	@Override
	public void run() {
		try
		{
			while(true)
			{
				blinkState = !blinkState;
				repaint();
				Thread.sleep(300);
			}
		}
		catch (InterruptedException e)
		{
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == theButton)
		{
			changeColour();
		}
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		
	}

}
