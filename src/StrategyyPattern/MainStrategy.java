package StrategyyPattern;

public class MainStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new OperationAdd());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationSub());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationMul());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

	}

}
