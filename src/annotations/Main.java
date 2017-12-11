package annotations;

import ejemploDesacople.Bd.dto.Alumno;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Alumno.class;
        //Class<?> clazz = String.class;
        System.out.println(clazz.toString());
        System.out.println("--------------------");
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
        System.out.println("-----------------------");
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("-------------------");
        Constructor<?>[] ctors = clazz.getConstructors();
        for (Constructor<?> c : ctors) {
            System.out.println(c);
        }
        System.out.println("------------------");
        try {
            Alumno l = (Alumno) ctors[1].newInstance("Test vieja","test","test",1234,8.0d);
            System.out.println(l.toString());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
