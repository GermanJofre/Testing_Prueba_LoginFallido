package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.ProyectoBasicoConstants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.security.Key;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ProyectoBasicoServices extends ActionManager {

    public static void navegadorWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void busqueda(String text) {
        setInput(ProyectoBasicoConstants.BUSQUEDA, text + Keys.ENTER);
    }

    //public static void click() {
        //click(ProyectoBasicoConstants.CLICK_BOTON);
    //}

    public static void resultados(String juego){
        String nueva = juego + "123";
        //waitPresence(ProyectoBasicoConstants.RESULTADO);
        Assert.assertEquals(WebActionManager.getElement(ProyectoBasicoConstants.RESULTADO).getAttribute("value"),(juego));
    }

}
