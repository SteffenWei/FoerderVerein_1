import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;

import javax.swing.Box;
import javax.swing.JComboBox;


public class MitgliederTest extends JFrame {

	private JPanel contentPane;
	
private static ArrayList<Mitglieder> mili = new ArrayList<Mitglieder>();
private JTextField txtname;
private JTextField txtnachname;
private JLabel lblNewLabel;
private JTextField txtanmeldename;
private JLabel lblPasswort;
private JTextField txtpasswort;
private JLabel lblAdresse;
private JTextField txtadresse;
private JLabel lblIban;
private JTextField txtiban;
private JLabel lblergebnis;
private JButton btnNewButton;
private JComboBox<String> boxliste;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MitgliederTest frame = new MitgliederTest();
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
    
	
	
	
	
	
		public MitgliederTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//name
		txtname = new JTextField();
		txtname.setBounds(23, 34, 86, 20);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(41, 11, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(138, 11, 62, 14);
		contentPane.add(lblNachname);
		
		//nachname
		txtnachname = new JTextField();
		txtnachname.setBounds(129, 34, 86, 20);
		contentPane.add(txtnachname);
		txtnachname.setColumns(10);
		
		
		lblNewLabel = new JLabel("Anmeldename");
		lblNewLabel.setBounds(236, 11, 78, 14);
		contentPane.add(lblNewLabel);
		
		//anmeldename
		txtanmeldename = new JTextField();
		txtanmeldename.setBounds(225, 34, 86, 20);
		contentPane.add(txtanmeldename);
		txtanmeldename.setColumns(10);
		
		
		lblPasswort = new JLabel("Passwort");
		lblPasswort.setBounds(33, 65, 46, 14);
		contentPane.add(lblPasswort);
		
		//passwort
		txtpasswort = new JTextField();
		txtpasswort.setBounds(23, 90, 86, 20);
		contentPane.add(txtpasswort);
		txtpasswort.setColumns(10);
		
		
		lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(129, 65, 46, 14);
		contentPane.add(lblAdresse);
		
		//adresse
		txtadresse = new JTextField();
		txtadresse.setBounds(129, 90, 86, 20);
		contentPane.add(txtadresse);
		txtadresse.setColumns(10);
		
		
		lblIban = new JLabel("Iban");
		lblIban.setBounds(225, 65, 46, 14);
		contentPane.add(lblIban);
		
		//IBan
		txtiban = new JTextField();
		txtiban.setBounds(225, 90, 86, 20);
		contentPane.add(txtiban);
		txtiban.setColumns(10);
		

		btnNewButton = new JButton("Schmitz sagt JA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String iban = txtiban.getText();
				String name = txtname.getText();
				String nachname = txtnachname.getText();
				String anmeldename = txtanmeldename.getText();
				String passwort = txtpasswort.getText();
				String adresse = txtadresse.getText();
				Mitglieder tpm = new Mitglieder(name, nachname, anmeldename, passwort, adresse, iban) {};
				lblergebnis.setText(tpm.toString());
				boxliste.addItem(tpm.getNachname());
				contentPane.repaint();
			}
		});
		btnNewButton.setBounds(23, 121, 288, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		
		lblergebnis = new JLabel("");
		lblergebnis.setForeground(Color.BLACK);
		lblergebnis.setBackground(Color.PINK);
		lblergebnis.setBounds(23, 168, 268, 14);
		contentPane.add(lblergebnis);
		
		boxliste = new JComboBox<String>();
		boxliste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
			
		});
		boxliste.setBounds(337, 34, 87, 205);
		contentPane.add(boxliste);
		
		
		
	}
}
