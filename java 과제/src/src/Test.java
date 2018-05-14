public class Test {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("B-001");
        deposit(ba1, 1000); // 1000원 입금
        deposit(ba1, 500); // 500원 입금
        withdraw(ba1, 700); // 700원 인출

        BankAccount ba2 = new BankAccount("B-002");
        transferTo(ba1, ba2, 300); // ba1계좌에서 ba2계좌로 300원 이체

        System.out.println(toString(ba1));
        System.out.println(toString(ba2));
    }

    private static void deposit(BankAccount ba, int money) {
        ba.money = ba.money + money;
        ba.point = ba.point + (double) money / 100.0;
    }

    private static void withdraw(BankAccount ba, int money) {
        ba.money = ba.money - money;
    }

    private static void transferTo(BankAccount ba1, BankAccount ba2, int money) {
        withdraw(ba1, money);
        deposit(ba2, money);
    }

    private static String toString(BankAccount ba) {
        return ba.number + "의 계좌에" + ba.money + "의 금액이 남아있고, 포인트는" + ba.point + "입니다.";
    }
}