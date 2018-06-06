package xyz.sethy.despacito2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            String url = "https://www.youtube.com/watch?v=kJQP7kiw5Fk";

            Runtime runtime = Runtime.getRuntime();
            runtime.exec("xdg-open " + url);
        }
    }
}
