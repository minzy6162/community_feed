# 📝 커뮤니티 피드 서비스

> 📘 **패스트캠퍼스 | 9개 도메인 프로젝트로 끝내는 백엔드 웹 개발 (Java/Spring) 초격차 패키지 Online**  
> 🧩 **Ch 03. 객체 지향 설계 실습 - 커뮤니티 피드 서비스 초안 설계하기**

---

## ✅ 유저 서비스 기능

### 1. 유저 생성
- 유저는 **ID로 구분**되어야 함
- 이름과 프로필 이미지를 입력받아 저장
- 이름은 **빈 값 불가**

### 2. 팔로우 기능
- 다른 사용자를 팔로우/언팔로우 가능
- **자기 자신은 팔로우할 수 없음**

### 3. 프로필 노출
- 프로필 클릭 시 아래 정보 노출:
  - 이름, 프로필 이미지, 팔로잉 수, 팔로워 수
  - 각 수치를 클릭하면 해당 유저 리스트 표시
    - 리스트에는 이름과 프로필 이미지 포함

---

## 📰 피드 서비스 기능

### 1. 게시물 작성
- 텍스트 입력 및 공개 범위 설정 (예: 전체 공개, 팔로워 전용)
- 글자 수는 **5자 이상 ~ 500자 이하**만 허용

### 2. 댓글 작성
- 텍스트 입력 후 댓글 작성 가능
- 글자 수는 **100자 이하**로 제한

### 3. 게시물 상호작용
- 좋아요 기능 제공 (본인 글에는 좋아요 불가)
- 댓글 입력 및 댓글 보기 가능
- 좋아요/댓글 수 클릭 시 목록 표시
- 수정 기능 제공 (본인 글만 가능)
  - 수정 여부 및 **수정 시간 저장**

### 4. 댓글 상호작용
- 댓글 수정 기능 (본인 댓글만 가능)
  - 수정 여부 및 **수정 시간 저장**
- 댓글에 좋아요 가능

---

## 📄 피드 보기

- **팔로우한 사용자들의 글만** 시간순으로 표시
- 피드는 스크롤 방식으로 조회
- 각 게시글에는 아래 정보 포함:
  - 글 내용, 작성자 이름/프로필, 좋아요 수, 댓글 수
  - 수정 여부, 발행 일자(또는 수정 일자), 내 좋아요 여부

### 💬 댓글 리스트
- 댓글에 포함되는 정보:
  - 작성자 이름, 프로필
  - 댓글 내용, 좋아요 수
  - 수정 여부, 발행/수정 일자, 내 좋아요 여부
