package myCalculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	double num1;
	double num2;
	double result;
	String op;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\micha_000\\Desktop\\java images\\icons8-math-50.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 279, 418);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(10, 11, 251, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBackSpace = new JButton("");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backSpace = null;
				
				if(textField.getText().length() > 0){
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.PLAIN, 5));
		btnBackSpace.setIcon(new ImageIcon("C:\\Users\\micha_000\\Desktop\\java images\\icons8-arrow-pointing-left-50.png"));
		btnBackSpace.setBounds(10, 65, 60, 60);
		contentPane.add(btnBackSpace);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn7.getText();
				textField.setText(enterNum);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setBounds(10, 128, 60, 60);
		contentPane.add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn4.getText();
				textField.setText(enterNum);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setBounds(10, 193, 60, 60);
		contentPane.add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn1.getText();
				textField.setText(enterNum);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBounds(10, 257, 60, 60);
		contentPane.add(btn1);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn0.getText();
				textField.setText(enterNum);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBounds(10, 321, 60, 60);
		contentPane.add(btn0);
		
		JButton btnClear = new JButton("");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 5));
		btnClear.setIcon(new ImageIcon("C:\\Users\\micha_000\\Desktop\\java images\\icons8-c-45.png"));
		btnClear.setBounds(74, 65, 60, 60);
		contentPane.add(btnClear);
		
		JButton btnPercent = new JButton("");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "%";
			}
		});
		btnPercent.setIcon(new ImageIcon("C:\\Users\\micha_000\\Desktop\\java images\\icons8-ratio-52.png"));
		btnPercent.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnPercent.setBounds(138, 65, 60, 60);
		contentPane.add(btnPercent);
		
		JButton btnPlus = new JButton("");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "+";
			}
		});
		btnPlus.setIcon(new ImageIcon("C:\\Users\\micha_000\\Desktop\\java images\\icons8-plus-52.png"));
		btnPlus.setBounds(203, 65, 60, 60);
		contentPane.add(btnPlus);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn8.getText();
				textField.setText(enterNum);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBounds(74, 128, 60, 60);
		contentPane.add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn9.getText();
				textField.setText(enterNum);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setBounds(138, 128, 60, 60);
		contentPane.add(btn9);
		
		JButton btnMinus = new JButton("");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "-";
			}
		});
		btnMinus.setIcon(new ImageIcon("C:\\Users\\micha_000\\Desktop\\java images\\icons8-subtract-50.png"));
		btnMinus.setBounds(203, 128, 60, 60);
		contentPane.add(btnMinus);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn5.getText();
				textField.setText(enterNum);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBounds(74, 193, 60, 60);
		contentPane.add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn6.getText();
				textField.setText(enterNum);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(138, 193, 60, 60);
		contentPane.add(btn6);
		
		JButton btnMultiply = new JButton("");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "*";
			}
		});
		btnMultiply.setIcon(new ImageIcon("C:\\Users\\micha_000\\Desktop\\java images\\icons8-x-50.png"));
		btnMultiply.setBounds(203, 193, 60, 60);
		contentPane.add(btnMultiply);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn2.getText();
				textField.setText(enterNum);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setBounds(74, 257, 60, 60);
		contentPane.add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btn3.getText();
				textField.setText(enterNum);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setBounds(138, 257, 60, 60);
		contentPane.add(btn3);
		
		JButton btnDivide = new JButton("");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "/";
			}
		});
		btnDivide.setIcon(new ImageIcon("C:\\Users\\micha_000\\Desktop\\java images\\icons8-divide-50.png"));
		btnDivide.setBounds(203, 257, 60, 60);
		contentPane.add(btnDivide);
		
		final JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String enterNum = textField.getText() + btnPoint.getText();
				textField.setText(enterNum);
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPoint.setBounds(74, 321, 60, 60);
		contentPane.add(btnPoint);
		
		JButton btnPlusMinus = new JButton("");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setIcon(new ImageIcon("C:\\Users\\micha_000\\Desktop\\java images\\icons8-plus-minus-50.png"));
		btnPlusMinus.setBounds(138, 321, 60, 60);
		contentPane.add(btnPlusMinus);
		
		JButton btnEqual = new JButton("");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				num2 = Double.parseDouble(textField.getText());
				if(op == "+")
				{
					result = num1 + num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(op == "-")
				{
					result = num1 - num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(op == "*")
				{
					result = num1 * num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(op == "/")
				{
					result = num1 / num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(op == "%")
				{
					result = num1 % num2;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnEqual.setIcon(new ImageIcon("C:\\Users\\micha_000\\Desktop\\java images\\icons8-equal-sign-50.png"));
		btnEqual.setBounds(203, 321, 60, 60);
		contentPane.add(btnEqual);
	}
}
