public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if (name != null &&
                name != "" &&
                name.length() >= 3 &&
                name.length() <= 19 &&
                name.startsWith(" ") == false &&
                name.endsWith(" ") == false &&
                checkNameOnSpecialCharacter(name) == true) {

            String nameNoSpase = name.replace(" ", "");

            if (name.length() == (nameNoSpase.length() + 1)) {

                return true;

            }

        }

        return false;

    }

    private boolean checkNameOnSpecialCharacter(String name) {
        String result = name.replaceAll("[^A-Za-zА-Яа-я- ]", "");

        if (name.length() == result.length()) {
            return true;
        }
        return false;
    }

}
