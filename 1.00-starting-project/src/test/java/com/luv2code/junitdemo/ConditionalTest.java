package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

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
}
