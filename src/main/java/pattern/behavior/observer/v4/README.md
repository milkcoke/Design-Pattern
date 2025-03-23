
텍스트 편집기 객체가 다른 객체에 자신의 상태 변경을 알릴 수 있게한다.

Subject 는 곧 EventManager
Observer 는 곧 EventListener 가 된다.
어? 그럼 Editor 는 뭔가?

Editor 는 도메인 객체면서 Subject 다.
EventManager 는 왜 탄생했을까?
Editor 안에 observer, subscribe, unsubscribe, notify 가 모두 있다고 가정해보라.

텍스트 파일 편집 뿐만 아니라 알림, 옵저버 등록, 해제까지 맡게된다.
불필요한 역할이다.

EventManager 라는 인터페이스를 별도로 분리하여
알림, 옵저버 등록/해제 역할을 위임했다.


## 역할, 책임 주도 설계
- Editor 는 편집 기능만 해야한다.
- EventManager 는 편집 상태 알림, 등록, 해제 역할만 한다.
- EventListener 는 편집 상태 알림을 받아 핸들링한다.




