package calculator_lv3;

import java.util.function.BiFunction;

public enum Operator {

    ADD('+') {
        @Override
        public double apply(int firstNum, int secondNum) {
            return (double) firstNum + secondNum;
        }
    },
    SUBTRACT('-') {
        @Override
        public double apply(int firstNum, int secondNum) {
            return (double) firstNum - secondNum;
        }
    },
    MULTIPLY('*') {
        @Override
        public double apply(int firstNum, int secondNum) {
            return (double) firstNum * secondNum;
        }
    },
    DIVIDE('/') {
        @Override
        public double apply(int firstNum, int secondNum) {
            return (double) firstNum / secondNum;
        }
    };

    private final char operator;

    Operator(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    public abstract double apply(int firstNum, int secondNum);

    public static Operator fromChar(char operatorChar) {
        for (Operator op : values()) {
            if (op.getOperator() == operatorChar) {
                return op;
            }
        }
        throw new IllegalArgumentException("Invalid operator: " + operatorChar);
    }

}
