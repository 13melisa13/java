package task03;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.text.DefaultEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Arrays;

public class Menu extends JFrame {

    Menu(){
        String path = new File("").getAbsolutePath();
        File fileWithText = new File(path + "src\\task04\\file.txt");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem save = new JMenuItem();
        save.setText("Save");
        save.setMnemonic(KeyEvent.VK_S);
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));
        file.add(save);
        file.add(exit);
        menu.add(file);
        JMenu edit = new JMenu("Edit");
        JMenuItem copy = new JMenuItem(new DefaultEditorKit.CopyAction());
        copy.setText("Copy");
        copy.setMnemonic(KeyEvent.VK_COPY);
        JMenuItem paste = new JMenuItem(new DefaultEditorKit.PasteAction());
        paste.setText("Paste");
        paste.setMnemonic(KeyEvent.VK_PASTE);
        JMenuItem cut = new JMenuItem(new DefaultEditorKit.CutAction());
        cut.setText("Cut");
        cut.setMnemonic(KeyEvent.VK_T);
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        menu.add(edit);
        JMenu help = new JMenu();
        help.setText("Help");
        menu.add(help);
        help.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                JOptionPane.showMessageDialog(Menu.this,
                        "Help help help","Help", JOptionPane.INFORMATION_MESSAGE);
            }
            @Override
            public void menuDeselected(MenuEvent e) {
            }
            @Override
            public void menuCanceled(MenuEvent e) {
                System.out.println("menuCanceled");

            }
        });
        setJMenuBar(menu);
        JPanel buttonPanel = new JPanel(new GridLayout(1,2,10,10));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        button1.setPreferredSize(new Dimension(30,10));
        button2.setPreferredSize(new Dimension(30,10));
        buttonPanel.setPreferredSize(new Dimension(200, 50));
        JPanel textPanel = new JPanel();
        JTextArea textArea = new JTextArea(2,10);
        textArea.setText(openFile(fileWithText));
        save.addActionListener(e -> saveFile(textArea.getText(),fileWithText));
        textPanel.add(textArea);
        textPanel.setPreferredSize(new Dimension(200,200));
        add(buttonPanel,"North");
        add(textArea);
        pack();
        setVisible(true);
    }

    void saveFile(String text, File file){
        try {
            FileOutputStream output = new FileOutputStream(file);
            byte[] textByte = text.getBytes();
            output.write(textByte);
        } catch (Exception e){
            JOptionPane.showMessageDialog(Menu.this,
                    "Error save","File", JOptionPane.ERROR_MESSAGE);
        }
    }
    String openFile(File file){
        try {
            FileInputStream input = new FileInputStream(file);
            byte[] text = input.readAllBytes();
            return new String(text);

        } catch (Exception e){
           JOptionPane.showMessageDialog(Menu.this,
                    "Error open","File", JOptionPane.ERROR_MESSAGE);
           return "";
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}
