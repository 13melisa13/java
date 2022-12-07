package task3;

import task3.IDocument;

import java.io.FileNotFoundException;

public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen(String path) throws FileNotFoundException;
}
