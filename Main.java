package encryptdecrypt;


public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        parseArgs(args, config);

        EncoderDecoder encoder = new EncoderDecoder(config);
        encoder.encodeData();
    }


    private static void parseArgs(String[] args, Config config) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    config.setMode(args[i + 1]);
                    break;
                case "-key":
                    config.setKey(Integer.parseInt(args[i +  1]));
                    break;
                case "-data":
                    config.setData(args[i + 1]);
                    break;
                case "-in":
                    config.setFileIn(args[i + 1]);
                    break;
                case "-out":
                    config.setFileOut(args[i + 1]);
                case "-alg":
                    config.setAlg(args[i + 1]);
            }
        }
    }
}