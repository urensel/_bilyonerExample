package TestCases;

import Listener.Listener;
import TestCaseFunctions.SelectMatchFunc;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BaseTest;

@Listeners({Listener.class})
public class SelectMatchTest extends BaseTest {

    @Test
    public void selectMatch() throws InterruptedException {
        SelectMatchFunc selectMatchFunc = new SelectMatchFunc(driver);
        selectMatchFunc.selectMatch();
    }
}
