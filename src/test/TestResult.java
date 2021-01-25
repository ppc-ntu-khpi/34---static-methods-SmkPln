package test;
import domain.Exercise;
/**
 * 
 * @author alexa
 */
public class TestResult {
/**
 * Тут можна задати текст в строкі String mesage =" *** ";
 * @param args аргументи
 */
    public static void main(String[] args) {
        String mesage = "Майнкрафт найкраща гра";
    System.out.println(mesage+" :");
    byte[] m = Exercise.Encrypt(mesage, "stack_overlow");
    for (byte i : m) System.out.print(i);
    System.out.println();
    }
}
