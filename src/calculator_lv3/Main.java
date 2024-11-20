package calculator_lv3;

import calculator_lv2.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum, secondNum;
        char operatorChar;

        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        // 반복문을 사용해서 연산을 반복한다.
        while(true){

            // 피연산자 입력
            try{
                System.out.print("첫 번째 숫자를 입력하세요: ");
                firstNum = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                secondNum = sc.nextInt();

                // 음수인지 확인
                if(firstNum < 0 || secondNum < 0)
                    throw new InputMismatchException();

            }
            // 예외처리 - 숫자 입력 오류
            catch(InputMismatchException e){
                System.out.println("잘못된 입력입니다. 처음으로 돌아갑니다.");
                continue;
            }
            finally {
                sc.nextLine();
            }

            // 연산자 입력 -> 사칙연산 기호 입력 받을 때까지 반복
            Operator operator = null;
            while(operator == null) {
                try{
                    System.out.print("사칙연산 기호를 입력하세요: ");
                    operatorChar = sc.nextLine().charAt(0);
                    operator = Operator.fromChar(operatorChar);
                } catch (IllegalArgumentException e) {
                    System.out.println("다시 입력하세요.");
                }
            }
            // 예외처리 - 두 번째 숫자를 0으로 입력하고, 연산 기호는 '/' 으로 입력한 경우
            if (operator == Operator.DIVIDE && secondNum == 0){
                System.out.println("나눗셈 연산에서 두 번째 정수에 0이 입력될 수 없습니다. 다시 입력하세요.");
                continue; // while 반복문 처음으로 돌아가서 다시 입력받기
            }


            // 계산기 실행
            // 1. 입력받은 매개변수로 calculate() 메서드 실행
            // 2. 반환된 결과값을 setResult()메서드를 통해 결과값 컬렉션에 추가 (setter)
            double result = calculator.calculate(operator, firstNum, secondNum);
            calculator.setResult(result);
            System.out.println("계산 결과: " + calculator.getResult()); //getter

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료 / remove 입력 시 가장 오래된 계산 결과값 삭제) : ");
            String str = sc.nextLine();

            // "exit" 입력 시 반복 종료
            if (str.equals("exit")){
                sc.close();
                break;
            }
            // "remove" 입력 시 결과 값을 저장하는 컬렉션에서 가장 처음으로 저장된 데이터 삭제
            else if(str.equals("remove"))
                calculator.removeResult();
        }
    }
}
