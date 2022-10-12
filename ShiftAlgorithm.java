package encryptdecrypt;

public class ShiftAlgorithm implements Algorithm {
    @Override
    public String encrypt(String encodeMessage, int key) {

        char[] arrOfMessage = encodeMessage.toCharArray();

        for (int i = 0; i < arrOfMessage.length; i++) {
            if (Character.isAlphabetic(arrOfMessage[i]) || Character.isDigit(arrOfMessage[i])) {

                if (Character.isUpperCase(arrOfMessage[i])) {
                    arrOfMessage[i] += key;
                    if (arrOfMessage[i] > 90) {
                        arrOfMessage[i] -= 26;
                    } else if (arrOfMessage[i] < 65) {
                        arrOfMessage[i] += 26;
                    }
                } else if (Character.isLowerCase(arrOfMessage[i])) {
                    arrOfMessage[i] += key;
                    if (arrOfMessage[i] > 122) {
                        arrOfMessage[i] -= 26;
                    } else if (arrOfMessage[i] < 97) {
                        arrOfMessage[i] += 26;
                    }
                } else if (Character.isDigit(arrOfMessage[i])) {
                    arrOfMessage[i] += key;
                    if (arrOfMessage[i] > 57) {
                        arrOfMessage[i] -= 10;
                    } else if (arrOfMessage[i] < 48) {
                        arrOfMessage[i] += 10;
                    }
                }
            }
        }
        return String.valueOf(arrOfMessage);
    }
}
