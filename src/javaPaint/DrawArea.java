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
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class DrawArea extends JComponent {
 
  // Image in which we're going to draw
  private static Image image;
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
    		//set coords to lbl in window
    		window.lblMouseCoords.setText(currentX + ", " + currentY);
 
    		if (g2 != null) {
    			// draw line if g2 context not null
    			g2.setStroke(new BasicStroke(Integer.valueOf(window.textThickness.getText())));
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
  
  public static void save(String pathAndFilename) {
	    try {
	    		//TODO need to add a functionality that read out size to not save unnessesary white space
	            ImageIO.write((RenderedImage) image, "png", new File(pathAndFilename));
	            
	    } catch (IOException e) {
	            e.printStackTrace();
	    }
  }
 
  public static void red() {
	  // apply red color on g2 context
	  g2.setPaint(Color.red);
  }
 
  public static void black() {
	  g2.setPaint(Color.black);
  }
 
  public static void magenta() {
	  g2.setPaint(Color.magenta);
  }
 
  public static void green() {
	  g2.setPaint(Color.green);
  }
 
  public static void blue() {
	  g2.setPaint(Color.blue);
  }
  
  public static void useColor1() {
	  g2.setPaint(color1);
  }
  
  public static void useColor2() {
	  g2.setPaint(color2);
  }
  
  public static void useColor3() {
	  g2.setPaint(color3);
  }
  public static void useColor4() {
	  g2.setPaint(color4);
  }
  public static void useColor5() {
	  g2.setPaint(color5);
  }
  public static void useColor6() {
	  g2.setPaint(color6);
  }
 
  public static void paintImage(BufferedImage img) {
	  int width = img.getWidth();
	  int height = img.getHeight();	  
	  
	  System.out.println(width + " " + height);
	  window.drawArea.setBounds(132, 33, width, height);
	  
	  System.out.println(window.drawArea.getHeight());
	  
	  g2.drawImage(img, null, 0, 0);
  }
}