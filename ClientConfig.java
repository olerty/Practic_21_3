package com.company.z3;

import java.util.Scanner;

public class ClientConfig {
    public void configClient() {
        Scanner scan = new Scanner(System.in);
        ICreateDocument iCreateDocument= null;
        System.out.println("Тип документа:");
        String name = scan.nextLine();
        switch (name) {
            case "text":
                iCreateDocument = new CreateTextDocument();
                break;
            default:
                break;
        }
        try {
            new JMenuTest(iCreateDocument);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
