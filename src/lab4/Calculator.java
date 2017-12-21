package lab4;

import java.awt.*;
import java.util.Stack;

import javax.swing.*;

public class Calculator extends JFrame{
	
	private Stack<Operation> stack;
	
	private JTextField textField;
	private JButton plus;
	private JButton minus;
	private JButton multi;
	private JButton division;
	
	public Calculator(){
		super("Calculator");
		setBounds(500, 500, 700, 700); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		plus = new JButton("+");
		minus = new JButton("-");
		multi = new JButton("*");
		division = new JButton("/");
		
		textField = new JTextField(25);
		//TODO Обработчик ввода только цифр
			
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(textField);
		panel.add(plus);
		panel.add(minus);
		panel.add(multi);
		panel.add(division);
		
		add(panel);
		
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setVisible(true);
		calc.run();
	}

	public void run(){
		
		stack = new Stack<Operation>();
		
	}
	
	
}
