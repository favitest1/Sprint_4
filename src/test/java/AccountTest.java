import org.junit.Test;
import org.junit.runner.RunWith;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import io.qameta.allure.junit4.DisplayName;
import org.junit.runners.Parameterized;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private String name;
    private boolean expectedResult;

    public AccountTest(String name, boolean result) {
        this.name = name;
        this.expectedResult = result;
    }


    @Parameterized.Parameters
    public static Object[][] getTextData() {

        return new Object[][] {
                {"Тимоти Шаламе", true},
                {"Т Ш", true},
                {"Тимоти Шаламемемеме", true},
                {"Тимоти Шаламем-меме", true},
                {"Timoti Shalamem", true},
                {"Тимоти Шаламемемемее", false},
                {"ТимотейШевроле", false},
                {"ТимотейШевроле ", false},
                {" ТимотейШевроле", false},
                {"Тимотей  Шевроле", false},
                {"Тимотей (Шевроле", false},
                {"Тимотей 1Шевроле", false},
                {"Т", false},
                {"Т ", false},
                {"Т  ", false},
                {"   ", false},
                {"", false},
                {"ТимотейТимотей ШевролеШевроле", false},
                {null, false},
        };
    }

    @Test
    @DisplayName("Проверка имени пользователя на карте") // имя теста
    @Description("Проверяет следующие параметры: не null, в строке не меньше 3 и не больше 19 символов, в строке есть только один пробел, пробел стоит не в начале и не в конце строки.")
    @TmsLink("TestCase-112") // ссылка на тест-кейс
    @Issue("BUG-985") // ссылка на баг-репорт
    public void checkNameToEmbossTest () {

        Account account = new Account(name);

        boolean actualResult = account.checkNameToEmboss();

        assertEquals(expectedResult, actualResult);
    }


}
