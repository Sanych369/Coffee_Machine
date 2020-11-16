package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Machine machine = new Machine();
        boolean stop = false;

        while (!stop) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String answer = scan.nextLine();
            System.out.println();

            switch (answer) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String choice = scan.nextLine();
                    if (choice.equals("back")) {
                        break;
                    } else {
                        machine.buy(choice);
                    }
                    break;
                case "fill":
                    machine.fill();
                    break;
                case "take":
                    machine.take();
                    break;
                case "exit":
                    stop = true;
                    break;
                case "remaining":
                    machine.display();
                    break;
            }
        }
    }
}