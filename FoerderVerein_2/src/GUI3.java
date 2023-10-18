import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.Canvas;


public class GUI3 extends JFrame {

	private JPanel contentPane;
	private JTextField txt1_1;
	private JTextField txt1_2;
	private JTextField txt1_3;
	private JTextField txt1_4;
	private JTextField txt1_5;
	private JTable table;
	private JTextField txt2_1;
	private JTextField txt2_2;
	private JTextField txt2_3;
	private JTextField txt2_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI3 frame = new GUI3();
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
	public GUI3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 533);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 578, 494);
		contentPane.add(tabbedPane);
		
		JPanel BeantragungsTab = new JPanel();
		BeantragungsTab.setBackground(Color.DARK_GRAY);
		BeantragungsTab.setToolTipText("");
		tabbedPane.addTab("Beantragung", null, BeantragungsTab, null);
		BeantragungsTab.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(38, 24, 34, 14);
		BeantragungsTab.add(lblName);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setForeground(Color.WHITE);
		lblAdresse.setBounds(147, 24, 46, 14);
		BeantragungsTab.add(lblAdresse);
		
		JLabel lblKontodaten = new JLabel("Kontodaten");
		lblKontodaten.setForeground(Color.WHITE);
		lblKontodaten.setBounds(253, 24, 63, 14);
		BeantragungsTab.add(lblKontodaten);
		
		txt1_1 = new JTextField();
		txt1_1.setBounds(10, 60, 86, 20);
		BeantragungsTab.add(txt1_1);
		txt1_1.setColumns(10);
		
		txt1_2 = new JTextField();
		txt1_2.setBounds(124, 60, 86, 20);
		BeantragungsTab.add(txt1_2);
		txt1_2.setColumns(10);
		
		txt1_3 = new JTextField();
		txt1_3.setBounds(238, 60, 86, 20);
		BeantragungsTab.add(txt1_3);
		txt1_3.setColumns(10);
		
		JLabel lblBezahlung = new JLabel("Bezahlung");
		lblBezahlung.setForeground(Color.WHITE);
		lblBezahlung.setBounds(367, 24, 57, 14);
		BeantragungsTab.add(lblBezahlung);
		
		txt1_4 = new JTextField();
		txt1_4.setBounds(352, 60, 86, 20);
		BeantragungsTab.add(txt1_4);
		txt1_4.setColumns(10);
		
		JLabel lblBankinformationen = new JLabel("Bankinformationen");
		lblBankinformationen.setForeground(Color.WHITE);
		lblBankinformationen.setBounds(462, 24, 90, 14);
		BeantragungsTab.add(lblBankinformationen);
		
		txt1_5 = new JTextField();
		txt1_5.setBounds(462, 60, 86, 20);
		BeantragungsTab.add(txt1_5);
		txt1_5.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(7, 128, 89, 23);
		BeantragungsTab.add(btnNewButton);
		
		JPanel SuchTab = new JPanel();
		SuchTab.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("Suchen", null, SuchTab, null);
		SuchTab.setLayout(null);
		
		table = new JTable();
		table.setBounds(320, 11, 243, 281);
		SuchTab.add(table);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setForeground(Color.WHITE);
		lblName_1.setBackground(Color.BLACK);
		lblName_1.setBounds(34, 11, 34, 14);
		SuchTab.add(lblName_1);
		
		txt2_1 = new JTextField();
		txt2_1.setBounds(10, 36, 86, 20);
		SuchTab.add(txt2_1);
		txt2_1.setColumns(10);
		
		txt2_2 = new JTextField();
		txt2_2.setBounds(118, 36, 86, 20);
		SuchTab.add(txt2_2);
		txt2_2.setColumns(10);
		
		txt2_3 = new JTextField();
		txt2_3.setBounds(224, 36, 86, 20);
		SuchTab.add(txt2_3);
		txt2_3.setColumns(10);
		
		JLabel lblAdresse_1 = new JLabel("Adresse");
		lblAdresse_1.setForeground(Color.WHITE);
		lblAdresse_1.setBounds(135, 11, 46, 14);
		SuchTab.add(lblAdresse_1);
		
		JLabel lblKontodaten_1 = new JLabel("Kontodaten");
		lblKontodaten_1.setForeground(Color.WHITE);
		lblKontodaten_1.setBounds(235, 11, 63, 14);
		SuchTab.add(lblKontodaten_1);
		
		JLabel lblNewLabel = new JLabel("Bezahlung");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(52, 86, 58, 14);
		SuchTab.add(lblNewLabel);
		
		txt2_4 = new JTextField();
		txt2_4.setBounds(34, 111, 86, 20);
		SuchTab.add(txt2_4);
		txt2_4.setColumns(10);
		
		JLabel lblBankinformationen_1 = new JLabel("Bankinformationen");
		lblBankinformationen_1.setForeground(Color.WHITE);
		lblBankinformationen_1.setBounds(176, 86, 96, 14);
		SuchTab.add(lblBankinformationen_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(176, 111, 86, 20);
		SuchTab.add(textField_6);
		textField_6.setColumns(10);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.WHITE);
		canvas.setBounds(0, 153, 320, 2);
		SuchTab.add(canvas);
		
		JLabel lblKopopopoplji = new JLabel("Status");
		lblKopopopoplji.setForeground(Color.WHITE);
		lblKopopopoplji.setBounds(34, 176, 46, 14);
		SuchTab.add(lblKopopopoplji);
		
		JLabel lblName_2 = new JLabel("Name");
		lblName_2.setForeground(Color.WHITE);
		lblName_2.setBounds(146, 176, 46, 14);
		SuchTab.add(lblName_2);
		
		JLabel lblSumme = new JLabel("Summe");
		lblSumme.setForeground(Color.WHITE);
		lblSumme.setBounds(248, 176, 46, 14);
		SuchTab.add(lblSumme);
		
		textField_7 = new JTextField();
		textField_7.setBounds(10, 201, 86, 20);
		SuchTab.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(118, 201, 86, 20);
		SuchTab.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(224, 201, 86, 20);
		SuchTab.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblDatum = new JLabel("Datum");
		lblDatum.setForeground(Color.WHITE);
		lblDatum.setBounds(34, 247, 46, 14);
		SuchTab.add(lblDatum);
		
		JLabel lblNewLabel_1 = new JLabel("Fachbereich");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(135, 247, 63, 14);
		SuchTab.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Zahlungsrythmus");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(224, 247, 94, 14);
		SuchTab.add(lblNewLabel_2);
		
		textField_10 = new JTextField();
		textField_10.setBounds(10, 272, 86, 20);
		SuchTab.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(118, 272, 86, 20);
		SuchTab.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(224, 272, 86, 20);
		SuchTab.add(textField_12);
		textField_12.setColumns(10);
		
		JPanel AenderungsTab = new JPanel();
		AenderungsTab.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("\u00C4ndern", null, AenderungsTab, null);
		AenderungsTab.setLayout(null);
	}
}
