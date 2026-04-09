package Exception.NumbersParser;

public class Parser {
    public void parseInt(String str) throws IllegalArgumentException, NumberFormatException{
        if (str == null){
            throw new IllegalArgumentException("нельзя использовать null.");
        }
        if (str == "" | str ==" "){
            throw new IllegalArgumentException("строка пустая.");
        }
        try {
            if (str.contains(".") | str.contains(",")){
                System.out.println("не знаю что тут писать(");
            }
        } catch (IllegalArgumentException e){
            throw new NumberFormatException("Только целые числа");
        }


    }
}
