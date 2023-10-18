import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;


public class Seite_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtBezahlungh;
	private JTextField txtKlasselehrender;
	private JTextField txtNamelehrender;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seite_2 frame = new Seite_2();
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
	public Seite_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBezahlungh = new JTextField();
		txtBezahlungh.setText("Bezahlung \u20AC/h");
		txtBezahlungh.setBounds(38, 54, 107, 20);
		contentPane.add(txtBezahlungh);
		txtBezahlungh.setColumns(10);
		
		txtKlasselehrender = new JTextField();
		txtKlasselehrender.setText("Klasse (Lehrender)");
		txtKlasselehrender.setBounds(38, 113, 107, 20);
		contentPane.add(txtKlasselehrender);
		txtKlasselehrender.setColumns(10);
		
		txtNamelehrender = new JTextField();
		txtNamelehrender.setText("Name (Lehrender)");
		txtNamelehrender.setBounds(201, 54, 100, 20);
		contentPane.add(txtNamelehrender);
		txtNamelehrender.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(201, 113, 100, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}

}
