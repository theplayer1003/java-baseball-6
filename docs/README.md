# java-baseball-6
___

# RDD, Responsibility-Driven Design

## 시스템 책임
- 사용자에게 숫자 야구 게임을 제공

### 책임 분할
1. 프로그램을 실행하라
   - Application
2. 메시지를 출력하라(인트로)
   - Controller, 이상하다. 근데 딱히 마땅한 객체도 안 보인다. 이 멘트는 오직 처음 프로그램이 기동되고 나서 한번만 출력되는 부분. 컨트롤러의 책임은 아닌데 마땅히 둘 곳도 없다. 객체를 만들자. IntroHandler?
3. 메시지를 출력하라(숫자 입력 안내)
   - InputHandler, Printer

   1. 게임에 쓰일 세 개의 숫자를 생성하라
   - NumberFactory -> AnswerNumber
4. 세 개의(세자리) 숫자를 입력 받아라
   - InputHandler
5. 입력을 파싱하라
   - InputParser
6. 객체를 생성하라
   - NumberFactory -> UserNumber
7. 볼, 스트라이크를 판단하라
   - BaseballGame
8. 판단 결과를 출력하라
   - OutputHandler
9. 3스트라이크가 나올때까지 7번-8번을 반복하라
   - RetryHandler, 행동도 객체로 만들 수? 있구나?
10. 메시지를 출력하라(retry 안내)
    - InputHandler, Printer
11. 재시도 입력을 받아라
    - InputHandler
12. 게임 종료, 재시작 여부를 판단하라
    - RetryHandler?
13. 재시작하거나, 종료하라

