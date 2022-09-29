import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class Timer_Ciclo extends JFrame {
	Tiempo_C tiempo;
	Timer timer;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timer_Ciclo frame = new Timer_Ciclo();
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
	public Timer_Ciclo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Tiempo = new JLabel("DURACIÓN CICLO");
		Tiempo.setFont(new Font("Tahoma", Font.BOLD, 18));
		Tiempo.setBounds(97, 11, 177, 14);
		contentPane.add(Tiempo);
		
		JProgressBar ProcesoT = new JProgressBar();
		ProcesoT.setBackground(new Color(192, 192, 192));
		ProcesoT.setBounds(10, 156, 348, 14);
		contentPane.add(ProcesoT);
		
		JLabel Time = new JLabel("00(h).00(min).00(seg)");
		Time.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Time.setBounds(101, 77, 163, 26);
		contentPane.add(Time);
		
		tiempo=new Tiempo_C();
		timer = new Timer (100,new ActionListener() {
			public void actionPerformed(ActionEvent i) {
				tiempo.Conversion();
				Time.setText(tiempo.getHora()+"."+tiempo.getMinuto()+"."+tiempo.getSegundo());
			}
		});
	}
}
