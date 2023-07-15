
public class App {

  public static void main(String[] args) {

    int miles;
    int sleepiness;
    boolean accident;
    int days = 0;

    Person paul = new Person(0, 0, false);
    miles = paul.getMiles();
    sleepiness = paul.getSleepiness();
    accident = paul.isAccident();

    System.out.println();
    System.out.println("Welcome to the Virtual Bicycle Simulator");
    System.out.println("Try to bicycle as many miles around the USA");
    System.out.println("  in the fewest days without an accident");
    System.out.println("accident chance increases with sleepiness.");
    System.out.println("");

    while (accident == false) {
      System.out.println("Total Days = " + days + "   Total Miles = " + miles + "   Total Sleepiness = " + sleepiness);
      System.out.println();
      System.out.println("Select (1) to bicycle all day");
      System.out.println("Select (2) to bicycle half a day");
      System.out.println("Select (3) to sleep all day");
      System.out.println();
      int day;
      KeyboardInput num1 = new KeyboardInput();
      day = num1.getIntegerValue("");
      days = days + 1; // tick one day

      switch (day) {
        case 1:
          paul.driveAllDay();
          miles = paul.getMiles();
          sleepiness = paul.getSleepiness();
          accident = paul.isAccident();
          break;

        case 2:
          paul.driveHalfDay();
          miles = paul.getMiles();
          sleepiness = paul.getSleepiness();
          accident = paul.isAccident();
          break;

        case 3:
          paul.sleepAllDay();
          miles = paul.getMiles();
          sleepiness = paul.getSleepiness();
          accident = paul.isAccident();
          break;
      }
    }
    System.out.println();
    System.out.println("Total Days = " + days + "   Total Miles = " + miles + "   Total Sleepiness = " + sleepiness);
    System.out.println("");
    System.out.println("You were in an accident.");
    System.out.println();
  }

}
