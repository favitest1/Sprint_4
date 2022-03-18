public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        /*
        Вопрос к куратору - надо ли проверять строку на null и вхождение в строку цифр или состоящую из одних цифр?
         */

        if (name != null) {

            if (name.length() >= 3 && name.length() <= 19) {

                if (!name.startsWith(" ")) {

                    if (!name.endsWith(" ")) {

                        String nameNoSpase = name.replace(" ", "");

                        if (name.length() == (nameNoSpase.length() + 1)) {

                            return true;

                        }

                    }

                }

            }

        }

        return false;

    }

}
