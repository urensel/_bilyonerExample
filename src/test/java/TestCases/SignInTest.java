package TestCases;

import Listener.Listener;
import TestCaseFunctions.SignInFunc;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseTest;

@Listeners({Listener.class})
public class SignInTest extends BaseTest {

    @Test
    public void signIn() {
        SignInFunc signInFunc = new SignInFunc(driver);
        signInFunc.signIn();
    }

}
