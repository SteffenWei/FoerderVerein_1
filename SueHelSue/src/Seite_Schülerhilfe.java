import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;


public class Seite_Schülerhilfe extends JFrame {

	private JPanel contentPane;
	private JTextField txt_1;
	private JTextField txtZeit;
	private JTextField txtKlasse;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seite_Schülerhilfe frame = new Seite_Schülerhilfe();
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
	public Seite_Schülerhilfe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_1 = new JTextField();
		txt_1.setText("Fach");
		txt_1.setBounds(10, 108, 86, 20);
		contentPane.add(txt_1);
		txt_1.setColumns(10);
		
		txtZeit = new JTextField();
		txtZeit.setText("Zeit");
		txtZeit.setBounds(126, 108, 86, 20);
		contentPane.add(txtZeit);
		txtZeit.setColumns(10);
		
		txtKlasse = new JTextField();
		txtKlasse.setText("Klasse (Sch\u00FCler)");
		txtKlasse.setBounds(126, 65, 86, 20);
		contentPane.add(txtKlasse);
		txtKlasse.setColumns(10);
		
		txtName = new JTextField();
		txtName.setText("Name (Person)");
		txtName.setBounds(10, 65, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JButton btnNewButton = new JButton("Eingabe");
		btnNewButton.setBounds(277, 83, 89, 23);
		contentPane.add(btnNewButton);
	}
}
