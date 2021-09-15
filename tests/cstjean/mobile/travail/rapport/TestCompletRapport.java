package cstjean.mobile.travail.rapport;

import junit.framework.TestSuite;

public class TestCompletRapport {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestRapportCours.class);
        return suite;
    }


}