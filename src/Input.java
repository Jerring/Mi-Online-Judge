import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Input {

    public static void input(Class clazz) {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            Method method = clazz.getDeclaredMethod("solution", String.class);
            method.setAccessible(true);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String result = (String) method.invoke(null, line);
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file 'input.txt' does not exist!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
