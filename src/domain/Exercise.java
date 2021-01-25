package domain;
/**
 * @see TestResult
 * @author alexa
 */
public class Exercise {
/**
 * Шифратор - шифрує текст
 * @param text заданий текст
 * @param keyWord ключ
 * @return resultat
 */
public static byte[] Encrypt(String text, String keyWord)
{
    byte[] arr = text.getBytes();
    byte[] key_arr = keyWord.getBytes();
    byte[] resultat = new byte[arr.length];
    for(int i = 0; i< arr.length; i++)
    {
        resultat[i] = (byte) (arr[i] ^ key_arr[i % key_arr.length]);
    }
    return resultat;
}
}
