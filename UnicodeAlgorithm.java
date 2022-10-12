package encryptdecrypt;

public class UnicodeAlgorithm implements Algorithm {
    @Override
    public String encrypt(String encodeMessage, int key) {

        char[] arrOfMessage = encodeMessage.toCharArray();
        for (int i = 0; i < arrOfMessage.length; i++) {
            arrOfMessage[i] += key;
        }

        return String.valueOf(arrOfMessage);
    }
}
