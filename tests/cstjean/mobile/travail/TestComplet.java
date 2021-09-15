package cstjean.mobile.travail;

import cstjean.mobile.travail.rapport.TestCompletRapport;
import junit.framework.TestSuite;

public class TestComplet {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestTravail.class);
        suite.addTestSuite(TestCoursSession.class);
        suite.addTest(TestCompletRapport.suite());
        return suite;
    }
}
