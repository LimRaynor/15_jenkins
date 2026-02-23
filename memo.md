# 젠킨스

## 젠킨스란
 CI 지속적인 개발과 CD 지속적인 배달/배포 를 해주는것
 
##
파이프라인 == 그루기 기반의 스크립트 사용
테스트 ~ 결과까지 여러가지 스테이지를 나눠서 해보는것



## ssh
내컴퓨터에서 다른서버(호스팅서버)의 쉘(터미널) 이용을 위한 키
양쪽에 두고 같을때만 이용하게한다
- 공개키:아파트1층현관비밀번호
- 개인키:우리집비밀번호

## 구글로그인 == 오어스 투
나대신 jenkims가 -> docker build 이미지를 생성하고 -> docker push 푸쉬까지 실행
(아이디랑 비밀번호를 젠킨스가 알아야한다)

## 흐름 
코드작성 -> comit/push -> github 올랑옴 -> 
WebHook(이벤트리스너같음) ->  jenkins 한태 main branch가 push 됐어 라고 알려줌
local host 에는 외부에서 접속할수없으니  ngrok(외부 접속 주소 생성)- wrebhook 에서 ngrok으로 요청
그후 main branch가 pipeline - pull, gradle build, test, docker build/push
후 파이프라인 구축하면
새로운이미지가 나올때마다 자동적으로 도커 허브에 push가 되게 된다

## ngrok 

## Argo
CD 중에서 쿠버네틱스를 이용한 배포에 필요한것
젠킨스만 쓰면
k8s 환경이면 젠킨스만 가지고 할 수 없다 -> 젠킨스에 k8s환경이없다
그래서 Argo CD 를 이용해야한다
-> 항상 모니터링해서 변경이 감지되면 새로운 pod를 생성함
