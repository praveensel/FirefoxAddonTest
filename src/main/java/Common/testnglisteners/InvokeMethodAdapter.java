package Common.testnglisteners;

/**
 * Created by praveen on 2/18/2015.
 */


import Common.core.Assertion;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import java.util.List;


public class InvokeMethodAdapter implements IInvokedMethodListener {

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult result) {
        //Reporter.setCurrentTestResult(result);
        if (method.isTestMethod()) {
            List verificationFailures = Assertion.getVerificationFailures(result);
            //if there are verification failures...
            if (verificationFailures.size() > 0) {
                //set the test to failed
                result.setStatus(ITestResult.FAILURE);
                for (Object failure : verificationFailures) {
                    result.setThrowable((Throwable) failure);
                }
            }
        }
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        // TODO Auto-generated method stub

    }
}
