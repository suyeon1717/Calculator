package calculator_lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    // 속성(필드)
    private Queue<Double> resultQueue = new LinkedList<Double>(); // 계산 결과를 저장하는 컬렉션

    // 생성자
    Calculator(){};

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
        resultQueue.add(result);
    }

    public Double getResult(){
        return ((LinkedList<Double>) resultQueue).getLast();
    }

    public void removeResult(){
        double result = resultQueue.peek(); // 가장 먼저 저장된 데이터
        System.out.println(result + " 삭제 완료");
        resultQueue.poll(); // FIFO -> 가장 맨 아래 값을 꺼내어 삭제
    }


}
