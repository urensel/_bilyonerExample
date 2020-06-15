package TestCases;

import Listener.Listener;
import TestCaseFunctions.ForgotPasswordFunc;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseTest;

@Listeners({Listener.class})
public class ForgotPasswordTest extends BaseTest {

    @Test
    public void forgotPassword() {
        ForgotPasswordFunc forgotPasswordFunc = new ForgotPasswordFunc(driver);
        forgotPasswordFunc.forgotPassword();
    }
}
