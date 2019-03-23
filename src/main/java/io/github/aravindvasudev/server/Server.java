package io.github.aravindvasudev.server;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Server {
    public static final String WEBAPP_PATH = "src/main/webapp/";
    public static final String ABSOLUTE_WEBAPP_PATH = new File(WEBAPP_PATH).getAbsolutePath();
    public static final int DEFAULT_PORT = 8080;
    public static final int PORT = (System.getenv("PORT") == null || System.getenv("PORT").isEmpty())
            ? DEFAULT_PORT : Integer.valueOf(System.getenv("PORT"));

    private Tomcat tomcat;

    public Server() {
        tomcat = new Tomcat();

        tomcat.setPort(Integer.valueOf(PORT));
        tomcat.addWebapp("/", ABSOLUTE_WEBAPP_PATH);
    }

    public void start() throws LifecycleException {
        tomcat.start();
        tomcat.getServer().await();
    }

    public static void main(String[] args) throws Exception {
        new Server().start();
    }
}
