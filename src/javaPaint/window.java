package javaPaint;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class window extends JFrame {

	private JPanel contentPane;
	
	//neu
	JButton btnClearPicture, blackBtn, blueBtn, greenBtn, redBtn, magentaBtn;
	DrawArea drawArea;
	
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
	public static JButton btnCustomColor1;
	public static JMenuBar menuBar;
	public static JMenu mnNewMenu;
	public static JButton btnNewButton_2;
	//public static JButton btnCustomColor2;
	public static JButton btnCustomColor3;
	public static JButton btnCustomColor4;
	public static JButton btnCustomColor5;
	public static JButton btnCustomColor6;
	public static JButton btnCustomColor2;

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
	    drawArea.setBounds(132, 33, 596, 495);
	 
	    // add to content pane
	    content.add(drawArea);
	    
	    JLabel lblNewLabel = new JLabel("Werkzeuge");
	    lblNewLabel.setBounds(10, 33, 72, 14);
	    frame.getContentPane().add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("Farben");
	    lblNewLabel_1.setBounds(10, 226, 46, 14);
	    frame.getContentPane().add(lblNewLabel_1);
	    
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
	       btnClearPicture.setBounds(10, 192, 108, 23);
	       frame.getContentPane().add(btnClearPicture);
	       
	       JLabel lblNewLabel_2 = new JLabel("Angepasste Farben");
	       lblNewLabel_2.setBounds(10, 383, 112, 14);
	       frame.getContentPane().add(lblNewLabel_2);
	       
	       btnNewButton_2 = new JButton("Bearbeiten");
	       btnNewButton_2.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		//customColors.setVisible(true);
	       		customColors form = new customColors();
	       		form.setVisible(true);
	       		//this.setVisible(false);
	       	}
	       });
	       btnNewButton_2.setBounds(10, 511, 89, 23);
	       frame.getContentPane().add(btnNewButton_2);
	       
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
	 
	    frame.setSize(754, 636);
	    // can close frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    menuBar = new JMenuBar();
	    frame.setJMenuBar(menuBar);
	    
	    mnNewMenu = new JMenu("Datei");
	    menuBar.add(mnNewMenu);
	    
	    JMenuItem mntmNewMenuItem = new JMenuItem("\u00D6ffnen");
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
