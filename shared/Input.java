package shared;

import java.util.Scanner;

public class Input {
    private final Scanner sc = new Scanner(System.in);
    public int getInt(String message, int min, int max) {
        while (true) { // Infinite Loop
            try {
                System.out.print(message);
                String input = sc.nextLine().trim();
                if (!input.isEmpty()) {
                    int value = Integer.parseInt(input);
                    if (value > max || value < min) {
                        System.out.println("Out of Range. Please enter number from "+min+" to "+max);
                    } else {
                        return value;
                    }
                }
                System.out.println("Input cannot be empty");
            } catch(NumberFormatException e) {
                System.out.println("Type mismatch.");
            }
        }
    }

    public double getDouble(String message, double min, double max) {
        while (true) { // Infinite Loop
            try {
                System.out.print(message);
                String input = sc.nextLine().trim();
                if (!input.isEmpty()) {
                    double value = Double.parseDouble(input);
                    if (value > max || value < min) {
                        System.out.println("Out of Range. Please enter number from "+min+" to "+max);
                    } else {
                        return value;
                    }
                }
                System.out.println("Input cannot be empty");
            } catch(NumberFormatException e) {
                System.out.println("Type mismatch.");
            }
        }
    }

    public String getString (String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) return input;
            System.out.println("Input cannot be empty");
        }
    }

    public String getString (String message, String type) {
        String regex = "";
        switch (type) {
            case "Code" -> regex = "^[A-Z][0-9]{1,2}$";
            case "name" -> regex = "\\b([A-Z][a-z]+\\s*)+";
        }
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                if (input.matches(regex)) {
                    return input;
                } else {
                    System.out.println("Invalid input.");
                }
            }
            System.out.println("Input cannot be empty");
        }
    }

    public TaxPayer getTaxPayer() {
        TaxPayer taxPayer = new TaxPayer();
        String code = getString("Enter Code: ", "Code");
        String name = getString("Enter name", "name");
        double income = getDouble("Enter Income: ", 0, Double.MAX_VALUE);
        double deduction = getDouble("Enter deduction: ", 0, income);
        double tax = taxPayer.getTax();
        taxPayer.setCode(code);
        taxPayer.setName(name);
        taxPayer.setIncome(income);
        taxPayer.setDeduct(deduction);
        taxPayer.setTax(tax);
        return taxPayer;
    }
}
