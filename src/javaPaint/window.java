package javaPaint;

import java.awt.AWTException;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class window extends JFrame {

	private static final long serialVersionUID = 4314383898969812662L;
	
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
	public static JTextField textThickness;
	public static JButton btnClearPicture;
	public static JButton btnBlack;
	public static JButton btnBlue;
	public static JButton btnGreen;
	public static JButton btnRed;
	public static JButton btnMagenta;
	public static JButton btnScreenshot;
	public static DrawArea drawArea;
	public static JMenuItem mntmOpen;
	public static JMenuItem mntmSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window frame2 = new window();
					frame2.setVisible(true);
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
		//setResizable(false);
		// Methoden um die Buttons aus dem Windowbuildercode zu sepperieren
		initComponents();
		createEvents();
	}

	private void initComponents() {
		// create main frame
	    
	    Container content = getContentPane();
	    getContentPane().setLayout(null);
	    // create draw area
	    drawArea = new DrawArea();
	    drawArea.setBounds(132, 33, 1500, 1500);
	 
	    // add to content pane
	    content.add(drawArea);
	    
	    JLabel lblTools = new JLabel("Werkzeuge");
	    lblTools.setBounds(10, 33, 72, 14);
	    getContentPane().add(lblTools);
	    
	    JLabel lblColors = new JLabel("Farben");
	    lblColors.setBounds(10, 226, 46, 14);
	    getContentPane().add(lblColors);
	    
	    btnCustomColor1 = new JButton("");
	    btnCustomColor1.setBackground(Color.WHITE);
	    btnCustomColor1.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btnCustomColor1.setBounds(10, 409, 46, 23);
	    getContentPane().add(btnCustomColor1);
	    btnGreen = new JButton("");
	    btnGreen.setBackground(Color.GREEN);
	    btnGreen.setBounds(10, 251, 46, 23);
	    getContentPane().add(btnGreen);
	    btnBlue = new JButton("");
	    btnBlue.setBackground(Color.BLUE);
	    btnBlue.setBounds(10, 281, 46, 23);
	    getContentPane().add(btnBlue);
	    btnBlack = new JButton("");
	    btnBlack.setBackground(Color.BLACK);
	    btnBlack.setBounds(10, 315, 46, 23);
	    getContentPane().add(btnBlack);
	    btnRed = new JButton("");
	    btnRed.setBackground(Color.RED);
	    btnRed.setBounds(66, 251, 46, 23);
	    getContentPane().add(btnRed);
	    btnMagenta = new JButton("");
	    btnMagenta.setBackground(Color.MAGENTA);
	    btnMagenta.setBounds(66, 281, 46, 23);
	    getContentPane().add(btnMagenta);
	    
	    btnClearPicture = new JButton("Bild leeren");
	    btnClearPicture.setBounds(10, 192, 102, 23);
	    getContentPane().add(btnClearPicture);
	       
	    JLabel lblCustomColors = new JLabel("Angepasste Farben");
	    lblCustomColors.setBounds(10, 383, 112, 14);
	    getContentPane().add(lblCustomColors);
	       
	    btnEditCustomColors = new JButton("Bearbeiten");
		btnEditCustomColors.setBounds(10, 511, 102, 23);
	    getContentPane().add(btnEditCustomColors);
	       
	    btnCustomColor3 = new JButton("");
		   
		btnCustomColor3.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btnCustomColor3.setBackground(Color.WHITE);
	    btnCustomColor3.setBounds(10, 443, 46, 23);
	    getContentPane().add(btnCustomColor3);
	       
	    btnCustomColor4 = new JButton("");
		   
		btnCustomColor4.setBackground(Color.WHITE);
	    btnCustomColor4.setBounds(66, 443, 46, 23);
	    getContentPane().add(btnCustomColor4);
	       
	    btnCustomColor5 = new JButton("");
		  
		btnCustomColor5.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btnCustomColor5.setBackground(Color.WHITE);
	    btnCustomColor5.setBounds(10, 477, 46, 23);
	    getContentPane().add(btnCustomColor5);
	      
	    btnCustomColor6 = new JButton("");
		   
		btnCustomColor6.setBackground(Color.WHITE);
	    btnCustomColor6.setBounds(66, 477, 46, 23);
	    getContentPane().add(btnCustomColor6);
	       
	    btnCustomColor2 = new JButton("");
	    btnCustomColor2.setBackground(Color.WHITE);
		   
		btnCustomColor2.setBounds(67, 409, 45, 23);
	    getContentPane().add(btnCustomColor2);
	      
	    JLabel lblThickness = new JLabel("Dicke:");
	    lblThickness.setBounds(10, 61, 72, 14);
	    getContentPane().add(lblThickness);
	      
	    lblMouseCoords = new JLabel("0, 0");
	    lblMouseCoords.setBounds(132, 8, 62, 14);
	    getContentPane().add(lblMouseCoords);
	       
	    textThickness = new JTextField();
	    textThickness.setText("1");
	    textThickness.setBounds(55, 58, 57, 20);
	    getContentPane().add(textThickness);
	    textThickness.setColumns(10);
	       
	    btnScreenshot = new JButton("Screenshot");
		   
		btnScreenshot.setBounds(10, 165, 102, 23);
	    getContentPane().add(btnScreenshot);
	       
		setSize(754, 603);
	    // can close frame
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
	    
	    mnNewMenu = new JMenu("Datei");
	    menuBar.add(mnNewMenu);
	    
	    // select picture and load into buffered image
	    mntmOpen = new JMenuItem("\u00D6ffnen");
		
		mnNewMenu.add(mntmOpen);
	    
	    mntmSave = new JMenuItem("Speichern");
	    mnNewMenu.add(mntmSave);
		
	}
	
	public static void refreshCustomColorButtons() {
		btnCustomColor1.setBackground(DrawArea.color1);
		btnCustomColor2.setBackground(DrawArea.color2);
		btnCustomColor3.setBackground(DrawArea.color3);
		btnCustomColor4.setBackground(DrawArea.color4);
		btnCustomColor5.setBackground(DrawArea.color5);
		btnCustomColor6.setBackground(DrawArea.color6);
	}
	
	

	private void createEvents() {
		btnEditCustomColors.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		//customColors.setVisible(true);
	       		customColors form = new customColors();
	       		form.setVisible(true);
	       		//this.setVisible(false);
	       	}
	       });
		   
		   btnCustomColor3.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		DrawArea.useColor3();
	       	}
	       });
		   
		   btnCustomColor4.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		DrawArea.useColor4();
	       	}
	       });
		   
		   btnCustomColor5.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		DrawArea.useColor5();
	       	}
	       });
		   
		   btnCustomColor6.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		DrawArea.useColor6();
	       	}
	       });
		   
		   btnCustomColor2.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		DrawArea.useColor2();
	       	}
	       });
		   
		   btnScreenshot.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		setState(ICONIFIED);//minimize window for screenshot
	       		/*hier muss noch gefixt werden, dass entweder das fenster wieder minimiert wird oder
	       		* eine tastenkombination für das screenshot machen festgelegt wird
	       		*
	       		*/
	            try {
	                Robot robot = new Robot();
	                Rectangle screenRect = new Rectangle(1920, 1080);//screen color
		            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		            setExtendedState(JFrame.MAXIMIZED_BOTH);//maximize again
		            DrawArea.paintImage(screenFullImage);//send to paint to programm
	                
	            } catch (AWTException ex) {
	                System.err.println(ex);
	            }
	           
	       	}
	       }); 
		   
		   btnCustomColor1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		DrawArea.useColor1();
	    	}
	    });
		
		mntmOpen.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		JFileChooser chooser = new JFileChooser();
	    		
	    		FileFilter filterJPG = new FileNameExtensionFilter("Bilder", "jpg", "gif", "png");	    		
	    		chooser.setFileFilter(filterJPG);
	    		
	    		int response = chooser.showDialog(chooser, "Bild öffnen");
	    		
	    		if (response == JFileChooser.APPROVE_OPTION) {
	    			try {
	    				//try to load image that was selected with the dialog into a BufferedImage
	    				BufferedImage img = ImageIO.read(new File(chooser.getSelectedFile().getAbsolutePath()));
	    				DrawArea.paintImage(img);
	    			} catch (IOException e1) {
	    			}
	    		}
	    		else {
	    			System.out.println("Bild laden abgebrochen");
	    		}
	    	}
	    }); 
		
		mntmSave.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//create a new file chooser object
	    		JFileChooser chooser = new JFileChooser();
	    		
	    		//add the diffrend filetype filters to the file chooser to filter them
	    		FileFilter filterJPG = new FileNameExtensionFilter("JPEG Bild", "jpg");	    		
	    		chooser.setFileFilter(filterJPG);
	    		
	    		FileFilter filterGIF = new FileNameExtensionFilter("GIF Bild", "gif");
	    		chooser.setFileFilter(filterGIF);
	    		
	    		FileFilter filterPNG = new FileNameExtensionFilter("PNG Bild", "png");
	    		chooser.setFileFilter(filterPNG);	    		
	    		
	    		//show dialog and save response for if/else decision if user canceled operation or
	    		//made the right decison
	    		int response = chooser.showDialog(chooser, "Bild speichern");
	    		
	    		if(response == JFileChooser.APPROVE_OPTION) {
	    			//get all file extentions into a String list
	    			String[] exts = ((FileNameExtensionFilter)chooser.getFileFilter()).getExtensions();
	    			
	    			//put together the complete path with the file extention
	    			String filepath = chooser.getSelectedFile().toString() + "." + exts[0];
	    			System.out.println(filepath);
	    			DrawArea.save(filepath);
	    		} 
	    		else {
	    			System.out.println("Bild speichern abgebrochen");
	    		}
	    		
	    	}
	    });		
		
	    btnMagenta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DrawArea.magenta();	
			}
		});
	    
	    btnRed.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DrawArea.red();
			}
		});
	    
	    btnBlack.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DrawArea.black();
			}
		});
	    
	    btnBlue.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DrawArea.blue();
			}
		});
	    
	    btnGreen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				DrawArea.green();
			}
		});
		
	}
}
