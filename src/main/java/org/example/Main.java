package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello World!\nThis is first review java project in over a year!\n");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("The result of i is now: " + i);
            ;

    }

        String example_1 = "10";
        int firstNum = Integer.parseInt(example_1);

        System.out.println("\n" + example_1);
        System.out.println((2 * firstNum));


        // Solving an equation

        System.out.println("\n\nIn this section, I will be solving an equation ( (a+b)^2 = a^2 + 2ab + b^2 )");
        int a = 25;
        float b = 45.159f;
        double value = a*a + 2*(a*b) + b*b;

        System.out.println(value);
        System.out.println((float)value); //I made this value into a float
        System.out.println((int)value); //I made this value into a float

        /* Instead of adding a (type), change it from the creation of the variable to save space */

    }
}