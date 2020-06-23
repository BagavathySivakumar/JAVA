import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
/*<APPLET code="grid" width=300 height=300></APPLET>*/
public class grid extends Applet implements Runnable{
	
	int x;int y;int w;
	public void init()
	{
		try
		{
			Thread.sleep(200);
		}
		catch(Exception e)
		{
		}
	}
	public void run()
	{
		x=20;
		y=30;
	}
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);
		w=getWidth();
		g.drawLine(0,75,w,75);
		g.setColor(Color.red);
		g.fillRect(x,20,80,40);
		g.setColor(Color.black);
		g.fillOval(x+10,50,20,30);
		g.fillOval(x+60,50,20,30);
		x=x+10;
		init();
		if(x+50<w)
		{
			repaint();
		}
		else
		{
			repaint();
			x=20;
			y+=30;
	}
}
}