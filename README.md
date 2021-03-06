## Select your EmotioN

+ ๐ฑ ํ์ : ๊น๋ฏผ์ค, ๊น์ง์ฃผ, ์ด์ ํ, ์ด์นํ
+ ๐น ํ๋ก์ ํธ ์๊ฐ : ์์ ๊ฒ์ API๋ฅผ ํ์ฉํ ๋๋ง์ ํ๋ ์ด๋ฆฌ์คํธ ์์ฑ ์ฌ์ดํธ ๊ตฌ์ถ
+ ๐ช ์์ ๊ธฐ๊ฐ : 22/03/25 ~ 22/04/01
+ ๐ ๏ธ Tech <br/><br/>
  <img alt="React" src="https://img.shields.io/badge/-React-45b8d8?style=flat-square&logo=react&logoColor=white" />
  <img src="https://img.shields.io/badge/HTML5-E34F26?&style=flat-square&logo=html5&logoColor=white"/> 
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white" /> 
  <img src="https://img.shields.io/badge/JavaScript-323330?style=flat-square&logo=javascript&logoColor=F7DF1E" />
  <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=MySQL&logoColor=white"/>
  

## ๐ฐ ๋งก์ ์ญํ 
### Front
+ ์ด์นํ : Spotify api ์ฐ๊ฒฐ ๋ฐ ๊ฒ์ ๊ธฐ๋ฅ ๊ตฌํ, ๊ฐ ํ์ด์ง ์ฐ๋, CSS
+ ๊น์ง์ฃผ : Spotify api๋ฅผ ํตํด ๋ฐ์์จ ๋ฐ์ดํฐ๋ฅผ Back์ Restful API์ ํต์ , CSS
+ ์ด์ ํ : View ์ด์ ์ค๊ณ ๋ฐ sidebar route ๊ตฌํ, CSS

### Back
 + ๊น๋ฏผ์ค : Table ์ค๊ณ ๋ฐ Restful API ๊ตฌํ

## ๐ API Documentation
+ [Restful API Documentation](https://documenter.getpostman.com/view/19511452/UVypzd8x)
+ [spotify API](https://developer.spotify.com/console/)

## :mag:๊ธฐ๋ฅ ๊ตฌํ
### Front-end
  + Spotify API๋ฅผ ์ด์ฉํ ๋ก๊ทธ์ธ ๊ธฐ๋ฅ
  + Spotify API๋ฅผ ์ด์ฉํ ์จ๋ฒ, ์ํฐ์คํธ, ํธ๋ ์ ๋ณด ๊ฒ์ ๊ธฐ๋ฅ
  + ํ๋ ์ด๋ฆฌ์คํธ ์์ฑ ๋ฐ ๊ณก ์ถ๊ฐ ์ Back-end๋ก ์ ๋ณด๋ฅผ ๋ณด๋ด๊ณ  DB์ ์ ์ฅ
  + ํ๋ ์ด๋ฆฌ์คํธ ์ด๋ฆ ๋ณ๊ฒฝ
  + Spring ์๋ฒ ์ค๊ณ๋ฅผ ํตํด DB ์ฐ๋
  + ์ฌ์ฉ ๋ชจ๋
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
    + addPlayList : ์๋ก์ด ํ๋ ์ด๋ฆฌ์คํธ ์์ฑ ํ ํ๋ ์ด๋ฆฌ์คํธ ์ด๋ฆ, ์ธ๋ค์ผURL์ ๋ฐํ.
    + showPlayList : ์์ฑ๋์ด ์๋ ํ๋ ์ด๋ฆฌ์คํธ๋ค์ ์ด๋ฆ๊ณผ ์ธ๋ค์ผURL ๋ฆฌ์คํธ๋ฅผ ๋ฐํ.
    + updatePlayList : ํ๋ ์ด๋ฆฌ์คํธ์ ์ด๋ฆ์ ๋ณ๊ฒฝ, ๋ฐํ๊ฐ ์์.
    + deletePlayList : ํ๋ ์ด๋ฆฌ์คํธ๋ฅผ ์ญ์ , ํ๋ ์ด๋ฆฌ์คํธ์ ์๋ ๋ธ๋๋ค๋ ๋ชจ๋ ์ญ์ , ๋ฐํ๊ฐ ์์.
    + showSongList : ํ์ฌ ํ๋ ์ด๋ฆฌ์คํธ์ ์๋ ๋ธ๋๋ค์ ์ ๋ณด๋ฅผ ๋ชจ๋ ๋ฐํํจ.
    
 + SongInfoService
   + addSong : ํ๋ ์ด๋ฆฌ์คํธ์ ํด๋น ๋ธ๋๋ฅผ ์ถ๊ฐ, ๋ฐํ๊ฐ ์์.
   + deleteSong : ํ๋ ์ด๋ฆฌ์คํธ์ ํด๋น ๋ธ๋๋ฅผ ์ญ์ , ๋ฐํ๊ฐ ์์.

## :bell: FE UI ์ด๊ธฐ ๊ตฌ์ (use Drwa.io)
+ Door page
![๋๋ฌธ](https://user-images.githubusercontent.com/59858894/161069859-1ec4351a-96fd-4408-a3f1-e4247fa1658a.PNG)

+ Main page
![๋ฉ์ธ](https://user-images.githubusercontent.com/59858894/161071702-eb6e7652-f2ee-4682-b167-6b30ed529dd4.PNG)

+ playlistMake page
![ํ๋ ์ด๋ฆฌ์คํธ์ถ๊ฐ](https://user-images.githubusercontent.com/59858894/161070134-0ba952a8-1faa-4197-881a-505f64307533.PNG)

+ showPlaylist page
![ํ๋ ์ด๋ฆฌ์คํธ](https://user-images.githubusercontent.com/59858894/161070147-d8ea3559-9a8b-4c51-b822-4afd5ae26c6b.PNG)

## :bulb:์ฃผ์ ๋ก์ง
### Front-end
  + [react-router-dom](https://v5.reactrouter.com/web/guides/quick-start) 
    + BrowserRouter - history API๋ฅผ ์ด์ฉํด URL๊ณผ UI๋ฅผ ๋๊ธฐํ
    + Switch - ์์ ์ปดํฌ๋ํธ Route๋๋ Redirect์ค ๋งค์น๋๋ ์ฒซ ๋ฒ์งธ ์์๋ฅผ ๋ ๋๋ง
    + Route - ์ปดํฌ๋ํธ URL๊ณผ ๊ฒฝ๋ก๊ฐ ์ผ์นํ๋ฉด ํด๋นํ๋ ์ปดํฌ๋ํธ, ํจ์๋ฅผ ๋ ๋๋ง
    + Link - to์์ฑ์ ์ค์ ๋ ๋งํฌ๋ก ์ด๋, ๊ธฐ๋ก์ด history์คํ์ ์ ์ฅ ('a'ํ๊ทธ์ ์ ์ฌํ ๊ธฐ๋ฅ)<br/>
  + react-router-dom์ ํ์ฉํ์ฌ ์ฌ์ด๋๋ฐ๋ฅผ ๊ตฌํํ๊ณ  ์์ด์ฝ ํด๋ฆญ์ ์ด๋ ํ  ์ ์๋๋ก ํจ <br/>
    
  + react-redux - ์จ๋ฒ, ๊ฐ์, ๋ธ๋, ํ๋ ์ด๋ฆฌ์คํธ ๋ฑ ์ ๋ณด๋ฅผ ๋ฐ์์ค๋ ํจ์ ์ ์ ํ ์นดํ๊ณ ๋ฆฌ ํ์์ ๋ง๊ฒ ๋ฐ์์ ์ ๋ณด ์ถ๋ ฅ<br/>
  
  + Restful API ํธ์ถ
```   
const BASE_URL = 'http://localhost:????????????';

const ??? = (props) => {

  const [???, set???] = useState([]);

  useEffect(() => {

    const fetchBooks = async () => {
      const response = await fetch(BASE_URL,
        {
          method: 'POST',
            headers: {
              'Content-Type' : 'application/json',
            },
            body: JSON.stringify({
              ???
            })
        });
```

### Back-end
  + ํ์ด๋ธ ์ค๊ณ <br/><br/>
  ![11](https://user-images.githubusercontent.com/59858894/161178240-0212b903-99a7-497d-80ed-069c853907db.PNG)


## ๐ญ ์คํ ํ๋ฉด
[![SYE](https://user-images.githubusercontent.com/59858894/161200867-245d1d9d-6a54-4685-b114-877fadf22b0b.PNG)
](https://www.youtube.com/watch?v=yIjtxQzPwyo)
https://www.youtube.com/watch?v=yIjtxQzPwyo

## ๐จ LightHouse ์ธก์ 
![๋ผํ1](https://user-images.githubusercontent.com/59858894/161206157-db10cde4-aae4-4438-a1e7-d4ecf94ada2e.PNG)
![๋ผํ2](https://user-images.githubusercontent.com/59858894/161206162-714234bf-c5e8-4c16-bc01-f596af672cb1.PNG)


## ๐ฏ Issue
### Front-end
+ react ํ์ด์ง ์ฐ๋ ์ค๋ฅ
  + ๊ฐ๊ฐ์ ํ์ด์ง๋ฅผ ์ฐ๋ํ  ๋, ๊ฐ์ ์ฌ์ฉํ ๋ชจ๋์ ๋ฒ์ ์ด ๋ฌ๋ผ route๊ฐ ๋์ง ์์๋ค.
  + react-router-dom์ 6v -> 5v๋ก ํ์ํ์ฌ ์ฐ๋ํ์๋ค.

+ Context API๋ฅผ ์ฌ์ฉํ์ฌ ์ค์์์ ๋ฐ์ดํฐ ๊ด๋ฆฌ๋ฅผ ํ๋ ค๊ณ  ํ์์ผ๋, ์ ๋๋ก ์ฌ์ฉํ์ง ๋ชปํ๊ณ  props๋ก ์ฌ์ฉํ์๋ค.

+ ์๋ฒ๋ก ๋ฐ์ดํฐ sending์ ๋ฐํ๊ฐ undefined
  + ๊ธฐ์กด ์๋ฒ์์ @GetMapping์ผ๋ก ๋ฐ์ดํฐ๋ฅผ ๋ฐ์์ฌ ๋ undefined๋ฅผ ๋ฐํ๋ฐ์๋ค.
  + controller์ return์ด ์์ด์ ๋ฐํํ์ง ๋ชปํ๊ธฐ ๋๋ฌธ์ return์ ์ถ๊ฐํ์๋ค. 

+ ๋ธ๋ api๋ฅผ ๊ตฌํ๊ธฐ ์ด๋ ค์ ํฌ๋กค๋ง์ ์ด์ฉํ ๋ธ๋ ์ ๋ณด ๋ฐ์์ค๊ธฐ 
  + api๋ฅผ ์ฐพ์ ๊ตฌํ์ ํ๋๋ก ํจ
    
### Back-end
+ Repository์์ DB์ Native Query ์์ฒญ ์ ์๋ฒ ์คํ์ด ๋์ง ์๋ ๋ฌธ์ 
  + Query ์ด๋ธํ์ด์์ nativeQuery ์์ฑ์ true๋ก ์ค์ 
+ ์๋ฒ๋ก UPDATE Native Query DB์ ์์ฒญํ  ๋ TransactionRequiredException ์๋ฌ
  + ์๋น์ค๋ฅผ ๊ตฌํํ๋ ๋ฉ์๋์ @Transactional ์ถ๊ฐ

## ๐ป ๊ฐ์ ํด์ผ ํ  ์ 
### Front
+ CRUD ์์์ back์ ์์ฒญ ํ ๋ฐํ๋ ๊ฐ์ ๋ฐ์ ๋ค ์๋ก๊ณ ์นจ์ ํด์ผ ์ ์ฉ๋์ด ๋ํ๋๋ค.
  + Context๋ก ๊ด๋ฆฌํ๋ฉด ๋๋ ์๊ฐ ๊ด๊ณ์ ๊ตฌํํ์ง ๋ชปํ๋ค.
+ ํ๋ ์ด๋ฆฌ์คํธ๋ฅผ ํด๋ฆญ์ ํด๋น ํ๋ ์ด๋ฆฌ์คํธ์ ๋ํ ๋ด์ฉ์ด ์ถ๋ ฅ ๋์ด์ผ ํ๋ ๋งํฌ ์ฐ๊ฒฐ์ด ๋์ง ์๋๋ค. 
+ ํ๋ ์ด๋ฆฌ์คํธ ํด๋ฆญ์ ํด๋น ํ๋ ์ด๋ฆฌ์คํธ์ ๋ํ ๋ด์ฉ์ ์ถ๋ ฅํ๋ ๊ณผ์ ์์ context๋ก ์ฒ๋ฆฌํ๋ ๊ฒ์ ์ด๋ ค์์ ๋๊ผ๊ณ , redux ๋์  recoil์ ์ด์ฉํ์ฌ ํ์ ํด๊ฒฐํ๊ณ ์ ํจ

### Back
+ ๊ฐ ์๋น์ค ์์ฒญ ์์ ์์ธ ์ฒ๋ฆฌ๊ฐ ๊ตฌํ๋์ด ์์ง ์์
  + ex1 : ํ๋ ์ด๋ฆฌ์คํธ๊ฐ ์๋๋ฐ ํ๋ ์ด๋ฆฌ์คํธ ์ญ์  ์์ฒญ์ ํ๋ ๊ฒฝ์ฐ
  + ex2 : ํ๋ ์ด๋ฆฌ์คํธ์ ๋ธ๋๊ฐ ์์ ๋ ๋ธ๋ ์ญ์  ์์ฒญ์ ํ๋ ๊ฒฝ์ฐ
+ Playlist Deleteํ  ๋ API๋ก ๋ณด๋ด๋ ๊ฐ์ด ํ๋ ์ด๋ฆฌ์คํธ ์ด๋ฆ ๋ฟ์ด๊ธฐ ๋๋ฌธ์ ๊ฐ์ ์ด๋ฆ์ ํ๋ ์ด๋ฆฌ์คํธ๊ฐ ์์ ๋, ํ๋ ์ด๋ฆฌ์คํธ๊ฐ ์ญ์ ๋์ง ์์
