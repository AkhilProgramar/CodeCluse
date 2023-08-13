import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 332, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTFIC CALCULATOR");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(20, 11, 283, 42);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(10, 52, 282, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btncube = new JButton("X^3");
		btncube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncube.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btncube.setBounds(10, 269, 58, 42);
		frame.getContentPane().add(btncube);
		
		JButton btnsqure = new JButton("X^2");
		btnsqure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsqure.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnsqure.setBounds(10, 312, 58, 42);
		frame.getContentPane().add(btnsqure);
		
		JButton btnfactorial = new JButton("n!");
		btnfactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText(textField.getText()+fact);
			}
		});
		btnfactorial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnfactorial.setBounds(10, 351, 58, 42);
		frame.getContentPane().add(btnfactorial);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlusMinus.setBounds(10, 392, 58, 42);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnroot = new JButton("\u221A");
		btnroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnroot.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnroot.setBounds(10, 144, 58, 42);
		frame.getContentPane().add(btnroot);
		
		JButton btnlog = new JButton("Log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btnlog.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnlog.setBounds(65, 186, 58, 42);
		frame.getContentPane().add(btnlog);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(65, 269, 58, 42);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(65, 312, 58, 42);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(65, 351, 58, 42);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("O");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(65, 392, 117, 42);
		frame.getContentPane().add(btn0);
		
		JButton btnex = new JButton("e^x");
		btnex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btnex.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnex.setBounds(65, 144, 58, 42);
		frame.getContentPane().add(btnex);
		
		JButton btn1x = new JButton("1/X");
		btn1x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btn1x.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1x.setBounds(10, 186, 58, 42);
		frame.getContentPane().add(btn1x);
		
		JButton btncosh = new JButton("Cosh");
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btncosh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btncosh.setBounds(124, 186, 58, 42);
		frame.getContentPane().add(btncosh);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(124, 269, 58, 42);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(124, 312, 58, 42);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(124, 351, 58, 42);
		frame.getContentPane().add(btn2);
		
		JButton btnNewButton_5_1 = new JButton("O");
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton_5_1.setBounds(124, 392, 58, 42);
		frame.getContentPane().add(btnNewButton_5_1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSin.setBounds(124, 144, 58, 42);
		frame.getContentPane().add(btnSin);
		
		JButton btnsinh = new JButton("Sinh");
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btnsinh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnsinh.setBounds(178, 186, 58, 42);
		frame.getContentPane().add(btnsinh);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace=str.toString();
					textField.setText(Backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnBackspace.setBounds(178, 227, 58, 42);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(178, 269, 58, 42);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(178, 312, 58, 42);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(178, 351, 58, 42);
		frame.getContentPane().add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Tahoma", Font.BOLD, 21));
		btndot.setBounds(178, 392, 58, 42);
		frame.getContentPane().add(btndot);
		
		JButton btncos = new JButton("Cos");
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btncos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btncos.setBounds(178, 144, 58, 42);
		frame.getContentPane().add(btncos);
		
		JButton btntanh = new JButton("Tanh");
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btntanh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btntanh.setBounds(234, 186, 58, 42);
		frame.getContentPane().add(btntanh);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second =Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y") {
					double resultt=1;
					for(int i=0;i<second;i++) {
						resultt=first*resultt;
					}
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnEqual.setBounds(234, 392, 58, 42);
		frame.getContentPane().add(btnEqual);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTan.setBounds(234, 144, 58, 42);
		frame.getContentPane().add(btnTan);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDivide.setBounds(234, 351, 58, 42);
		frame.getContentPane().add(btnDivide);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnmultiply.setBounds(234, 312, 58, 42);
		frame.getContentPane().add(btnmultiply);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnMinus.setBounds(234, 269, 58, 42);
		frame.getContentPane().add(btnMinus);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnPlus.setBounds(234, 227, 58, 42);
		frame.getContentPane().add(btnPlus);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(124, 227, 58, 42);
		frame.getContentPane().add(btnClear);
		
		JButton btnPersent = new JButton("%");
		btnPersent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPersent.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPersent.setBounds(65, 227, 58, 42);
		frame.getContentPane().add(btnPersent);
		
		JButton btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnXy.setBounds(10, 227, 58, 42);
		frame.getContentPane().add(btnXy);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnSin.setEnabled(true);
				btncos.setEnabled(true);
				btnTan.setEnabled(true);
				btnsinh.setEnabled(true);
				btncosh.setEnabled(true);
				btntanh.setEnabled(true);
				btnPlus.setEnabled(true);
				btnMinus.setEnabled(true);
				btnmultiply.setEnabled(true);
				btnDivide.setEnabled(true);
				btnEqual.setEnabled(true);
				btndot.setEnabled(true);
				btnXy.setEnabled(true);
				btnroot.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btncube.setEnabled(true);
				btnsqure.setEnabled(true);
				btn1x.setEnabled(true);
				btnfactorial.setEnabled(true);
				btnClear.setEnabled(true);
				btn0.setEnabled(true);
				btnPersent.setEnabled(true);
				btnlog.setEnabled(true);
				btnBackspace.setEnabled(true);
				btnex.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(0, 108, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnSin.setEnabled(false);
				btncos.setEnabled(false);
				btnTan.setEnabled(false);
				btnsinh.setEnabled(false);
				btncosh.setEnabled(false);
				btntanh.setEnabled(false);
				btnPlus.setEnabled(false);
				btnMinus.setEnabled(false);
				btnmultiply.setEnabled(false);
				btnDivide.setEnabled(false);
				btnEqual.setEnabled(false);
				btndot.setEnabled(false);
				btnXy.setEnabled(false);
				btnroot.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btncube.setEnabled(false);
				btnsqure.setEnabled(false);
				btn1x.setEnabled(false);
				btnfactorial.setEnabled(false);
				btnClear.setEnabled(false);
				btn0.setEnabled(false);
				btnPersent.setEnabled(false);
				btnlog.setEnabled(false);
				btnBackspace.setEnabled(false);
				btnex.setEnabled(false);
				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setBounds(201, 109, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
