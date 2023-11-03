package org.example.Calculation;

import org.example.Calculation.calculate.*;

import java.util.List;

public class Calculator {
    public static final List<NewArithmeticOperator> arithmeticOperators = List.of(new AdditionOpperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(int operand1, String operator, int operand2){
        return ArithmeticOperator.calculate(operand1, operator, operand2);
    }
}
