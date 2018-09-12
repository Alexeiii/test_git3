package ui.steps.login.defLoger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLoger {

    protected static Logger Log = LogManager.getLogger();

    public static void startTestcase(String testCase) {
        Log.info("**************");
        Log.info(String.format("TEST CASE $S STARTRD,"));
        Log.info("****************");


    }

}
