package io.github.aravindvasudev.launch;

import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(Integer.valueOf(TomcatConstants.PORT));
        tomcat.addWebapp("/", TomcatConstants.ABSOLUTE_WEBAPP_PATH);

        tomcat.start();
        tomcat.getServer().await();
    }
}
