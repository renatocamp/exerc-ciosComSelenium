package hover;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HoverTest extends BaseTests {

    @Test
    @DisplayName("Teste com elemento Hover Selenium")
    public void testHoverUser1(){
        var hoversPage = homePage.clickHoverPage();
        var caption = hoversPage.hoverOverFigure(1);
        Assertions.assertTrue(caption.isCaptionDisplayed(),"Caption não encontrado");
        Assertions.assertEquals(caption.getTitle(),"nome: user1", "Caption title incorreto");
        Assertions.assertEquals(caption.getLinkText(),"View profile", "Caption linkText incorreto");
        Assertions.assertEquals(caption.getLink().endsWith("/users1"), "link incorreto!");
    }
}
