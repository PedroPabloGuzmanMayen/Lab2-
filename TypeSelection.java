import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TypeSelection extends JFrame {
	
	public Ram ram = new Ram();
	

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public TypeSelection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Escoja el tipo de la memoria RAM");
		lblNewLabel.setFont(new Font("Geeza Pro", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("DDR");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ram.setType("DDR");
	
			}
		});
		contentPane.add(rdbtnNewRadioButton, BorderLayout.WEST);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("SSR");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ram.setType("SSR");
			}
		});
		contentPane.add(rdbtnNewRadioButton_1, BorderLayout.EAST);
		
		JButton nextButton1 = new JButton("Siguiente");
		nextButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SizeSelection sw = new SizeSelection(ram);
			}
		});
		contentPane.add(nextButton1, BorderLayout.SOUTH);
		setVisible(true);
		
	}

}
