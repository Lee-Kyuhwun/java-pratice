# Java 코딩테스트 연습 프로젝트

Java 21을 사용한 코딩테스트 연습 프로젝트입니다.

## 프로젝트 구조

```
java-pratice/
├── src/
│   ├── main/java/         # 솔루션 코드
│   │   ├── Solution.java  # 문제 풀이
│   │   └── Main.java      # 실행 파일
│   └── test/java/         # 테스트 코드
│       └── SolutionTest.java
├── pom.xml                # Maven 설정
└── README.md
```

## 실행 방법

### 방법 1: javac/java 직접 사용 (간단)

```bash
# 컴파일 및 실행
javac -d target/classes src/main/java/*.java && java -cp target/classes Main
```

### 방법 2: Maven 사용 (권장)

Maven을 먼저 설치해주세요:

```bash
# macOS (Homebrew 사용)
brew install maven

# 설치 확인
mvn -version
```

Maven으로 빌드 및 테스트:

```bash
# 컴파일
mvn compile

# 테스트 실행
mvn test

# 클린 빌드 및 테스트
mvn clean test

# Main 클래스 실행
mvn exec:java -Dexec.mainClass="Main"
```

## 포함된 예제 문제

### 1. Two Sum
정수 배열과 목표값이 주어졌을 때, 두 수의 합이 목표값이 되는 인덱스를 찾는 문제

### 2. Array Sum
배열의 모든 요소의 합을 구하는 문제

## 새로운 문제 추가하기

1. `src/main/java/Solution.java`에 새 메서드 추가
2. `src/test/java/SolutionTest.java`에 테스트 케이스 추가
3. 필요시 `Main.java`에 실행 예제 추가

## IntelliJ IDEA에서 사용하기

1. IntelliJ IDEA 실행
2. File → Open → 프로젝트 폴더 선택
3. Maven 프로젝트로 자동 인식됨
4. 우클릭으로 테스트 실행 가능
