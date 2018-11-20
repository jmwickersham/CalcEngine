package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
		// ** Iteration 4 **
		MathEquation[] equations = new MathEquation[4];
		equations[0] = new MathEquation('d', 100.0d, 50.0d);
		equations[1] = new MathEquation('a', 25.0d, 92.0d);
		equations[2] = new MathEquation('s', 225.0d, 17.0d);
		equations[3] = new MathEquation('m', 11.0d, 3.0d);

    	// ** Iteration 3 **

		//	MathEquation[] equations = new MathEquation[4];
		//	equations[0] = create(100.0d, 50.0d, 'd');
		//	equations[1] = create(25.0d, 92.0d, 'a');
		//	equations[2] = create(225.0d, 17.0d, 's');
		//	equations[3] = create(11.0d, 3.0d, 'm');

		for (MathEquation equation: equations) {
			equation.execute();
			System.out.print("result = ");
			// System.out.println(equation.result);
			System.out.println(equation.getResult());
		}

		// Test
		System.out.println();
		System.out.println("Using Overloads");
		System.out.println();

		double leftDouble = 9.0d;
		double rightDouble = 4.0d;
		int leftInt = 9;
		int rightInt = 4;

		MathEquation equationOverload = new MathEquation('d');
		equationOverload.execute(leftDouble, rightDouble);
		System.out.print("result = ");
		System.out.println(equationOverload.getResult());

		equationOverload.execute(leftInt, rightInt);
		System.out.print("result = ");
		System.out.println(equationOverload.getResult());

		equationOverload.execute((double)leftInt, rightInt);
		System.out.print("result = ");
		System.out.println(equationOverload.getResult());

		// ** Iteration 2 **

		//  double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
		//  double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
		//  char[] opCodes = { 'd', 'a', 's', 'm' };
		//  double[] results = new double[opCodes.length];

		//	for (int i = 0; i < opCodes.length; i++) {
		//		switch (opCode) {
		//      	case 'a':
		//          	result = leftVal + rightVal;
		//              break;
		//          case 's':
		//              result = leftVal - rightVal;
		//              break;
		//          case 'd':
		//              result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
		//              break;
		//          case 'm':
		//              result = leftVal * rightVal;
		//              break;
		//          default:
		//              System.out.println("Error - invalid opCode");
		//              result = 0.0d;
		//              break;
		//      }
		//	}

		//	for (double theResult : results) {
		//		System.out.print("result = ");
		//		System.out.println(theResult);
		//	}

		// ** Iteration 1 **

		//	double val1 = 100.0d;
		//	double val2 = 50.0d;
		//	double result;
		//	char opCode = 'd';

		//	if (opCode == 'a')
		//		result = val1 + val2;
		//	else if (opCode == 's')
		//		result = val1 - val2;
		//	else if (opCode == 'd') {
		//		result = val2 != 0.0d ? val1 / val2 : 0.0d;
				// if (val2 != 0.0d)
				// 		result = val1 / val2;
				// else
				//		result = 0.0d;
		//	}
		//	else if (opCode == 'm')
		//		result = val1 * val2;
		//	else {
		//		System.out.println("Error - invalid opCode");
		//		result = 0.0d;
		//	}

		// System.out.println(result);
		System.out.println();
		System.out.println("** end program **");
    }

	//	public static MathEquation create(double leftVal, double rightVal, char opCode) {
	// 		MathEquation equation = new MathEquation();
	//		// equation.leftVal = leftVal;
	//		// equation.rightVal = rightVal;
	//		// equation.opCode = opCode;
	//
	//		equation.setLeftVal(leftVal);
	//		equation.setRightVal(rightVal);
	//		equation.setOpCode(opCode);
	//
	//		return equation;
	//	}
}
