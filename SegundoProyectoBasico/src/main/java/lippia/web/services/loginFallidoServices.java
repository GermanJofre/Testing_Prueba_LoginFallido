package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.loginFallidoConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class loginFallidoServices extends ActionManager {

    public static void mainpage(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void acceder(){
        click(loginFallidoConstants.ACCEDER);
    }

    public static void login(String text) {
        setInput(loginFallidoConstants.CORREO,text);
        click(loginFallidoConstants.SIGUIENTE);
    }

    public static void resultados(){
        waitPresence(loginFallidoConstants.RESULTADO);
        Assert.assertTrue(WebActionManager.getElement(loginFallidoConstants.RESULTADO).isDisplayed());
    }

}
