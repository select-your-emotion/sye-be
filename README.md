## Select your EmotioN

+ 🐱 팀원 : 김민준, 김진주, 이정훈, 이승현
+ 🐹 프로젝트 소개 : 음원 검색 API를 활용한 나만의 플레이리스트 생성 사이트 구축
+ 💪 소요 기간 : 22/03/25 ~ 22/03/31
+ 🛠️ Tech
  + React
  + CSS
  + Javascript
  + Java
  + Spring JPA


## 🐰 맡은 역할

## 📖 API Documentation
+ [Overview](https://documenter.getpostman.com/view/19511452/UVypzd8x)
+ [spotify API](https://developer.spotify.com/console/)

## :mag:기능 구현
### Front-end
  + Spotify API를 이용한 로그인 기능
  + Spotify API를 이용한 앨범, 아티스트, 트랙 정보 검색 기능
  + 플레이리스트 생성 및 곡 추가 시 Back-end로 정보를 보내고 DB에 저장
  + Spring 서버 중계를 통해 DB 연동
  + 사용 모듈
    + "axios": "0.26.1"
    + "bootstrap": "5.1.3"
    + "react": "17.0.2"
    + "react-bootstrap": "2.2.2"
    + "react-dom": "17.0.2"
    + "react-icons": "4.3.1"
    + "react-redux": "7.2.6"
    + "react-router-dom": "5.3.0"
    + "react-scripts": "5.0.0"
    + "redux": "4.1.2"
    + "redux-thunk": "2.4.1"
    + "spotify": "0.3.0",
    + "spotify-web-api-js": "1.5.2"
    + "spotify-web-api-node": "5.0.2"

### Back-end
  + PlayListService
    + addPlayList : 새로운 플레이리스트 생성 후 플레이리스트 이름, 썸네일URL을 반환.
    + showPlayList : 생성되어 있는 플레이리스트들의 이름과 썸네일URL 리스트를 반환.
    + updatePlayList : 플레이리스트의 이름을 변경  (어떤 값을 반환해야 할지 아직 프론트랑 상의 안됨, 추후 수정될 수 있음)
    + deletePlayList : 플레이리스트를 삭제, 플레이리스트에 있는 노래들도 모두 삭제, 반환값 없음.
    + showSongList : 현재 플레이리스트에 있는 노래들의 정보를 모두 반환함.
    + increaseFollow : 좋아요 수 증가 (아직 구현 안됨, 우선순위 낮음)
    
 + SongInfoService
   + addSong : 플레이리스트에 해당 노래를 추가, 반환값 없음.
   + deleteSong : 플레이리스트에 해당 노래를 삭제, 반환값 없음.

## :bulb:주요 로직
### Front-end
  + [react-router-dom](https://v5.reactrouter.com/web/guides/quick-start) 
    + BrowserRouter - history API를 이용해 URL과 UI를 동기화
    + Switch - 자식 컴포넌트 Route또는 Redirect중 매치되는 첫 번째 요소를 렌더링합니다. 
    + Route - 컴포넌트 URL과 경로가 일치하면 해당하는 컴포넌트, 함수를 렌더링
    + Link - to속성에 설정된 링크로 이동, 기록이 history스택에 저장 ('a'태그와 유사한 기능)
    
### Back-end
  + 테이블 설계  <br/>
  ![7](https://user-images.githubusercontent.com/59858894/161004653-cb34b6c1-008b-4b49-a97f-1ab8806811ec.PNG)


## 🐭 실행 화면


## 🎨 LightHouse 측정


## 🐯 Issue
### Front-end
+ react 페이지 연동 오류
  + 각각의 페이지를 연동할 때, 각자 사용한 모듈의 버전이 달라 route가 되지 않았다.
  + react-router-dom을 6v -> 5v로 하양하여 연동하였다.
+ 연동 후 각 기능 구현 오류
  + 페이지 연동 후 기능이 정상적으로 작동하지 않았다.
  + 상위 컴포넌트로 route를 이동하여 수정하였다.
+ 서버로 데이터 sending시 반환값 undefined
  + 기존 서버에서 @GetMapping으로 데이터를 받아올 때 undefined를 반환받았다.
  + controller에 return이 없어서 반환하지 못했기 때문에 return을 추가하였다. 
    
### Back-end
+ Repository에서 DB에 Native Query 요청 시 서버 실행이 되지 않는 문제
  + Query 어노테이션의 nativeQuery 속성을 true로 설정
+ 서버로 UPDATE Native Query DB에 요청할 때 TransactionRequiredException 에러
  + 서비스를 구현하는 메서드에 @Transactional 추가

## 🐻 개선해야 할 점
+ 각 서비스 요청 시에 예외 처리가 구현되어 있지 않음
  + ex1 : 플레이리스트가 없는데 플레이리스트 삭제 요청을 하는 경우
  + ex2 : 플레이리스트에 노래가 없을 때 노래 삭제 요청을 하는 경우
