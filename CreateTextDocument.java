package com.company.z3;

import javax.swing.*;

public class CreateTextDocument implements ICreateDocument {

    @Override
    public TextDocument createNew() {
        System.out.println("Создан новый документ");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        JLabelTest jLabelTest = new JLabelTest("open");
        System.out.println("Открыт новый документ");
        return new TextDocument();
    }
}
