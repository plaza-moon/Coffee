package machine;
import machine.CoffeeMachine;
import java.util.Scanner;
class CoffeeMachine {
        private static int money = 550;
        private static int water = 400;
        private static int milk = 540;
        private static int beans = 120;
        private static int disCups = 9;

        public static void main(String[] args)
        {
            for (; ;)
            {
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                Scanner scan = new Scanner(System.in);
                String action = scan.nextLine();
                System.out.println();

                if (action.equals("exit")) {System.exit(0);}
                else if (action.equals("buy")) {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                   // System.out.print(" ");

                    Scanner scan1 = new Scanner(System.in);
                    String enter = scan1.nextLine();
                    if (enter.equals("back")) {continue;}
                    int y = Integer.parseInt(enter);

                    switch (y) {
                        case 1:  // espresso
                            if (water >= 250 && beans >= 16 && disCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");

                                water = water - 250;
                                beans = beans - 16;
                                money = money + 4;
                                disCups = disCups - 1;
                            } else if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (disCups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;

                        case 2:  // latte
                            if (water >= 350 && milk >= 75 && beans >= 20 && disCups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!");

                                water = water - 350;
                                milk = milk - 75;
                                beans = beans - 20;
                                money = money + 7;
                                disCups = disCups - 1;
                            } else if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (disCups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;

                        case 3: // capucino
                            if (water >= 200 && milk >= 100 && beans >= 6 && disCups >= 1) {
                                System.out.print("I have enough resources, making you a coffee!");
                                water = water - 200;
                                milk = milk - 100;
                                beans = beans - 12;
                                money = money + 6;
                                disCups = disCups - 1;
                            } else if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beans < 6) {
                                System.out.println("Sorry, not enough beans!");
                            } else if (disCups < 1) {
                                System.out.println("Sorry, not enough cups!");
                            }
                            break;

                        default:
                            break;
                    }
                }
                else if (action.equals("fill")){
                    System.out.println("Write how many ml of water do you want to add: ");
                    water = water + scan.nextInt();
                    System.out.println();

                    System.out.println("Write how many ml of milk do you want to add: ");
                    milk = milk + scan.nextInt();
                    System.out.println();

                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    beans = beans + scan.nextInt();
                    System.out.println();

                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    disCups = disCups + scan.nextInt();
                    // System.out.println();
                }
                else if (action.equals("take")){
                    System.out.println("I gave you $" + money);
                    money = 0;
                    // System.out.println();
                }
                else if (action.equals("remaining")){
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(disCups + " of disposable cups");
                    System.out.println(money + " of money"); }
                System.out.println();
            } } }


