import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 类描述：
 *
 * @ClassName HelloClassLoader
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/3 20:50
 * @Version 1.0
 */
public class HelloClassLoader extends ClassLoader {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> hello = new HelloClassLoader().findClass("Hello");
        Method helloMethod = hello.getMethod("hello");
        helloMethod.invoke(hello.newInstance());
    }

    @Override
    protected Class<?> findClass(String name) {
        Path path = Paths.get("D:\\GeekCourse\\Geek\\Week01\\src\\Hello.xlass");
        byte[] b = new byte[0];
        try {
            b = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) (255 - b[i]);
        }
        return defineClass(name, b, 0, b.length);
    }
}