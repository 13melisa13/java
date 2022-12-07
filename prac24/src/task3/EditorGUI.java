package task3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class EditorGUI extends JFrame {
    File currentFile;
    TextDocument document;
    CreateTextDocument create = new CreateTextDocument();
    JTextArea textArea = new JTextArea(2,10);
    EditorGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        JFileChooser fileChooser = new JFileChooser();
        JMenuBar menu = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem newF = new JMenuItem("New");
        newF.addActionListener(e -> {
            handleDocument(true);
        });
        file.add(newF);

        JMenuItem open = new JMenuItem("Open");

        open.addActionListener(e -> {
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                currentFile = fileChooser.getSelectedFile();
                handleDocument(false);
            }
        });
        file.add(open);

        JMenuItem save = new JMenuItem();
        save.setText("Save");
        save.setMnemonic(KeyEvent.VK_S);
        save.addActionListener(e -> {
            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                currentFile = fileChooser.getSelectedFile();
                try {
                    FileOutputStream output = new FileOutputStream(currentFile);
                    byte[] textByte = getData().getBytes();
                    output.write(textByte);
                    this.setTitle(document.getDocumentName());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Файл не сохранен",
                            "Ошибка сохранения файла",JOptionPane.ERROR_MESSAGE );
                }
            }
        });
        file.add(save);

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));
        file.add(exit);

        menu.add(file);
        setJMenuBar(menu);

        JPanel textPanel = new JPanel();

        textPanel.add(textArea);
        textPanel.setPreferredSize(new Dimension(200,200));
        add(textPanel);
        pack();
        setVisible(true);

    }
    private String getData() {
        return textArea.getText();
    }

    private  void handleDocument(boolean isNew) {
        if (isNew) {
            TextDocument document = (TextDocument) create.createNew();
            textArea.setText("");
            this.setTitle(document.getDocumentName());
        } else {
            try {
                document = (TextDocument) create.createOpen(currentFile.getAbsolutePath());
                textArea.setText((String) document.getDocumentData());
                this.setTitle(document.getDocumentName());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Файл не открыт",
                        "Ошибка открытия файла",JOptionPane.ERROR_MESSAGE );
            }
        }
    }

    public static void main(String[] args) {
        new EditorGUI();
    }

}
