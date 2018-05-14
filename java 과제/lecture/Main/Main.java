public class Main {
    public static void main(String[] args) {
        try {
            User user = new User("gdhong", "홍길동", "gdhong0525!"); // 이 생성자 함수는 익셉션을 던지도록 선언되었으므로 try절로 감싸야 함.
            System.out.println(user);
        } catch (Exception e) { // 앞 try 절에서 익셉션이 발생하는 경우 이 catch { … } 절 내의 문장들이 실행됨.
            System.out.println(e.getMessage());
        }
        try {
            User user = new User("cskim", "김철수", "1234"); // 이 생성자 함수는 익셉션을 던지도록 선언되었으므로 try절로 감싸야 함.
            System.out.println(user);
        } catch (Exception e) { // 앞 try 절에서 익셉션이 발생하는 경우 이 catch { … } 절 내의 문장들이 실행됨.
            System.out.println(e.getMessage());
        }
    }
}