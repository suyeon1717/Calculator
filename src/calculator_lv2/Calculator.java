package calculator_lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    // 속성(필드)
    private Queue<Double> resultQueue = new LinkedList<>(); // 계산 결과를 저장하는 컬렉션

    // 생성자
    Calculator(){};

    public Double calculate(char operator, int firstNum, int secondNum){

        double result = 0;
        if(operator == '+')
            result = ((double) firstNum + secondNum);
        else if(operator == '-')
            result = ((double) firstNum - secondNum);
        else if(operator == '*')
            result = ((double) firstNum * secondNum);
        else if(operator == '/')
            result = ((double) firstNum / secondNum);
        
        return result;
    }

    public void setResult(double result){
        resultQueue.add(result);
        System.out.println("결과값이 컬렉션에 잘 저장되는지 확인 >> " + resultQueue.toString());
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
