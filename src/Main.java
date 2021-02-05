import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListModel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JMenuBar;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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

	public Main() {
		BankerAlgorithm banker = new BankerAlgorithm();

//		BankersAlgorithm banker = new BankersAlgorithm();
		banker.initializeValues();
		banker.calculateNeed();
		banker.isSafe();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("ATANMI\u015E");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(161, 0, 140, 50);
		contentPane.add(lblNewLabel);

		JLabel lblMax = new JLabel("MAX");
		lblMax.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblMax.setBounds(311, 0, 140, 50);
		contentPane.add(lblMax);

		JLabel lblIhtiya = new JLabel("\u0130HT\u0130YA\u00C7");
		lblIhtiya.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblIhtiya.setBounds(461, 0, 140, 50);
		contentPane.add(lblIhtiya);

		JLabel lblKullanlabilir = new JLabel("KULLANILAB\u0130L\u0130R");
		lblKullanlabilir.setForeground(Color.RED);
		lblKullanlabilir.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblKullanlabilir.setBounds(611, 0, 169, 50);
		contentPane.add(lblKullanlabilir);

		JLabel lblNewLabel_4 = new JLabel("P0");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 70, 45, 50);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("P1");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(10, 130, 45, 50);
		contentPane.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_2 = new JLabel("P2");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(10, 190, 45, 50);
		contentPane.add(lblNewLabel_4_2);

		JLabel lblNewLabel_4_3 = new JLabel("P3");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_3.setBounds(10, 250, 45, 50);
		contentPane.add(lblNewLabel_4_3);

		JLabel lblNewLabel_4_4 = new JLabel("P4");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_4.setBounds(10, 310, 45, 50);
		contentPane.add(lblNewLabel_4_4);

		JLabel atanmis0 = new JLabel();
		atanmis0.setFont(new Font("Tahoma", Font.BOLD, 15));
		atanmis0.setBounds(161, 72, 140, 50);
		contentPane.add(atanmis0);

		JLabel max0 = new JLabel();
		max0.setFont(new Font("Tahoma", Font.BOLD, 15));
		max0.setBounds(311, 70, 140, 50);
		contentPane.add(max0);

		JLabel need0 = new JLabel();
		need0.setFont(new Font("Tahoma", Font.BOLD, 15));
		need0.setBounds(461, 70, 140, 50);
		contentPane.add(need0);

		JLabel avaible0 = new JLabel();
		avaible0.setFont(new Font("Tahoma", Font.BOLD, 15));
		avaible0.setBounds(611, 70, 140, 50);
		contentPane.add(avaible0);

		JLabel atanmis1 = new JLabel();
		atanmis1.setFont(new Font("Tahoma", Font.BOLD, 15));
		atanmis1.setBounds(161, 132, 140, 50);
		contentPane.add(atanmis1);

		JLabel max1 = new JLabel();
		max1.setFont(new Font("Tahoma", Font.BOLD, 15));
		max1.setBounds(311, 130, 140, 50);
		contentPane.add(max1);

		JLabel need1 = new JLabel();
		need1.setFont(new Font("Tahoma", Font.BOLD, 15));
		need1.setBounds(461, 130, 140, 50);
		contentPane.add(need1);

		JLabel avaible1 = new JLabel();
		avaible1.setFont(new Font("Tahoma", Font.BOLD, 15));
		avaible1.setBounds(611, 130, 140, 50);
		contentPane.add(avaible1);

		JLabel atanmis2 = new JLabel();
		atanmis2.setFont(new Font("Tahoma", Font.BOLD, 15));
		atanmis2.setBounds(161, 190, 140, 50);
		contentPane.add(atanmis2);

		JLabel max2 = new JLabel();
		max2.setFont(new Font("Tahoma", Font.BOLD, 15));
		max2.setBounds(311, 188, 140, 50);
		contentPane.add(max2);

		JLabel need2 = new JLabel();
		need2.setFont(new Font("Tahoma", Font.BOLD, 15));
		need2.setBounds(461, 188, 140, 50);
		contentPane.add(need2);

		JLabel avaible2 = new JLabel();
		avaible2.setFont(new Font("Tahoma", Font.BOLD, 15));
		avaible2.setBounds(611, 188, 140, 50);
		contentPane.add(avaible2);

		JLabel atanmis3 = new JLabel();
		atanmis3.setFont(new Font("Tahoma", Font.BOLD, 15));
		atanmis3.setBounds(161, 250, 140, 50);
		contentPane.add(atanmis3);

		JLabel max3 = new JLabel();
		max3.setFont(new Font("Tahoma", Font.BOLD, 15));
		max3.setBounds(311, 248, 140, 50);
		contentPane.add(max3);

		JLabel need3 = new JLabel();
		need3.setFont(new Font("Tahoma", Font.BOLD, 15));
		need3.setBounds(461, 248, 140, 50);
		contentPane.add(need3);

		JLabel avaible3 = new JLabel();
		avaible3.setFont(new Font("Tahoma", Font.BOLD, 15));
		avaible3.setBounds(611, 248, 140, 50);
		contentPane.add(avaible3);

		JLabel atanmis4 = new JLabel();
		atanmis4.setFont(new Font("Tahoma", Font.BOLD, 15));
		atanmis4.setBounds(161, 310, 140, 50);
		contentPane.add(atanmis4);

		JLabel max4 = new JLabel();
		max4.setFont(new Font("Tahoma", Font.BOLD, 15));
		max4.setBounds(311, 308, 140, 50);
		contentPane.add(max4);

		JLabel need4 = new JLabel();
		need4.setFont(new Font("Tahoma", Font.BOLD, 15));
		need4.setBounds(461, 308, 140, 50);
		contentPane.add(need4);

		JLabel avaible4 = new JLabel();
		avaible4.setFont(new Font("Tahoma", Font.BOLD, 15));
		avaible4.setBounds(611, 308, 140, 50);
		contentPane.add(avaible4);

		JLabel avaible5 = new JLabel();
		avaible5.setForeground(Color.RED);
		avaible5.setText("0  0  0  t(4)");
		avaible5.setFont(new Font("Tahoma", Font.BOLD, 15));
		avaible5.setBounds(611, 368, 140, 50);
		contentPane.add(avaible5);

		JLabel totalA = new JLabel();
		totalA.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		totalA.setBounds(10, 442, 77, 30);
		contentPane.add(totalA);

		JLabel totalB = new JLabel();
		totalB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		totalB.setBounds(97, 442, 77, 30);
		contentPane.add(totalB);

		JLabel totalC = new JLabel();
		totalC.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		totalC.setBounds(171, 442, 77, 30);
		contentPane.add(totalC);

		JLabel lblNewLabel_1 = new JLabel("TOPLAMLAR:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(10, 391, 216, 50);
		contentPane.add(lblNewLabel_1);

		JLabel safeMassage = new JLabel();
		safeMassage.setForeground(Color.RED);
		safeMassage.setFont(new Font("Tahoma", Font.ITALIC, 16));
		safeMassage.setBounds(375, 471, 469, 36);
		contentPane.add(safeMassage);

		JLabel Safe = new JLabel();
		Safe.setForeground(Color.ORANGE);
		Safe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		Safe.setBounds(375, 517, 469, 36);
		contentPane.add(Safe);

		/*
		 * Label text initializations
		 */
		// ATANMIÞ
		atanmis0.setText(banker.atanmis[0][0] + "  " + banker.atanmis[0][1] + "  " + banker.atanmis[0][2]);
		atanmis1.setText(banker.atanmis[1][0] + "  " + banker.atanmis[1][1] + "  " + banker.atanmis[1][2]);
		atanmis2.setText(banker.atanmis[2][0] + "  " + banker.atanmis[2][1] + "  " + banker.atanmis[2][2]);
		atanmis3.setText(banker.atanmis[3][0] + "  " + banker.atanmis[3][1] + "  " + banker.atanmis[3][2]);
		atanmis4.setText(banker.atanmis[4][0] + "  " + banker.atanmis[4][1] + "  " + banker.atanmis[4][2]);

//		// MAX
//		System.out.println(banker.max[0][0]);
		max0.setText(banker.max[0][0] + "  " + banker.max[0][1] + "  " + banker.max[0][2]);
		max1.setText(banker.max[1][0] + "  " + banker.max[1][1] + "  " + banker.max[1][2]);
		max2.setText(banker.max[2][0] + "  " + banker.max[2][1] + "  " + banker.max[2][2]);
		max3.setText(banker.max[3][0] + "  " + banker.max[3][1] + "  " + banker.max[3][2]);
		max4.setText(banker.max[4][0] + "  " + banker.max[4][1] + "  " + banker.max[4][2]);

		// NEED
		need0.setText(banker.need[0][0] + "  " + banker.need[0][1] + "  " + banker.need[0][2]);
		need1.setText(banker.need[1][0] + "  " + banker.need[1][1] + "  " + banker.need[1][2]);
		need2.setText(banker.need[2][0] + "  " + banker.need[2][1] + "  " + banker.need[2][2]);
		need3.setText(banker.need[3][0] + "  " + banker.need[3][1] + "  " + banker.need[3][2]);
		need4.setText(banker.need[4][0] + "  " + banker.need[4][1] + "  " + banker.need[4][2]);

		// AVAIBLE
		avaible0.setText(banker.kullanilabilir_2[0][0] + "  " + banker.kullanilabilir_2[0][1] + "  "
				+ banker.kullanilabilir_2[0][2] + "  t(0)");
		avaible1.setText(banker.kullanilabilir_2[1][0] + "  " + banker.kullanilabilir_2[1][1] + "  "
				+ banker.kullanilabilir_2[1][2] + "  t(1)");
		avaible2.setText(banker.kullanilabilir_2[2][0] + "  " + banker.kullanilabilir_2[2][1] + "  "
				+ banker.kullanilabilir_2[2][2] + "  t(2)");
		avaible3.setText(banker.kullanilabilir_2[3][0] + "  " + banker.kullanilabilir_2[3][1] + "  "
				+ banker.kullanilabilir_2[3][2] + "  t(3)");
		avaible4.setText(banker.kullanilabilir_2[4][0] + "  " + banker.kullanilabilir_2[4][1] + "  "
				+ banker.kullanilabilir_2[4][2] + "  t(4)");
		avaible5.setText((banker.atanmis[0][0] + banker.atanmis[1][0] + banker.atanmis[2][0] + banker.atanmis[3][0]
				+ banker.atanmis[4][0] + banker.kullanilabilir[0])
				+ "  "
				+ (banker.atanmis[0][1] + banker.atanmis[1][1] + banker.atanmis[2][1] + banker.atanmis[3][1]
						+ banker.atanmis[4][1] + banker.kullanilabilir[1])
				+ "  " + (banker.atanmis[0][2] + banker.atanmis[1][2] + banker.atanmis[2][2] + banker.atanmis[3][2]
						+ banker.atanmis[4][2] + banker.kullanilabilir[2])
				+ "  t(son)");

		// TOTALS
		totalA.setText("A: " + (banker.atanmis[0][0] + banker.atanmis[1][0] + banker.atanmis[2][0]
				+ banker.atanmis[3][0] + banker.atanmis[4][0] + banker.kullanilabilir[0]));
		totalB.setText("B: " + (banker.atanmis[0][1] + banker.atanmis[1][1] + banker.atanmis[2][1]
				+ banker.atanmis[3][1] + banker.atanmis[4][1] + banker.kullanilabilir[1]));
		totalC.setText("C: " + (banker.atanmis[0][2] + banker.atanmis[1][2] + banker.atanmis[2][2]
				+ banker.atanmis[3][2] + banker.atanmis[4][2] + banker.kullanilabilir[2]));

		// SAFES
		safeMassage.setText(banker.safeMassage);
		Safe.setText(banker.safe);

	}
}
