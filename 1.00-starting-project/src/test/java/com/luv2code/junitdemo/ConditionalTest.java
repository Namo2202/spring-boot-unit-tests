package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't run until JIRA #123 is resolvec")
    void basicTest() {

    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {

    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    void testForLinuxAndWindowsOnly() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyJava17() {

    }

    @Test
    @EnabledOnJre(JRE.JAVA_21)
    void testForOnlyJava21() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13, max=JRE.JAVA_17)
    void testOnlyForJavaRange() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_21, max=JRE.JAVA_23)
    void testOnlyForJavaRange2() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testOnlyForJavaRangeMin() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_23)
    void testOnlyForJavaRangeMax() {

    }
}
