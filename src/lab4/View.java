package lab4;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame {
	
	private JButton addition = new JButton("+");;
	private JButton subtraction = new JButton("-");;
	private JButton multiplication = new JButton("*");;
	private JButton division = new JButton("/");;
	
	private JTextField field = new JTextField();
	
	private String expression = "0";
	
	private JLabel result = new JLabel();
	
	public static void main(String[] args) {
		View view = new View();
		view.setVisible(true);
	}
	
	public View(){
		super("Calculator");

		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(3, 2, 2, 2));
	
		
		addition.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				expression += " + " + field.getText();
				
				try {
					update();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
				//	e1.printStackTrace();
				}
			}
		});
		
		subtraction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				expression += " - " + field.getText();
				try {
					update();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
				}
			}
		});
		
		multiplication.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				expression += " * " + field.getText();
				try {
					update();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
				}
			}
		});
		
		division.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				expression += " / " + field.getText();
				try {
					update();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
				}
			}
		});
		
		container.add(addition);
		container.add(subtraction);
		container.add(multiplication);
		container.add(division);
	
		container.add(field);
		
		container.add(result);
		
		try {
			update();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
		//	e1.printStackTrace();
		}
	}
	
	public void update() throws Exception{
		Calculator calc = new Calculator();
		System.out.println(expression);
		double res =  calc.calculate(expression);
		result.setText(expression + "=" + res);
	}

}
