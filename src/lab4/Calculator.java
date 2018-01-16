package lab4;

import java.util.Stack;

public class Calculator {
	//Current position 
	private String str;
	private int position = 0;
	
	//Creating stacks of operands and operators
	private Stack<Double> Operands = new Stack<Double>();
	private Stack<Character> Operators = new Stack<Character>();
	
	public double calculate(String expression) throws Exception{
		str = expression;
		//Convert expression from 'exp' to '(exp) '
		str = "(" + str + ")";

		Object token;
		Object prevToken = 'W';
		
		do{
			token = getToken();
			
			//Проверка на унарный плюс и минус
			if(token instanceof Character && prevToken instanceof Character && 
					(char)prevToken == '(' && ((char)token == '+' || (char)token == '-')){
						Operands.push((double)0); //Добавляем нулевой элемент
			}
			if(token instanceof Double){ // если операнд
				Operands.push((double)token); // закидываем в стек
				
			}
			else if(token instanceof Character){
				if((char)token == ')'){ //Если скобка, выталкиваем все операции до первой открывающейся
					while(Operators.size() > 0 && Operators.peek() != '('){
						popFunction();
					}
					Operators.pop(); // Удаляем скобку
				}
				else{
					System.out.println(canPop((char)token));
					while(canPop((char)token)){ //Если можем вытолкуть
						
						popFunction(); //Выталкиваем
					}
					
					Operators.push((char)token);
				}
			}
			prevToken = token;
			
		} while(token != null);
		
		System.out.println(Operators.size());
		if(Operands.size() > 1 || Operators.size() > 0){
			//System.err.println(Operands.peek()+ " ... "+ Operators.peek());
			//throw new Exception("Error in analyse");
		}
		return Operands.pop();
	}
	
	private void popFunction(){
		
		double B = Operands.pop();
		double A = Operands.pop();
		System.out.println(A + ":" +B);
		
		switch(Operators.pop()){
		case '+':
			Operands.push(A + B);
			break;
		case '-':
			Operands.push(A - B);
			break;
		case '*':
			Operands.push(A * B);
			break;
		case '/':
			Operands.push(A / B);
			break;
		}
	}
	
	private boolean canPop(char operator) throws Exception{
		if(Operators.size() == 0){
			return false;
		}
		int priority1 = getPriority(operator);
		int priority2 = getPriority(Operators.peek());
		
		return priority1 >= 0 && priority2 >=0 && priority1 >= priority2;
	}
	
	private int getPriority(char operator) throws Exception{
		switch (operator)
	    {
	        case '(':
	            return -1; // не выталкивает сам и не дает вытолкнуть себя другим
	        case '*': case '/':
	            return 1;
	        case '+': case '-':
	            return 2;
	        default:
	            throw new Exception("Invalid operation");
	    }
	}
	
	private Object getToken(){
		readWhiteSpace();
		
		if(position == str.length()){ //if end
			return null;
		}
		else if(Character.isDigit(str.charAt(position))){ //If current character is digit
				
			return Double.parseDouble(readDouble());
		}
		else{
			return readOperator();
		}
	}
	
	///Получение оператора из строки
	private char readOperator(){
		//Все операции состоят из одного символа
		//Возвращаем его
		return str.charAt(position++);
	}
	
	private String readDouble(){
		String result = "";
		while(position < str.length() && (Character.isDigit(str.charAt(position))) || str.charAt(position) == '.'){
			result += str.charAt(position++);
		}
		return result;
	}
	
	private void readWhiteSpace(){
		while(position < str.length() && str.charAt(position) == ' '){
			position++;
		}
	}
}
