package TestCases;

import Listener.Listener;
import TestCaseFunctions.SignUpFunc;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseTest;

@Listeners({Listener.class})
public class SignUpTest extends BaseTest {

    @Test
    public void signUp() {
        SignUpFunc signUpFunc = new SignUpFunc(driver);
        signUpFunc.signUp();
    }

}
