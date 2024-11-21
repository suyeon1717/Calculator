# [Spring 4기] CH 2 계산기 과제
#### 클래스를 활용한 계산기와 클래스를 사용하지 않는 계산기 두 가지를 구현한다. 이번 과제는 자바의 기본 문법 실습과 객체 지향 개념의 적용을 목표로 한다.

## 📋 요구사항
#### - Level 1 , 2
- 양의 정수(0 포함)와 사칙연산 기호를 입력받아 연산을 진행 한 후 결과값을 출력
- 반복문을 사용하되, "exit" 문자열을 입력하기 전까지 무한으로 계산
- 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
- App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)
- 컬렉션에 저장된 연산 결과값들 중에 가장 먼저 저장된 결과값을 삭제하는 기능을 가진 메서드 구현
#### - Level 3

- Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 이를 사칙연산 계산기 ArithmeticCalculator 클래스에 활용
- 실수, 즉 double 타입의 값을 전달 받아도 연산이 수행하도록 만들기
- 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력

## 🖥 구현
- UI : 콘솔 기반의 계산기
- 결과값 저장 컬렉션 : Queue
- 결과 <br>
  ![image](https://github.com/user-attachments/assets/5293b057-651d-489b-9d54-e8c48c67d30c)
![image](https://github.com/user-attachments/assets/4af5e9d2-f112-4e2b-b745-b22a3e79362a)

## ⚠️ 에러 처리
- 숫자 입력 시, 다른 타입을 입력했을 경우 & 음수 입력 <br>
  ![image](https://github.com/user-attachments/assets/d432c2d2-c60a-401f-a2f3-2c28f3d3b48f) <br>
  ![image](https://github.com/user-attachments/assets/6e21bb75-f6ed-439e-ac59-9d18095897ff) <br>
- 0으로 나누기<br>
  ![image](https://github.com/user-attachments/assets/6961364c-b493-447b-b2a4-9f56930e659e)
- 사칙연산 기호 오입력<br>
  ![image](https://github.com/user-attachments/assets/bf34c2ba-a4e9-46a2-accb-60736505a35a)

## 💬 고찰
- enum, 제너릭, 람다 & 스트림에 대해 이해도가 부족하다고 생각된다. 더 공부해서 프로젝트를 완성시키고 싶다.
- 사칙연산 기호 입력 시 "++abcd" 이렇게 입력하면 charAt(0)에 의해 +로 인식한다. 예외처리를 더 상세하게 하면 좋았을 것 같다.
- 캡슐화, 메서드 단일 기능 원칙 등 객체 지향 프로그래밍을 이해하면서 실습할 수 있었다.
