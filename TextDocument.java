package com.company.z3;

import javax.swing.*;

public class TextDocument implements IDocument {

    @Override
    public JComponent neww() {
        JLabelTest jLabelTest = new JLabelTest("new");
        JTextField jTextField;
        jTextField = jLabelTest.neww();
        return jTextField;
    }

    @Override
    public JComponent open() {
        JLabelTest jLabelTest = new JLabelTest("open");
        JTextField jTextField;
        jTextField = jLabelTest.neww();
        return jTextField;
    }

    @Override
    public void save() {

    }

    @Override
    public void exit() {

    }
}
