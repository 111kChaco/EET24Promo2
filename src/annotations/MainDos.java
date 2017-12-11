package annotations;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MainDos {
    public static void main(String[] args) {
        Class<Modelito> clazz = Modelito.class;

        for (Field f : clazz.getDeclaredFields()) {
            for (Annotation a : f.getAnnotations()) {
                System.out.println(a);
            }
            System.out.println(f);
        }
    }
}
