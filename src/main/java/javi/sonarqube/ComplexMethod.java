package javi.sonarqube;

import java.util.logging.*;

public class ComplexMethod {

    public String intToEnglishValue(int i) throws Exception {
        System.out.println("Hello...");
    	if (i == 1) {
            return "One";
        }
        if (i == 2) {
            return "Two";
        }
        if (i == 3) {
            return "Three";
        }
        if (i == 4) {
            return "Four";
        }
        if (i == 5) {
            return "Five";
        }
        if (i == 6) {
            return "Six";
        }
        if (i > 6) {
            throw new Exception();
        }
        return null;
    }

}