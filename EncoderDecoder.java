package encryptdecrypt;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


public class EncoderDecoder {

    private final Config config;
    private Algorithm algorithm;

    public EncoderDecoder(Config config) {
        this.config = config;
        encodeAlgorithm();
    }

    private void encodeAlgorithm() {
        if (config.getAlg().equals("unicode")) {
            algorithm = new UnicodeAlgorithm();
        } else {
            algorithm = new ShiftAlgorithm();
        }

        if (config.getMode().equals("dec")) {
            config.setKey(-config.getKey());
        }
    }

    public void encodeData() {
        String result = config.getData();

        if (!config.getData().equals("")) {
            result = algorithm.encrypt(config.getData(), config.getKey());

        } else {

            try {
                config.setData(new String(Files.readAllBytes(Paths.get(config.getFileIn()))));
                result = algorithm.encrypt(config.getData(), config.getKey());

            } catch (Exception e) {

                e.printStackTrace();
                System.out.println("Error");
                System.exit(1);
            }
        }

        if (!config.getFileOut().equals("")) {

            try (PrintWriter printWriter = new PrintWriter(config.getFileOut())) {

                printWriter.print(result);

            } catch (IOException e) {

                System.out.println("Error");
                System.exit(1);
            }

        } else {
            show(result);
        }
    }

    public void show(String letter) {
        System.out.println(letter);
    }
}