import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

         


public class AntragstellerDesign extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtNachname;
	private JTextField txtAdresse;
	private JTextField txtIban;
	private JTextField txtBezahlungsart;

	static ArrayList<Antragsteller> anli = new ArrayList<Antragsteller>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AntragstellerDesign frame = new AntragstellerDesign();
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
	public AntragstellerDesign() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Name
		txtName = new JTextField();
		txtName.setBounds(31, 52, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		
		//Nachname
		txtNachname = new JTextField();
		txtNachname.setBounds(141, 52, 86, 20);
		contentPane.add(txtNachname);
		txtNachname.setColumns(10);
		
		
		//Adresse
		txtAdresse = new JTextField();
		txtAdresse.setBounds(254, 52, 86, 20);
		contentPane.add(txtAdresse);
		txtAdresse.setColumns(10);
		
		
		//Iban
		txtIban = new JTextField();
		txtIban.setBounds(31, 141, 86, 20);
		contentPane.add(txtIban);
		txtIban.setColumns(10);
		
		
		//Bezahlungsart
		txtBezahlungsart = new JTextField();
		txtBezahlungsart.setBounds(141, 141, 86, 20);
		contentPane.add(txtBezahlungsart);
		txtBezahlungsart.setColumns(10);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(31, 25, 86, 14);
		contentPane.add(lblName);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(141, 25, 86, 14);
		contentPane.add(lblNachname);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(254, 25, 86, 14);
		contentPane.add(lblAdresse);
		
		JLabel lblIban = new JLabel("Iban");
		lblIban.setBounds(31, 116, 86, 14);
		contentPane.add(lblIban);
		
		JLabel lblBezahlunsart = new JLabel("Bezahlunsart");
		lblBezahlunsart.setBounds(141, 116, 86, 14);
		contentPane.add(lblBezahlunsart);
		
		JLabel lblAusgabe = new JLabel("");
		lblAusgabe.setBounds(31, 229, 224, 33);
		contentPane.add(lblAusgabe);
		
		JButton btnButton = new JButton("New button");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = txtName.getText();
				String nachname = txtNachname.getText();
				String adresse = txtAdresse.getText();
				String iban = txtIban.getText();
				String bezahlungsart = txtBezahlungsart.getText();
				Antragsteller tmp = new Antragsteller(name,nachname,adresse,iban,bezahlungsart) {};
				lblAusgabe.setText(tmp.toString());
				anli.add(tmp);
			}
		});
		btnButton.setBounds(254, 140, 89, 23);
		contentPane.add(btnButton);
		
		 String comboBoxListe[] = {};
		 
		JComboBox comboBox = new JComboBox(comboBoxListe);
		comboBox.setBounds(398, 52, 116, 20);
		contentPane.add(comboBox);
		
		
	}
}
