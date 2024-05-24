# 송태경 <h1>202130118

# 5월 3일 강의

# 4월 26일 강의


# 4월 19일 강의
자바의 인터페이스

클래스가 구현해야 할 메소드들이 선언되는 추상형
인터페이스 선언

자바 인터페이스 특징
인터페이스 상속
1.인터페이스간에 상속 가능
2.인터페이스 다중 상속 허용
패키지 개념과 필요성 3명이 분담하여 자바 응용프로그램을 개발하는 경우 동일한 이름의 클래스가 존재할 가능성 있음

# 4월 12일 강의
static 멤버

클래스의 멤버들 중 다음과 같이 static 지시어로 선언된 멤버를 static 멤버라고 부른다
static으로 선언된 멤버는 non-static 멤버와 매우 다른 특성을 가진다
static 멤버는 클래스당 하나만 생성되는 멤버로서, 동일한 클래스의 모든 객체들이 공유하므로 클래스 멤버라고 부른다
non-static 멤버는 객체가 생길때 함께 생성되고 객체가 사라지면 함께 사라진다 그러나 static 멤버는 프로그램을 시작할 때나 클래스 로딩 시에 생성된다
객체를 생성하기 전에도 static 멤버는 사용
생성된 객체가 소멸된 후에도 static 멤버는 여전히 살아 공간을 차지하고 있으며 프로그램이 종료할 때 함께 소멸

상속(interitance)
객체 지향 상속 자식이 부모 유전자를 물려받는 것과 유사한 개념

상속의 장점
1.클래스의 사이의 멤버 중복 선언 불필요 - 클래스의 간결화
2.클래스들의 계층적 분류로 클래스 관리 용이
3.클래스 재사용과 확장을 통한 소프트웨어의 생산성 향상

서브 클래스/슈퍼 클래스의 생성사 호줄과 실행
1.서브 클래스의 객체가 생성될 때 슈퍼 클래스 생성자와 서브 클래스 생성자 모두 실행 호출 순서
2.서브 클래스의 생성자 먼저 호출 -서브 클래스의 생성자는 실행 전 슈퍼 클래스 생성자 호출 실행 순서
3.슈퍼 클래스의 생성자가 먼저 실행된 후 서브 클래스의 생성자 실행

서브 클래스와 슈퍼 클래스의 생성자 선택
1.슈퍼 클래스와 서브 클래스 각각 여러 개의 생성자 작성 가능
2.서브 클래스의 객체가 생성될 때 슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개가 실행
3.서브 클래스의 생성자와 슈퍼 클래스의 생성자가 결정되는 방식

# 4월 5일 강의
2차원 배열

2차원 배열의 선언과 생성 1차원 배열과 마찬가지로 2차원 배열에서도 레퍼런스 변수 선언 후 배열을 생성하며, 2차원 배열의 레퍼런스 변수를 선언 int inArray[][]; 또는 int [][] intArray; // 2차원 배열의 레퍼런스 변수 선언 intArray = new int[2][5]; // 2행 5열(2*5)의 2차원 배열 생성
2차원 배열의 초기화

2차원 배열을 선언할 때 각 원소를 초기화 할 수 있다. 자동으로 초기화된 배열이 생성된다. int inArray[][] = { {0,1,2}, {3,4,5}, {6,7,8} }; // 33 배열 생성 char charArray[][] = { {'a','b','c'}, {'d','e','f'} }; // 23 배열 생성 double doubleArray[][] = { {0.01,0.02}, {0.03,0.04} }; // 2*2 배열 생성

객체 지향 언어의 목적

1.소프트웨어의 생산성 향상
2.컴퓨터 산업 발전에 따라 소프트웨어의 생명 주기(life cycle) 단축
3.객체 지향 언어

실세계에 대한 쉬운 모델링

1.초기 프로그래밍
2.현대 프로그래밍
3.객체 지향 언어


## 3월 29일 Java2 강의
타입 변환이란 변수나 상수 혹은 리터럴을 다른 타입을 변환하는것을 말한다.

자동타입 변환: 치환문이나 수식 내에서 타입이 일치하지 않을때 컴파일러는 작은 타입을 큰 타입으로 자동변환
강제타입 변환(캐스팅) : 큰 타입을 작은 타입으로 변환해야 할때 자동 변환 대신 컴파일 오류 발생 손실이 발생한다는 사실을 알고 변환한다면 강제로()안에 타입을 지정
증강연산

++,-- 피연산자의 앞 또는 뒤에 붙어 값을 1 증가시키거나 1 감소시킨다. a++ a를 1 증가하고 증가전의 값 변환 ++a a를 1증가하고 증가된 값 변환 a-- a를 1 가모하고 감소 전의 값 변환 --a a를 1 감소하고 감소된 값 변환
대입 연산

연산자의 오른쪽 식의 결과를 왼쪽에 있는 변수에 대입
비교연산, 논리 연산

비교연산자는 두 개의 피연산자를 비교하여 true 또는 false의 논리 결과를 내는 연산자
논리 연산자는 논리 값을 대상으로 AND,OR,XOR,NOT의 논리 연산을 하여 논리 값을 내는 연산자
조건문

단순 IF문 조건식은 비교 연산이나 논리 연산의 혼합된 식으로 구성되며 결과는 불린 값이다.
조건식이 참이면 if 내부의 실행 문장이 실행되며 거짓이면 if문을 벗어난다
다중 if-else 문은 if의 '조건식'이 참인 경우와 거짓인 경우에 실행할 문장을 각각 지시한다

## 3월 22일 Java2 강의
자바의 특징 플래폼 독릭성,객체지향, 클래스로 캡슐화,소스와 클래스파일, 실행코드 배포 ,패키지, 멀티스레드,가비지컬렉션,실시간응용 시스템에 부적합, 자바 프로그램은 안전하다,프로그램 작서이 쉽다, 실행속도를 개선하기 위해 JIT 컴파일러가 사용됨.
식별자: 클래스,변수,상수,메소드에 붙이는 이름(identifier) 식별자 이름 규칙에서 식별자를 만들때 규칙을 준수하여야함. 
1.식별자로 한글을 사용할 수 있음.
2.길이제한이 없음.
3.대소문자를 구별한다.

## 3월 15일 Java2  강의
java 개발환경 구축 openJDK 설치, Eclips 설치, Eclips에 openJDK 연결 자바 프로젝트 생성





