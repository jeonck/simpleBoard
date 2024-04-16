# simpleBoard
간단한 게시판 입니다. 

# 원격 저장소와 연동하여 동기화 
로컬 시스템에서 새로운 Git 저장소를 초기화하고, 원격 저장소와 연동하여 변경 사항을 관리하고 동기화하는 전체 과정을 설명

git init
 
git config --local user.name "설정할 username적기"
git branch -m main
git remote add origin <repo>
 
git pull origin main
git add .
git commit -m "Initial commit"
git push origin main
 
 
# 브랜치 명시 없이 pull 가능 즉, 간단히 "git pull" 명령 실행 가능
git branch --set-upstream-to=origin/main main
