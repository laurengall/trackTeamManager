import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Person> people = new ArrayList<Person>();
    boolean running = true;
    System.out.println("Track Team Management Console.");
    System.out.println("Input a menu number to begin.");
    while (running) {
      System.out.println("1. Team Overview");
      System.out.println("2. Manage Athletes");
      System.out.println("3. Manage Coaches");
      System.out.println("4. Exit");
      int cmd = input.nextInt();
      switch (cmd) {
        case 1:
          System.out.println("Currently under development.");
          break;
        case 2:
          System.out.println("1. Add Athlete");
          System.out.println("2. Edit Athlete");
          System.out.println("3. Delete Athlete");
          break;
        case 3:
          System.out.println("1. Add Coach");
          System.out.println("2. Edit Coach");
          System.out.println("3. Delete Coach");
          break;
        case 4:
          System.out.println("Have a nice day.");
          System.exit(0);
          break;
        default:
          break;
      }
    }
  }

  public static void addAthlete() {

  }
}