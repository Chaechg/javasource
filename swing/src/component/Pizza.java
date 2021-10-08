package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class Pizza extends JFrame implements ItemListener, ActionListener{

	private JPanel contentPane;
	private JRadioButton rdoCombo,rdoPotato,rdoBul,rdoPepper,rdoCheese,rdoPepp,rdoBacon,
	rdoSmall,rdoMed,rdoLarge;
	private JButton btnOrder,btnCancel;
	private JLabel lblMoney;
	private ButtonGroup group1,group2,group3;
	
	
	//�׷캰 �ֹ��ݾ� ���� ����
	private int kindMoney, toppingMoney, sizeMoney;
	//�׷캰 ��ǰ���ÿ� ���� ���� ����
	private String kind,topping,size;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		setTitle("\uD53C\uC790\uC8FC\uBB38");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pizza.class.getResource("/component/pizza1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 200, 500, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel.setFont(new Font("���� ���", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdoCombo = new JRadioButton("\uCF64\uBCF4");
		rdoCombo.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoCombo.addItemListener(this);
		rdoCombo.setBackground(Color.WHITE);
		panel_2.add(rdoCombo);
		
		rdoPotato = new JRadioButton("\uD3EC\uD14C\uC774\uD1A0");
		rdoPotato.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoPotato.addItemListener(this);
		rdoPotato.setBackground(Color.WHITE);
		panel_2.add(rdoPotato);
		
		rdoBul = new JRadioButton("\uBD88\uACE0\uAE30");
		rdoBul.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoBul.addItemListener(this);
		rdoBul.setBackground(Color.WHITE);
		panel_2.add(rdoBul);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uCD94\uAC00 \uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdoPepper = new JRadioButton("\uD53C\uB9DD");
		rdoPepper.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoPepper.addItemListener(this);
		rdoPepper.setBackground(Color.WHITE);
		panel_3.add(rdoPepper);
		
		rdoCheese = new JRadioButton("\uCE58\uC988");
		rdoCheese.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoCheese.addItemListener(this);
		rdoCheese.setBackground(Color.WHITE);
		panel_3.add(rdoCheese);
		
		rdoPepp = new JRadioButton("\uD398\uD398\uB85C\uB2C8");
		rdoPepp.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoPepp.addItemListener(this);
		rdoPepp.setBackground(Color.WHITE);
		panel_3.add(rdoPepp);
		
		rdoBacon = new JRadioButton("\uBCA0\uC774\uCEE8");
		rdoBacon.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoBacon.addItemListener(this);
		rdoBacon.setBackground(Color.WHITE);
		panel_3.add(rdoBacon);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uD06C\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdoSmall = new JRadioButton("Small");
		rdoSmall.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoSmall.addItemListener(this);
		rdoSmall.setBackground(Color.WHITE);
		panel_4.add(rdoSmall);
		
		rdoMed = new JRadioButton("Medium");
		rdoMed.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoMed.addItemListener(this);
		rdoMed.setBackground(Color.WHITE);
		panel_4.add(rdoMed);
		
		rdoLarge = new JRadioButton("Large");
		rdoLarge.setFont(new Font("���� ���", Font.PLAIN, 14));
		rdoLarge.addItemListener(this);
		rdoLarge.setBackground(Color.WHITE);
		panel_4.add(rdoLarge);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnOrder = new JButton("\uC8FC\uBB38");
		btnOrder.setActionCommand("�ֹ�");
		btnOrder.addActionListener(this);
		btnOrder.setBackground(Color.WHITE);
		panel_1.add(btnOrder);
		
		btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setActionCommand("���");
		btnCancel.addActionListener(this);
		btnCancel.setBackground(Color.WHITE);
		panel_1.add(btnCancel);
		
		lblMoney = new JLabel("\uAE08\uC561 : ");
		lblMoney.setBackground(Color.WHITE);
		panel_1.add(lblMoney);
		
		//�����׷� ����
		
		// ���� �׷� ����
		group1 = new ButtonGroup();
		group1.add(rdoCombo);
		group1.add(rdoPotato);
		group1.add(rdoBul);
		
		//�߰����� �׷� ����
		group2 = new ButtonGroup();
		group2.add(rdoPepper);
		group2.add(rdoCheese);
		group2.add(rdoPepp);
		group2.add(rdoBacon);
		
		// ũ�� �׷� ����
		group3 = new ButtonGroup();
		group3.add(rdoSmall);
		group3.add(rdoMed);
		group3.add(rdoLarge);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư �̺�Ʈ ó��
		String cmd = e.getActionCommand();
		
		if (cmd.equals("�ֹ�")) {
			
			String orderList = "�ֹ�����\n";
			orderList+="���� : "+kind+"\n";
			orderList+="���� : "+topping+"\n";
			orderList+="ũ�� : "+size+"\n";
			orderList+="�ֹ��Ͻðڽ��ϱ�?";
			
			int result = JOptionPane.showConfirmDialog(getParent(),orderList,"�ֹ��Ϸ�",
					JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
			
			if (result == 0) {
				JOptionPane.showConfirmDialog(getParent(), "�ֹ��� �Ϸ�Ǿ����ϴ�.");
				clear();
			} else {
				clear();
			}
			
		}else {
			clear();
		}
	}
	
	private void clear() {
		//���� ��ư ����
		group1.clearSelection();
		group2.clearSelection();
		group3.clearSelection();
		
		//�׷캰 �ֹ��ݾ� ���� �ʱ�ȭ
		kindMoney = 0;
		toppingMoney = 0;
		sizeMoney = 0;
		
		//�׷캰 �ֹ��޼��� ���� �ʱ�ȭ
		kind = "";
		topping = "";
		size = "";
		
		lblMoney.setText("�ݾ� : ");
	}
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		// ���� ��ư �̺�Ʈ ó��
		// ���� : �޺�(10000), ��������(12000), �Ұ��(13000)
		// �߰����� : �Ǹ�(2000),ġ��(2000),����δ�(1000),������(3000)
		// ũ�� : small(1000), medium(2000), large(3000)
		JRadioButton radio = (JRadioButton)e.getItem();

		// JRadioButton, JCheckBox ������ ��ȭ�� ����, ������ ����
		// ���õǴ� ������ �̺�Ʈ ó��
		if (e.getStateChange()==ItemEvent.SELECTED) { //getStateChange = 0 or 1
			if (radio == rdoCombo) {
				kindMoney = 10000;
				kind = radio.getText();
			}else if (radio ==rdoPotato) {
				kindMoney = 12000;
				kind = radio.getText();
			}else if (radio ==rdoBul) {
				kindMoney = 13000;
				kind = radio.getText();
			}else if (radio ==rdoPepper) {
				toppingMoney = 2000;
				topping = radio.getText();
			}else if (radio ==rdoCheese) {
				toppingMoney = 2000;
				topping = radio.getText();
			}else if (radio ==rdoPepp) {
				toppingMoney = 1000;
				topping = radio.getText();
			}else if (radio ==rdoBacon) {
				toppingMoney =  3000;
				topping = radio.getText();
			}else if (radio ==rdoSmall) {
				sizeMoney = 1000;
				size = radio.getText();
			}else if (radio ==rdoMed) {
				sizeMoney = 2000;
				size = radio.getText();
			}else if (radio ==rdoLarge) {
				sizeMoney = 3000;
				size = radio.getText();
			}
			int price = kindMoney+toppingMoney+sizeMoney;
			lblMoney.setText("�ݾ� : "+price);
			
			
		}
		
		
		
	}

}
