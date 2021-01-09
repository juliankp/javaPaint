package javaPaint;
 
import java.awt.BasicStroke;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
 
import javax.swing.JComponent;

//colorpicker
import javax.swing.JColorChooser;

public class DrawArea extends JComponent {
 
  // Image in which we're going to draw
  private Image image;
  // Graphics2D object ==> used to draw on
  private static Graphics2D g2;
  // Mouse coordinates
  private int currentX, currentY, oldX, oldY;
  
  //Custom color for user
  public static Color color1 = new Color(255, 255, 255); 
  public static Color color2 = new Color(255, 255, 255); 
  public static Color color3 = new Color(255, 255, 255); 
  public static Color color4 = new Color(255, 255, 255); 
  public static Color color5 = new Color(255, 255, 255);
  public static Color color6 = new Color(255, 255, 255); 
 
  public DrawArea() {
	  setDoubleBuffered(false);
	  addMouseListener(new MouseAdapter() {
		  public void mousePressed(MouseEvent e) {
			  // save coord x,y when mouse is pressed
			  oldX = e.getX();
			  oldY = e.getY();
		  }
    });
 
    addMouseMotionListener(new MouseMotionAdapter() {
    	public void mouseDragged(MouseEvent e) {
    		// coord x,y when drag mouse
    		currentX = e.getX();
    		currentY = e.getY();
 
    		if (g2 != null) {
    			// draw line if g2 context not null
    			g2.setStroke(new BasicStroke(4));
    			g2.drawLine(oldX, oldY, currentX, currentY);
    			// refresh draw area to repaint
    			repaint();
    			// store current coords x,y as olds x,y
    			oldX = currentX;
    			oldY = currentY;
    		}
    	}
    });
  }
 
  protected void paintComponent(Graphics g) {
	  if (image == null) {
		  // image to draw null ==> we create
		  image = createImage(getSize().width, getSize().height);
		  g2 = (Graphics2D) image.getGraphics();
		  // enable antialiasing
		  g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		  // clear draw area
		  clear();
	  }
 
	  g.drawImage(image, 0, 0, null);
  }
 
  // now we create exposed methods
  public void clear() {
	  g2.setPaint(Color.white);
	  // draw white on entire draw area to clear
	  g2.fillRect(0, 0, getSize().width, getSize().height);
	  g2.setPaint(Color.black);
	  repaint();
  }
 
  public void red() {
	  // apply red color on g2 context
	  g2.setPaint(Color.red);
  }
 
  public void black() {
	  g2.setPaint(Color.black);
  }
 
  public void magenta() {
	  g2.setPaint(Color.magenta);
  }
 
  public void green() {
	  g2.setPaint(Color.green);
  }
 
  public void blue() {
	  g2.setPaint(Color.blue);
  }
  
  public static void useColor1() {
	  //color1 = JColorChooser.showDialog(null, "Farbauswahl", null);
	  g2.setPaint(color1);
  }
  
  public static void useColor2() {
	  //color1 = JColorChooser.showDialog(null, "Farbauswahl", null);
	  g2.setPaint(color2);
  }
  
  public static void useColor3() {
	  //color1 = JColorChooser.showDialog(null, "Farbauswahl", null);
	  g2.setPaint(color3);
  }
  public static void useColor4() {
	  //color1 = JColorChooser.showDialog(null, "Farbauswahl", null);
	  g2.setPaint(color4);
  }
  public static void useColor5() {
	  //color1 = JColorChooser.showDialog(null, "Farbauswahl", null);
	  g2.setPaint(color5);
  }
  public static void useColor6() {
	  //color1 = JColorChooser.showDialog(null, "Farbauswahl", null);
	  g2.setPaint(color6);
  }
 
}