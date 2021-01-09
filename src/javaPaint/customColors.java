package javaPaint;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customColors extends JFrame {

	private JPanel contentPane;
	private JButton btnSetColor3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customColors frame = new customColors();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public customColors() {
		setResizable(false);
		setTitle("Farben anpassen");
		setDefaultCloseOperation(customColors.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 285, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClose = new JButton("Schlie\u00DFen");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.refreshCustomColorButtons();
				/* eigendlich muss hier noch eine close funktion hin
				   aber selbst nach langen suchen im Internet konnte
				   ich nicht finden wie das gehen soll lel
				*/
			}
		});
		btnClose.setBounds(164, 154, 104, 23);
		contentPane.add(btnClose);
		
		JButton btnSetColor1 = new JButton("");
		btnSetColor1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrawArea.color1 = JColorChooser.showDialog(null, "Farbauswahl", null);
				btnSetColor1.setBackground(DrawArea.color1);
			}
		});
		btnSetColor1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSetColor1.setBackground(DrawArea.color1);
		btnSetColor1.setBounds(10, 11, 46, 23);
		contentPane.add(btnSetColor1);
		
		JButton btnSetColor2 = new JButton("");
		btnSetColor2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrawArea.color2 = JColorChooser.showDialog(null, "Farbauswahl", null);
				btnSetColor2.setBackground(DrawArea.color2);
			}
		});
		btnSetColor2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSetColor2.setBackground(DrawArea.color2);
		btnSetColor2.setBounds(65, 11, 46, 23);
		contentPane.add(btnSetColor2);
		
		btnSetColor3 = new JButton("");
		btnSetColor3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrawArea.color3 = JColorChooser.showDialog(null, "Farbauswahl", null);
				btnSetColor3.setBackground(DrawArea.color3);
			}
		});
		btnSetColor3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSetColor3.setBackground(DrawArea.color3);
		btnSetColor3.setBounds(10, 40, 46, 23);
		contentPane.add(btnSetColor3);
		
		JButton btnSetColor4 = new JButton("");
		btnSetColor4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrawArea.color4 = JColorChooser.showDialog(null, "Farbauswahl", null);
				btnSetColor4.setBackground(DrawArea.color4);
			}
		});
		btnSetColor4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSetColor4.setBackground(DrawArea.color4);
		btnSetColor4.setBounds(65, 40, 46, 23);
		contentPane.add(btnSetColor4);
		
		JButton btnSetColor5 = new JButton("");
		btnSetColor5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrawArea.color5 = JColorChooser.showDialog(null, "Farbauswahl", null);
				btnSetColor5.setBackground(DrawArea.color5);
			}
		});
		btnSetColor5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSetColor5.setBackground(DrawArea.color5);
		btnSetColor5.setBounds(10, 74, 46, 23);
		contentPane.add(btnSetColor5);
		
		JButton btnSetColor6 = new JButton("");
		btnSetColor6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DrawArea.color6 = JColorChooser.showDialog(null, "Farbauswahl", null);
				btnSetColor6.setBackground(DrawArea.color6);
			}
		});
		btnSetColor6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSetColor6.setBackground(DrawArea.color6);
		btnSetColor6.setBounds(65, 74, 46, 23);
		contentPane.add(btnSetColor6);
	}
}
