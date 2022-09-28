import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RamWIndow extends JFrame {

	private JPanel contentPane;
	Ram ram = new Ram();
	int size;
	Program program = new Program(); 


	/**
	 * Create the frame.
	 */

	
	
	
	public RamWIndow(String type, int time, int size) {
		this.ram.setType(type);
		this.ram.setTime(time);
		this.ram.setTotal_space(size);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		

		JMenu mnNewMenu = new JMenu("Opciones" + ram.getType());
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar Programa");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddNewProgram aNP = new AddNewProgram();
			}
		});


		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Emulador " + ram.getType() + " " + size);
		lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 23));
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		setVisible(true);

	}

}
