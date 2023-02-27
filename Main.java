import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String promptChoice = "Y";
    System.out.println("What is the address of the stable?");
    String address = input.nextLine();
    Stable stable = new Stable(address);
    System.out.println("Do you wish to add a horse to the stable?");
    promptChoice = input.nextLine().toUpperCase();
    while(promptChoice.equals("Y")) {
    System.out.println("What is the name of the horse?");
    String name = input.nextLine();
    System.out.println("What is the weight of the horse?");
    int weight = input.nextInt();
  System.out.println("Enter true if the horse is tame and false if it is not.");
      boolean tame = input.nextBoolean();
      input.nextLine();
      Horse horse = new Horse(name, weight, tame);
      stable.addHorse(horse);
      System.out.println("Do you wish to add a horse to the stable?");
      promptChoice = input.nextLine().toUpperCase();
    }
    for (int i = 0; i < stable.stableSize(); i++) {
      Horse currentHorse = stable.getHorse(i);
      String name = currentHorse.getName();
      int weight = currentHorse.getWeight();
      boolean tame = currentHorse.getTame();

      System.out.printf("Horse #%d Name: %s Weight: %d.0 Tame: %b\n", i+1, name, weight, tame);
    }
  }
}
