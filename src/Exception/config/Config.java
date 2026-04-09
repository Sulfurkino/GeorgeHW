package Exception.config;

public class Config {
    public void parseConfig(String path) throws ConfigException{
        if (path.contains(".txt")){
            throw new ConfigException("Формат файла .txt не поддерживется, смените тип файла и попробуйте снова.");
        }
    }
}
