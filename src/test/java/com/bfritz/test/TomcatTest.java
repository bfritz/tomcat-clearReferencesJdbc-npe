package com.bfritz.test;

import org.apache.catalina.startup.Tomcat;

import org.junit.Test;

public class TomcatTest {

    @Test
    public void npeOnShutdown() throws Exception {
        final Tomcat tomcat = new Tomcat();
        tomcat.start();
        tomcat.addContext("", getClass().getResource("/").getPath());
        tomcat.stop();
    }
}
