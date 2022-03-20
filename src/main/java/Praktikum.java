public class Praktikum {

    private static String name = "Тимоти Шаламе";

    public static void main(String[] args) {

        Account account = new Account(name);

        if (account.checkNameToEmboss()) {
            System.out.println("Можно использовать фамилию и имя для печати на банковской карте.");
        } else {
            System.out.println("Нельзя использовать фамилию и имя для печати на банковской карте!");
        }

    }
}
