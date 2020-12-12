package com.company.z3;

import javax.swing.*;

public class JLabelTest extends JLabel {
    public String command;
    public JLabelTest(String command) {
        this.command = command;
        if (command == "new") {
            neww();
        }
        else if (command == "open") {
            open();
        }
    }
    public JTextField neww() {
        JTextField bigField = new JTextField("Текст поля", 25);
        bigField.setToolTipText("Новый текстовый документ");
        return bigField;
    }
    public JTextField open() {
        JTextField bigField = new JTextField("Текст поля", 25);
        bigField.setToolTipText("Открытый текстовый документ");
        return bigField;
    }
}
