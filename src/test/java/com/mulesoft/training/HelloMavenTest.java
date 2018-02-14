package com.mulesoft.training;


import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    // mavenFlow returns Hello Maven
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }
    
    // run maven-config.xml when testing
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}