import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SizeSelection extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField;
	public Ram selectedRam;


	/**
	 * Create the frame.
	 */
	public SizeSelection(Ram selectedType) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		this.selectedRam = selectedType;
		
		JLabel lblNewLabel = new JLabel("Seleccione");
		lblNewLabel.setFont(new Font("Khmer Sangam MN", Font.PLAIN, 21));
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		

		
		JLabel lblNewLabel_1 = new JLabel("El tamaño debe estar dado en GB");
		contentPane.add(lblNewLabel_1, BorderLayout.WEST);
		
		btnNewButton = new JButton("Siguienye");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RamWIndow rw = new RamWIndow(selectedRam, Integer.parseInt(textField.getText()));
				
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.EAST);
		textField.setColumns(10);
		setVisible(true);
	}

}
