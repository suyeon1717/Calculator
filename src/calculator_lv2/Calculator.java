package calculator_lv2;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    // 속성(필드)
    Queue<Double> answerQueue = new LinkedList<>(); // 계산 결과를 저장하는 컬렉션
    int firstNum, secondNum; // 피연산자
    char operator; // 연산자

    // 생성자
//    Calculator(char operator, int firstNum, int secondNum){
//        this.operator = operator;
//        this.firstNum = firstNum;
//        this.secondNum = secondNum;
//    };
    Calculator(){};

    // 메서드
//    public Double calculate(char operator, int firstNum, int secondNum){
//        if(operator == '+')
//            answerQueue.add((double) firstNum + secondNum);
//        else if(operator == '-')
//            answerQueue.add((double) firstNum - secondNum);
//        else if(operator == '*')
//            answerQueue.add((double) firstNum * secondNum);
//        else if(operator == '/')
//            answerQueue.add((double) firstNum / secondNum);
//
//        return ((LinkedList<Double>)answerQueue).getLast();
//    }

    public void calculate(char operator, int firstNum, int secondNum){
        if(operator == '+')
            setResult((double) firstNum + secondNum);
        else if(operator == '-')
            setResult((double) firstNum - secondNum);
        else if(operator == '*')
            setResult((double) firstNum * secondNum);
        else if(operator == '/')
            setResult((double) firstNum / secondNum);
    }

    public void setResult(double result){
        answerQueue.add(result);
    }

    public Double getResult(){
        return ((LinkedList<Double>)answerQueue).getLast();
    }


}
