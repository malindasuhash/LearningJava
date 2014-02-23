package greetings;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthViewportUI;

public class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener  {

	String theMessage;
	int messageX = 125, messageY = 95;
	JButton theButton;
	
	int colourIndex;
	static Color[] someColours = { Color.green, Color.blue };
	
	public HelloComponent3(String message)
	{
		theMessage = message;
		theButton = new JButton("Change colour");
		setLayout(new FlowLayout());
		add(theButton);
		theButton.addActionListener(this);
		addMouseMotionListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawString(theMessage, messageX, messageY);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == theButton)
		{
			changeColour();
		}
	}

	synchronized private void changeColour() {
		
		if (++colourIndex == someColours.length)
		{
			colourIndex = 0;			
		}
		
		setForeground(currentColour());
		repaint();
	}

	synchronized private Color currentColour() {
		return someColours[colourIndex];
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
