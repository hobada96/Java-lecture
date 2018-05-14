public class User {
    String id;
    String name;
    private String password;
    public User(String id, String name, String password) throws Exception {
        if(password.length()<6){
            throw new Exception("객체 생성 오류: 패스워드는 길이 6이상이어야 합니다."); // 이 문장은 아래 두 문장과 같음.
// Exception exception=new Exception("객체 생성 오류: 패스워드는 길이 6이상이어야 합니다.");
// throw exception;
        }
        this.id=id;
        this.name=name;
        this.password=password;
    }
    @Override
    public String toString() {
        return id+","+name;
    }
}
