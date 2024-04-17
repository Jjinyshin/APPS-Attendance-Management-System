# APPS AMS project 🔴🟡🟢
- Spring Boot와 Flutter를 사용해서 개발중인 동아리 출결관리 시스템
## 🔷 Project Convention
- 작업 방식: Issue 등록 → 브랜치 생성 후 개발 → 커밋 푸시, 개발 완료시 PR → 코드리뷰 이후 merge → Issue 자동 close
### ☑ Git Commit
- 커밋 메시지 구성: `커밋 유형: 메시지제목 (#이슈번호)`
- 커밋 유형
  - Feat: A new feature, 새로운 기능을 추가할 경우
  - Fix: A bug fix, 버그를 고친 경우
  - Docs: Changes to documentation
  - Design: CSS등 사용자 UI 디자인 변경
  - Style: Formatting, missing semi colons, etc; no code change
  - Refactor: Refactoring production code, 새로운 기능이나 버그 수정 없이 현재 코드를 개선한 경우
  - Remove: 사용하지 않는 파일 or 폴더를 삭제하는 경우
  - Rename: 파일 혹은 폴더명을 수정하는 경우
  - Test: Adding tests, refactoring test; no production code change
  - Chore: Updating build tasks, package manager configs, etc; no production code change, package.json의 변경이나 dotenv의 요소 변경 등
### ☑ Git Workflow
- main → develop → feature/이슈번호-기능, fix/이슈번호-기능, refactor/이슈번호-기능
- ex) `feature/#2-board`

### ☑ GitHub Milestones
- 프로젝트 단계별 목표를 명확하게 하기 위해 마일스톤 등록
- GitHub 이슈 등록 시 관련된 마일스톤 선택

### ☑ GitHub Issues & PR
- 공통
    - Issue 제목 & PR 제목은 동일한 내용, PR 제목 뒤에는 () 안에 Issue 번호 표시하기
        - ex) `로그인 기능 개발 (#12)`
    - Assignees, Label, Project, Milestone 설정
- Issue
    - 작업 하나당 반드시 이슈 등록 후 작업 진행
- 이슈 해결 후 Pull Request 생성
    - 컨벤션 통일을 위해 PR 템플릿 사용
    - 팀원 1명 이상의 승인을 받아야 머지 가능

### ☑ GitHub Projects
- 이슈 진행 상황(Todo, In progress, Done)을 한 눈에 볼 수 있도록 칸반 보드 형태로 시각화
