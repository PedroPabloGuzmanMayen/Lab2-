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

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TypeSelection frame = new TypeSelection();
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
		contentPane.add(rdbtnNewRadioButton, BorderLayout.WEST);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("SSR");
		contentPane.add(rdbtnNewRadioButton_1, BorderLayout.EAST);
		
		JButton nextButton1 = new JButton("Siguiente");
		nextButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SizeSelection sw = new SizeSelection();
			}
		});
		contentPane.add(nextButton1, BorderLayout.SOUTH);
		setVisible(true);
	}

}
