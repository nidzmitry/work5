import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TestClass {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1980x1080" ;
    }
    @Test
    void openPage(){
        open("https://github.com/");
        $(Selectors.byTagAndText("button", "Solutions")).hover();
        $(byText("Enterprise")).click();
        $(byText("GitHub for enterprises")).shouldBe(visible);
        sleep(5000);
    }
}
