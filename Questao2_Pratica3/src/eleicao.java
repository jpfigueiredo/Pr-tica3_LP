import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pratica3_linguagem.valida_cpf;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class eleicao extends JFrame {

	
	int candA, candB, nulo, branco;
	double total_votos;
	private JPanel contentPane;
	private JTextField txtvoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eleicao frame = new eleicao();
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
	public eleicao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 352, 248);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea txtrEleiesRepresentanteDe = new JTextArea();
		txtrEleiesRepresentanteDe.setFont(new Font("Monospaced", Font.BOLD, 13));
		txtrEleiesRepresentanteDe.setEditable(false);
		txtrEleiesRepresentanteDe.setBounds(58, 11, 253, 22);
		txtrEleiesRepresentanteDe.setText("ELEI\u00C7\u00D5ES REPRESENTANTE DE TURMA");
		panel.add(txtrEleiesRepresentanteDe);
		
		JTextArea txtrCandidatos = new JTextArea();
		txtrCandidatos.setEditable(false);
		txtrCandidatos.setText("Candidatos:");
		txtrCandidatos.setBounds(23, 60, 108, 22);
		panel.add(txtrCandidatos);
		
		JTextArea txtrMaria = new JTextArea();
		txtrMaria.setEditable(false);
		txtrMaria.setText("36 - Maria Assis");
		txtrMaria.setBounds(47, 93, 149, 22);
		panel.add(txtrMaria);
		
		JTextArea txtrPedro = new JTextArea();
		txtrPedro.setEditable(false);
		txtrPedro.setText("28 - Pedro Faria");
		txtrPedro.setBounds(47, 113, 149, 22);
		panel.add(txtrPedro);
		
		JTextArea txtrNulo = new JTextArea();
		txtrNulo.setEditable(false);
		txtrNulo.setText("1 - Voto Nulo");
		txtrNulo.setBounds(47, 134, 149, 22);
		panel.add(txtrNulo);
		
		JTextArea txtrVoto = new JTextArea();
		txtrVoto.setEditable(false);
		txtrVoto.setText("2 - Voto Branco");
		txtrVoto.setBounds(47, 155, 149, 22);
		panel.add(txtrVoto);
		
		JTextArea txtrSeuVoto = new JTextArea();
		txtrSeuVoto.setEditable(false);
		txtrSeuVoto.setText("SEU VOTO");
		txtrSeuVoto.setBounds(244, 93, 85, 22);
		panel.add(txtrSeuVoto);
		
		txtvoto = new JTextField();
		txtvoto.setBounds(233, 127, 92, 46);
		panel.add(txtvoto);
		txtvoto.setColumns(10);
		
		JButton voto = new JButton("VOTAR!");
		voto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				int voto = Integer.parseInt(txtvoto.getText());
				
				switch (voto) {
				
				case 36:
					candA ++;
					
					JOptionPane.showMessageDialog(null, "Voto Confirmado!");
					txtvoto.setText("");
					break;
					
				case 28:
					candB ++;
					
					JOptionPane.showMessageDialog(null, "Voto Confirmado!");
					txtvoto.setText("");
					break;
					
				case 1:
					nulo ++;
					
					JOptionPane.showMessageDialog(null, "Voto anulado com sucesso!");
					txtvoto.setText("");
					break;
					
				case 2:
					branco ++;
					
					JOptionPane.showMessageDialog(null, "Voto Confirmado!");
					txtvoto.setText(" ");
					
					break;
				default: 
				break;
					
				}
				
				
				
				
				
				
				
			}
		});
		voto.setBounds(69, 214, 98, 23);
		panel.add(voto);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(193, 214, 107, 23);
		panel.add(btnCancelar);
		
		JButton btnApurar = new JButton("APURAR");
		btnApurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				total_votos = candA + candB + nulo + branco;
				
            if (candA > candB) 
					
					JOptionPane.showMessageDialog(null, "Maria Assis venceu as eleições");
				
				 else 
				
				JOptionPane.showMessageDialog(null, "Pedro Faria venceu as eleições");
				
				
				
				
			}
		});
		btnApurar.setBounds(233, 180, 92, 23);
		panel.add(btnApurar);
	}
}
