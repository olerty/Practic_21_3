package com.company.z3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuTest extends JFrame{
    IDocument iDocument;
    ICreateDocument iCreateDocument;
    public JMenuTest(ICreateDocument iCreateDocument)
    {
        super("Системное меню");
        this.iCreateDocument = iCreateDocument;
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(300, 200);
        setVisible(true);
    }

    private JMenu createFileMenu()
    {
        JMenu file = new JMenu("File");
        JMenuItem neww = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(neww);
        file.addSeparator();
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);

        neww.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                iDocument = iCreateDocument.createNew();
                file.add(iDocument.neww());
            }
        });
        open.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                iDocument = iCreateDocument.createOpen();
                file.add(iDocument.open());
            }
        });
        return file;
    }
}
