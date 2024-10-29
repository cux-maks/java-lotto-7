# 로또!!

## 기능 요구사항
1. 입력
    - [ ] 구입 금액을 입력한다.
    - [ ] 당첨 번호를 입력받는다.
    - [ ] 보너스 번호를 입력받는다.

    
2. 로또 발행
    - [ ] 구입한 로또의 수 만큼 랜덤 번호 발행
    - [ ] 당첨 여부 기록
    - [ ] 수익률 계산


3. 출력
    - [ ] 구입한 로또 출력
    - [ ] 당첨 통계 출력
    - [ ] 수익률 출력

    
## 예외사항
1. 구입 금액 입력
    - [ ] 1000원 단위로 나누어 떨어지지 않는 경우
    - [ ] 숫자가 아닌 경우


2. 당첨 번호 입력
    - [ ] 구분자(,)로 split했을 때 문자가 포함된 경우
    - [ ] 숫자가 6개가 아닌 경우
    - [ ] 로또 번호 범위를 벗어나는 경우


3. 보너스 번호 입력
    - [ ] 숫자가 아닌 경우
    - [ ] 로또 범위를 벗어나는 경우

## 프로젝트 구조
```text
├── model/
│   ├── Lotto.java                    # 로또 한 장
│   ├── WinningLotto.java             # 당첨 번호 정보
│   ├── LottoGenerator.java           # 로또 번호 생성
│   ├── LottoMatcher.java             # 당첨 번호 매칭 
│   ├── LottoResult.java              # 당첨 결과 정보
│   └── Prize.java                    # 상금 정보 (enum)
├── controller/
│   └── LottoController.java          # 전체 게임 진행 제어
├── view/
│   ├── InputView.java                # 모든 입력을 처리
│   └── OutputView.java               # 모든 출력을 처리
├── validator/
│   └── LottoValidator.java           # 입력값 검증
└── exception/
    └── LottoException.java           # 예외 정의 (enum)
```