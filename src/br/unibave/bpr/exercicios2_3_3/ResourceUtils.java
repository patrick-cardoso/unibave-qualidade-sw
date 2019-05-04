package br.unibave.bpr.exercicios2_3_3;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;

public final class ResourceUtils {

    public static URL getResourceAsURL(String name) {
        return getContextClassLoader().getResource(name);
    }

    public static String getResourceAsString(String name) {
        URL resource = getResourceAsURL(name);
        return Objects.isNull(resource) ? null : resource.getPath();
    }

    public static File getResourceAsFile(String name) {
        String resource = getResourceAsString(name);
        return Objects.isNull(resource) ? null : new File(resource);
    }

    public static InputStream getResourceAsStream(String name) {
        return getContextClassLoader().getResourceAsStream(name);
    }

    private static ClassLoader getContextClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }
}
