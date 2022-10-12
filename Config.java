package encryptdecrypt;

public class Config {
    private String mode;
    private int key;
    private String data;
    private String fileOut;
    private String fileIn;
    private String alg;

    public Config() {
        this.key = 0;
        this.mode = "enc";
        this.data = "";
        this.fileOut = "";
        this.fileIn = "";
        this.alg = "shift";
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFileOut() {
        return fileOut;
    }

    public void setFileOut(String fileOut) {
        this.fileOut = fileOut;
    }

    public String getFileIn() {
        return fileIn;
    }

    public void setFileIn(String fileIn) {
        this.fileIn = fileIn;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }
}
