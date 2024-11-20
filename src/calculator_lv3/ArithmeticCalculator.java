package calculator_lv3;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator {

    // 속성(필드)
    private Queue<Double> resultQueue = new LinkedList<>(); // 계산 결과를 저장하는 컬렉션

    // 생성자
    ArithmeticCalculator(){};

    // 매개변수를 이용하여 연산하기
    public Double calculate(Operator operator, int firstNum, int secondNum){

        return operator.apply(firstNum, secondNum);
    }

    // 리턴받은 연산 결과를 컬렉션에 저장
    public void setResult(double result){
        resultQueue.add(result);
    }

    // 결과 출력을 위해 컬렉션에 저장된 결과값을 가져온다.
    public Double getResult(){
        return ((LinkedList<Double>) resultQueue).getLast();
    }

    // 가장 먼저 저장된 데이터를 삭제한다 poll()
    public void removeResult(){
        double result = resultQueue.peek(); // 가장 먼저 저장된 데이터
        System.out.println(result + " 삭제 완료");
        resultQueue.poll(); // FIFO -> 가장 맨 아래 값을 꺼내어 삭제
    }


}
