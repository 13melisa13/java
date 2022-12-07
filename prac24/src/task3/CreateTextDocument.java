package task3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument("undefine.txt", "");
    }

    @Override
    public IDocument createOpen(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        StringBuilder text = new StringBuilder();
        while (scanner.hasNextLine()) {
            text.append(scanner.nextLine()).append("\n");
        }
        return new TextDocument(file.getName(), text.toString());
    }
}
