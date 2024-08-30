JavaFaker : https://github.com/AOP-sparta/Trello/tree/feat/%2396
![header](https://capsule-render.vercel.app/api?type=soft&color=89E2FF&height=100&section=header&text=칸반보드%20프로젝트&fontSize=60&fontAlignY=55)

## 목차
- [👨🏻‍👩🏻‍👧🏻‍👦🏻 Team 소개](#team)
- [🎨 Teck Stack](#teck-stack)
- [🎯 구현기능](#feature)
- [📑 Technical Documentation](#tech-doc)
- [⚠️ 트러블 슈팅](#trouble)
<br>

<div id="team">
   
# 👨🏻‍👩🏻‍👧🏻‍👦🏻 AOP 팀 소개

   
| 김혜은                         | 김세림                         | 김원기                         | 이세비                         | 이지우                         |
|-------------------------------|-------------------------------|-------------------------------|-------------------------------|-------------------------------|
| [![김혜은](https://github.com/MetroDefro.png)]([https://github.com/MetroDefro]) | [![김세림](https://github.com/serim01.png)](https://github.com/serim01) | [![김원기](https://github.com/WonGi-Kim.png)](https://github.com/WonGi-Kim) | [![이세비](https://github.com/leesebi.png)](https://github.com/leesebi) | [![이지우](https://github.com/wldnfl.png)](https://github.com/wldnfl) |

<details>
<summary>김혜은</summary>
<div markdown="1">

- Security 전체 구조
- 프로젝트 세팅
- 회원가입, 로그인, 로그아웃 기능
- 프론트엔드: 회원가입, 로그인 구현 및 연동 / 카드 디테일 페이지 구현
- 프로젝트 전체 관리

</div>
</details>

<details>
<summary>김세림</summary>
<div markdown="1">

- 보드 관리 기능
- 쿼리 최적화: 보드, 댓글
- 프론트엔드: 카드 디테일 페이지 api 연동

</div>
</details>

<details>
<summary>김원기</summary>
<div markdown="1">

- 컬럼 관리 기능
- 쿼리 최적화: 칼럼
- 프론트엔드: 칼럼 api 연동

</div>
</details>

<details>
<summary>이세비</summary>
<div markdown="1">

- 카드 관리 기능
- 쿼리 최적화: 카드
- 프론트엔드: 카드 api 연동

</div>
</details>

<details>
<summary>이지우</summary>
<div markdown="1">

- 댓글 관리 기능
- 프론트엔드: 구조, 메인 페이지, 카드 상세 페이지

</div>
</details>
</div>

<div id="teck-stack">
  
# 🎨 Teck Stack

| Type       | Tech                                                                                                              | Version                                                                                                           |
| ---------- | ----------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| IDE        |  ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)     |         |
| Framework  |  ![Spring](https://img.shields.io/badge/SpringBoot-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)          | 3.3.0       |
| Langage    | ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)                  | JDK17              |
| Database   | ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white) <br/> ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white) |  8.0.28 <br/>  3.8    |
| Tools      | ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)  ![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)       |     |
| Document |[![Notion](https://img.shields.io/badge/Notion-%23000000.svg?style=for-the-badge&logo=notion&logoColor=white)](https://www.notion.so/teamsparta/c9451bbd45cb4097a00f5e7b154fe6da?pvs=4) <br /> ![Figma](https://img.shields.io/badge/figma-%23F24E1E.svg?style=for-the-badge&logo=figma&logoColor=white) <br/>![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)||
 | Code Editor | ![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)  | |
 | FrontEnd | ![React](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB) | |

</div>

<div id = "feature">
  
# 🎯 구현기능

<details> 
  <summary>사용자 기능 </summary>
<div markdown="1">

- [x] 로그인 기능
- [x] 로그아웃 기능
- [x] 회원가입
</div>
</details>

<details> 
  <summary>보드 관리 기능 </summary>
<div markdown="1">

- [x] 보드 목록 조회
- [x] 보드 생성
- [x] 보드 수정
- [x] 보드 삭제
- [x] 보드 초대
</div>
</details>

<details> 
  <summary>컬럼 관리 기능 </summary>
<div markdown="1">

- [x] 컬럼 생성
- [x] 컬럼 삭제
- [x] 컬럼 순서 이동
- [x] 컬럼 조회
- [x] 컬럼 수정
</div>
</details>

<details> 
  <summary>카드 관리 기능 </summary>
<div markdown="1">

- [x] 카드 생성
- [x] 카드 삭제
- [x] 카드 순서 이동
- [x] 카드 전체 조회, 단건 조
- [x] 카드 수정
</div>
</details>

<details> 
  <summary>댓글 관리 기능 </summary>
<div markdown="1">

- [x] 댓글 작성
- [x] 댓글 조회
</div>
</details>
</div>

<div id = "tech-doc">
  
# 📑 Technical Documentation

<details>
<summary>⭐와이어 프레임</summary>
<div markdown="1">

![image](https://github.com/user-attachments/assets/1f790d2a-bc78-42b2-8659-ed774917ed6a)
![Figma-prototype](https://www.figma.com/proto/E2sxEIJ3XlFznmMiRJcSlx/%EC%B9%B8%EB%B0%98%EB%B3%B4%EB%93%9C-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8?node-id=4-2082&t=fYMTdKc3gIdwF9Kv-1&scaling=min-zoom&content-scaling=fixed&page-id=0%3A1)

</div>
</details>

<details>
<summary>🧬 ERD DIAGRAM</summary>
<div markdown="1">
 
   ![Untitled (2)](https://github.com/user-attachments/assets/330ce7b6-7b14-441d-a6bc-522273cba4d6)

</div>
</details>

<details>
<summary> 🔨 API 명세서</summary>
<div markdown="1">
  
![kanban_swagger](https://github.com/user-attachments/assets/2097c38a-4ba3-428a-b63c-c8f5b664b86d)

</div>
</details>

<details>
<summary>🔱 Branch Rule</summary>
<div markdown="1">
  
## 🔱  Branch Rule
- main, dev, feature 브랜치 사용.
- feature 브랜치에서 기능 개발 완료시 dev 브랜치로 merge
- 프로젝트 완료시 main 브랜치로 merge
- **feature/#이슈번호**
> ex)  
> feature/#36


</div>
</details>

</div>
</details>


<details>
<summary>🌠 Commit Rule</summary>
<div markdown="1">
  
## 🌠 Commit Rule
- **[#이슈번호] '작업 타입' : '작업 내용'**
> ex)  
> [#36] ✨ feat : 회원가입 기능 추가

| 작업 타입 | 작업내용 |
| --- | --- |
| ✨ feat | 새로운 기능을 추가 |
| 🐛 bugfix | 버그 수정 |
| ♻️ refactor | 코드 리팩토링 |
| 🩹 fix | 코드 수정 |
| 🚚 move | 파일 옮김/정리 |
| 🔥 del | 기능/파일을 삭제 |
| 🍻 test | 테스트 코드를 작성 |
| 🎨 readme | readme 수정 |
| 🙈 gitfix | gitignore 수정 |
| 🔨script | package.json 변경(npm 설치 등) |


</div>
</details>



<details>
<summary>🚀 Code Convention</summary>
<div markdown="1">
  
## 🚀 Code Convention
### DTO
> - `@Data` 어노테이션 사용

### Controller
> - `CommonResponse`로 묶어 `ResponseEntity`로 반환하기

</div>
</details>
<div id ="trouble">
  
# ⚠️ 트러블 슈팅

<details>
<summary>docker 연결 문제1 - 3306 포트 충돌 </summary>
<div markdown="1">
   
![스크린샷 2024-07-10 164602](https://github.com/user-attachments/assets/8d4c41fa-8d53-464a-a1ae-ec1912dba44f)

  기존에 설치해놓은 mysql과 3306 포트가 충돌
  ![스크린샷 2024-07-10 164845](https://github.com/user-attachments/assets/c5cf73ce-2ee5-4e74-aceb-075b96557304)
  
다음과 같이 cmd에서 작업한 후 다시 실행하니 문제없이 docker가 실행됨

→ 이후 팀원들과 환경을 동일하게 하기위해  3307 포트로 변경하여 작업함. (충돌 많은 이슈)

docker- compose → `ports:  - "3307:3306"`

</div>
</details>

<details>
<summary>docker 연결 문제2 - 특정 포트 사용 불가 </summary>
<div markdown="1">
   
`an attempt was made to access a socket in a way forbidden by its access permissions.`

- 윈도우를 껐다 켤 때마다 특정 포트들이 사용 불가능 하게 된다.
<br>그러나 다른 곳에 사용 중인 포트는 아니다.

- 재부팅을 할 때마다 사용 불가 포트가 바뀌기 때문에 보통 재부팅을 하면 해결 된다.

</div>
</details>

<details>
<summary>Java - Faker 연동 </summary>
<div markdown="1">
   
- Java - Faker를 쓰면서 gradle과 snakeYAML 버전 때문에 의존성 추가가 어려웠던 점
    
    → 가장 최신 버전의 gradle 3.3.1과 연동되는 snakeYAML 버전을 찾아서 명시적으로 의존성 추가
    
- CSV 데이터를 MySQL 테이블에 삽입해야 하는데 `SHOW VARIABLES LIKE 'secure_file_priv';` 
로 나온 폴더에 CSV 데이터를 옮긴다음 Local_infile을 해도 안되는 현상
    
    → MySQL을 docker를 통해 실행했기 때문에 권한 설정과 파일을 로컬이 아닌 docker를 통해서 진행하여 해결

</div>
</details>

<details>
<summary>보드 삭제 api 연동 </summary>
<div markdown="1">
   
- 특정 보드 삭제하는 기능
- 'Selected board does not have a valid ID.' `confirmDeleteBoard` 함수에서 선택된 보드의 `boardId`를 가져오는 과정에서 문제가 발생
- 보드 생성 시 서버 응답에서 `id`를 추출하여 보드 객체에 추가하고, 삭제 함수 에서는 이 `id`를 사용하여 삭제 요청을 보내도록 수정

</div>
</details>

<details>
<summary>보드 삭제,수정했을 때 드롭다운 메뉴 자동 업데이트 </summary>
<div markdown="1">
   
- 보드를 생성하거나 수정했을 때 드롭다운 메뉴가 자동으로 업데이트 되도록 수정
- **보드 선택 드롭다운 수정**: `Object.keys(boards).map`을 통해 보드 이름들을 옵션으로 표시
- **handleAddBoard 함수 수정**: `boardName.trim()`을 통해 보드 이름에서 앞뒤 공백을 제거하고 키로 사용.새로운 보드를 `setBoards`를 통해 추가하고 `selectedBoard`를 새 보드의 이름으로 설정하여 보드 선택 드롭다운에서 바로 선택되도록 한다.
</div>
</details>

</div>
