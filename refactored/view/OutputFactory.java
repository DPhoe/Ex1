package refactored.view;

public abstract class OutputFactory implements DataOutputInterface{
    public static DataOutputInterface createOutput (String string) {
        return switch (string){
            case "Console" -> new ConsoleOutput();
            case "HTML" -> new HtmlOutput();
            case "TextFile" -> new TextFileOutput();
            default -> new ConsoleOutput();
        };
    }
}
