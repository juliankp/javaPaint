package javaPaint;

import java.awt.AWTException;
import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class window extends JFrame {

	public JPanel contentPane;
	
	//neu
	JButton btnClearPicture, blackBtn, blueBtn, greenBtn, redBtn, magentaBtn;
	static DrawArea drawArea;
	
	ActionListener actionListener = new ActionListener() {
		  
	public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnClearPicture) {
		        drawArea.clear();
		    } 
			else if (e.getSource() == blackBtn) {
		        drawArea.black();
		    } 
			else if (e.getSource() == blueBtn) {
		        drawArea.blue();
		    } 
			else if (e.getSource() == greenBtn) {
		        drawArea.green();
		    } 
			else if (e.getSource() == redBtn) {
		        drawArea.red();
		    } 
			else if (e.getSource() == magentaBtn) {
		        drawArea.magenta();
		    }
		    }
	};
	public static JMenuBar menuBar;
	public static JMenu mnNewMenu;
	public static JButton btnEditCustomColors;
	public static JButton btnCustomColor1;
	public static JButton btnCustomColor2;
	public static JButton btnCustomColor3;
	public static JButton btnCustomColor4;
	public static JButton btnCustomColor5;
	public static JButton btnCustomColor6;
	public static JLabel lblMouseCoords;
	public static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window frame = new window();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public window() {

		// create main frame
	    JFrame frame = new JFrame("javaPaint");
	    
	    Container content = frame.getContentPane();
	    frame.getContentPane().setLayout(null);
	    // create draw area
	    drawArea = new DrawArea();
	    drawArea.setBounds(132, 33, 1500, 1500);
	 
	    // add to content pane
	    content.add(drawArea);
	    
	    JLabel lblTools = new JLabel("Werkzeuge");
	    lblTools.setBounds(10, 33, 72, 14);
	    frame.getContentPane().add(lblTools);
	    
	    JLabel lblColors = new JLabel("Farben");
	    lblColors.setBounds(10, 226, 46, 14);
	    frame.getContentPane().add(lblColors);
	    
	    btnCustomColor1 = new JButton("");
	    btnCustomColor1.setBackground(Color.WHITE);
	    btnCustomColor1.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btnCustomColor1.setBounds(10, 409, 46, 23);
	    frame.getContentPane().add(btnCustomColor1);
	    greenBtn = new JButton("");
	    greenBtn.setBackground(Color.GREEN);
	    greenBtn.setBounds(10, 251, 46, 23);
	    frame.getContentPane().add(greenBtn);
	    blueBtn = new JButton("");
	    blueBtn.setBackground(Color.BLUE);
	    blueBtn.setBounds(10, 281, 46, 23);
	    frame.getContentPane().add(blueBtn);
	    blackBtn = new JButton("");
	    blackBtn.setBackground(Color.BLACK);
	    blackBtn.setBounds(10, 315, 46, 23);
	    frame.getContentPane().add(blackBtn);
	    redBtn = new JButton("");
	    redBtn.setBackground(Color.RED);
	    redBtn.setBounds(66, 251, 46, 23);
	    frame.getContentPane().add(redBtn);
	    magentaBtn = new JButton("");
	    magentaBtn.setBackground(Color.MAGENTA);
	    magentaBtn.setBounds(66, 281, 46, 23);
	    frame.getContentPane().add(magentaBtn);
	    
	       btnClearPicture = new JButton("Bild leeren");
	       btnClearPicture.setBounds(10, 192, 102, 23);
	       frame.getContentPane().add(btnClearPicture);
	       
	       JLabel lblCustomColors = new JLabel("Angepasste Farben");
	       lblCustomColors.setBounds(10, 383, 112, 14);
	       frame.getContentPane().add(lblCustomColors);
	       
	       btnEditCustomColors = new JButton("Bearbeiten");
	       btnEditCustomColors.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		//customColors.setVisible(true);
	       		customColors form = new customColors();
	       		form.setVisible(true);
	       		//this.setVisible(false);
	       	}
	       });
	       btnEditCustomColors.setBounds(10, 511, 102, 23);
	       frame.getContentPane().add(btnEditCustomColors);
	       
	       btnCustomColor3 = new JButton("");
	       btnCustomColor3.setFont(new Font("Tahoma", Font.PLAIN, 10));
	       btnCustomColor3.setBackground(Color.WHITE);
	       btnCustomColor3.setBounds(10, 443, 46, 23);
	       frame.getContentPane().add(btnCustomColor3);
	       
	       btnCustomColor4 = new JButton("");
	       btnCustomColor4.setBackground(Color.WHITE);
	       btnCustomColor4.setBounds(66, 443, 46, 23);
	       frame.getContentPane().add(btnCustomColor4);
	       
	       btnCustomColor5 = new JButton("");
	       btnCustomColor5.setFont(new Font("Tahoma", Font.PLAIN, 10));
	       btnCustomColor5.setBackground(Color.WHITE);
	       btnCustomColor5.setBounds(10, 477, 46, 23);
	       frame.getContentPane().add(btnCustomColor5);
	       
	       btnCustomColor6 = new JButton("");
	       btnCustomColor6.setBackground(Color.WHITE);
	       btnCustomColor6.setBounds(66, 477, 46, 23);
	       frame.getContentPane().add(btnCustomColor6);
	       
	       btnCustomColor2 = new JButton("");
	       btnCustomColor2.setBackground(Color.WHITE);
	       btnCustomColor2.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		DrawArea.useColor2();
	       	}
	       });
	       btnCustomColor2.setBounds(67, 409, 45, 23);
	       frame.getContentPane().add(btnCustomColor2);
	       
	       JLabel lblThickness = new JLabel("Dicke:");
	       lblThickness.setBounds(10, 61, 72, 14);
	       frame.getContentPane().add(lblThickness);
	       
	       lblMouseCoords = new JLabel("0, 0");
	       lblMouseCoords.setBounds(132, 8, 62, 14);
	       frame.getContentPane().add(lblMouseCoords);
	       
	       textField = new JTextField();
	       textField.setText("1");
	       textField.setBounds(55, 58, 57, 20);
	       frame.getContentPane().add(textField);
	       textField.setColumns(10);
	       
	       JButton btnNewButton = new JButton("Screenshot");
	       btnNewButton.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		frame.setState(frame.ICONIFIED);//minimize window for screenshot

	            try {
	                Robot robot = new Robot();
	                Rectangle screenRect = new Rectangle(1920, 1080);//screen color
		            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);//maximize again
		            DrawArea.paintImage(screenFullImage);//send to paint to programm
	                
	            } catch (AWTException ex) {
	                System.err.println(ex);
	            }
	           
	       	}
	       });
	       btnNewButton.setBounds(10, 165, 102, 23);
	       frame.getContentPane().add(btnNewButton);
	       
	       
	    magentaBtn.addActionListener(actionListener);
	    redBtn.addActionListener(actionListener);
	    blackBtn.addActionListener(actionListener);
	    blueBtn.addActionListener(actionListener);
	    greenBtn.addActionListener(actionListener);
	    
	    btnCustomColor1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		DrawArea.useColor1();
	    	}
	    });
	 
	    frame.setSize(754, 603);
	    // can close frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    menuBar = new JMenuBar();
	    frame.setJMenuBar(menuBar);
	    
	    mnNewMenu = new JMenu("Datei");
	    menuBar.add(mnNewMenu);
	    
	    // select picture and load into buffered image
	    JMenuItem mntmNewMenuItem = new JMenuItem("\u00D6ffnen");
	    mntmNewMenuItem.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		FileDialog fd = new FileDialog(frame, "Choose a file", FileDialog.LOAD);
	    		fd.setDirectory("C:\\");
	    		//fd.setFile("*.png");//dateiformat beschränken auf png
	    		fd.setVisible(true);
	    		String filename = fd.getFile();
	    		String path = fd.getDirectory();
	    		String pathAndFilename = path + filename;
	    		System.out.println(pathAndFilename);
	    		
	    		if (filename == null) {
	    			System.out.println("You cancelled the choice");
	    		}
	    		else {
	    			try {
	    				//try to load image that was selected with the dialog into a BufferedImage
	    				BufferedImage img = ImageIO.read(new File(pathAndFilename));
	    				DrawArea.paintImage(img);
	    			} catch (IOException e1) {
	    			}
	    		}
	    	}
	    });
	    mnNewMenu.add(mntmNewMenuItem);
	    
	    JMenuItem mntmNewMenuItem_1 = new JMenuItem("Speichern");
	    mnNewMenu.add(mntmNewMenuItem_1);
	    // show the swing paint result
	    frame.setVisible(true);
	 
	}
	
	public static void refreshCustomColorButtons() {
		btnCustomColor1.setBackground(DrawArea.color1);
		btnCustomColor2.setBackground(DrawArea.color2);
		btnCustomColor3.setBackground(DrawArea.color3);
		btnCustomColor4.setBackground(DrawArea.color4);
		btnCustomColor5.setBackground(DrawArea.color5);
		btnCustomColor6.setBackground(DrawArea.color6);
	}
}
