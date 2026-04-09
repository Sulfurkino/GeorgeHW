package Exception.config;

public class confMain {
    public static void main(String[] args) {
        String file = "file.txt";
        Config config = new Config();

        config.parseConfig(file);
    }
}
