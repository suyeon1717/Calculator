package calculator_lv1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double result = 0;
        int firstNum, secondNum;

        Scanner sc = new Scanner(System.in);

        // 반복문을 사용해서 연산을 반복한다.
        while(true){

            try{
                System.out.print("첫 번째 숫자를 입력하세요: ");
                firstNum = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                secondNum = sc.nextInt();

                // 음수인지 확인
                if(firstNum < 0 || secondNum < 0)
                    throw new InputMismatchException();

            }catch(InputMismatchException e){
                System.out.println("잘못된 입력입니다. 처음으로 돌아갑니다.");
                continue;
            }
            finally {
                sc.nextLine();
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            // 사칙연산 조건문
            switch (operator) {
                case '+':
                    result = firstNum + secondNum;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    break;
                case '/':
                    if (secondNum == 0) { // 두 번째 숫자를 0으로 입력하고, 연산 기호는 '/' 으로 입력한 경우
                        System.out.println("나눗셈 연산에서 두 번째 정수에 0이 입력될 수 없습니다. 다시 입력하세요.");
                        continue; // while 반복문 처음으로 돌아가서 다시 입력받기
                    } else
                        result = (double) firstNum / secondNum;
                    break;
                default:
                    System.out.println("사칙연산 기호를 다시 입력하세요. (+, -, *, /)");
                    continue; // while 반복문 처음으로 돌아가서 다시 입력받기
            }

            System.out.println("계산 결과: " + result);
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");

            if (sc.nextLine().equals("exit")){
                sc.close();
                break; // "exit" 입력 시 반복 종료
            }


            result = 0; // 계산 결과 초기화
        }
    }
}