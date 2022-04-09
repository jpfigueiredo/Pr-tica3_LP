package pratica3_linguagem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class jframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe frame = new jframe();
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
	public jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setEditable(false);
		txtpnNome.setBounds(46, 62, 38, 20);
		txtpnNome.setText("Nome:");
		panel.add(txtpnNome);
		
		textField = new JTextField();
		textField.setBounds(94, 62, 156, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnValidaoCpf = new JTextPane();
		txtpnValidaoCpf.setEditable(false);
		txtpnValidaoCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnValidaoCpf.setText("Valida\u00E7\u00E3o CPF");
		txtpnValidaoCpf.setBounds(105, 11, 136, 20);
		panel.add(txtpnValidaoCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(94, 93, 156, 20);
		panel.add(textField_1);
		
		JTextPane txtpnCpf = new JTextPane();
		txtpnCpf.setEditable(false);
		txtpnCpf.setText("CPF:");
		txtpnCpf.setBounds(46, 93, 38, 20);
		panel.add(txtpnCpf);
		
		JButton btnNewButton = new JButton("VERIFICAR CPF");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnNewButton.setBounds(94, 137, 150, 23);
		panel.add(btnNewButton);
	}
}
