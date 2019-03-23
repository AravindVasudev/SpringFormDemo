package io.github.aravindvasudev.launch;

import java.io.File;

public class TomcatConstants {
    public static final String WEBAPP_PATH = "src/main/webapp/";
    public static final String ABSOLUTE_WEBAPP_PATH = new File(WEBAPP_PATH).getAbsolutePath();
    public static final int DEFAULT_PORT = 8080;
    public static final int PORT = (System.getenv("PORT") == null || System.getenv("PORT").isEmpty())
            ? DEFAULT_PORT : Integer.valueOf(System.getenv("PORT"));
}
