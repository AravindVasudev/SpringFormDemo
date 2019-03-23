package io.github.aravindvasudev.launch;

import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        Tomcat tomcat = new Tomcat();

        // Configuring PORT
        tomcat.setPort(Integer.valueOf(TomcatConstants.PORT));

        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", TomcatConstants.ABSOLUTE_WEBAPP_PATH);
        System.out.println("configuring app with basedir: " + TomcatConstants.ABSOLUTE_WEBAPP_PATH);

        // Declare an alternative location for your "WEB-INF/classes" dir
        // Servlet 3.0 annotation will work
        File additionWebInfClasses = new File(TomcatConstants.CLASSES_PATH);
        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources, TomcatConstants.DEFAULT_CLASSES_PATH,
                additionWebInfClasses.getAbsolutePath(), "/"));
        ctx.setResources(resources);

        tomcat.start();
        tomcat.getServer().await();
    }
}
