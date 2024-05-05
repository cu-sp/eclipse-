package assignment_7;

/**
 * A virtual moped, roaming the streets of New York.
 * The signatures of a few methods are given and MUST be completed and used as
 * indicated.
 * Create as many additional properties or methods as you want, as long as the
 * given methods behave as indicated in the instructions.
 * Follow good object-oriented design, especially the principles of abstraction
 * (i.e., the black box metaphor)
 * and encapsulation (i.e., methods and properties belonging to specific
 * objects), as we have learned them.
 *
 * The rest is up to you.
 */
public class Moped {
  private String orientation;
  private int street;
  private int avenue;
  private double gas;
  private boolean backwards = false;

  public Moped() {
    this.orientation = "South";
    this.street = 10;
    this.avenue = 5;
    this.gas = 1.0;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  public String getOrientation() {
    return orientation;
  }

  public int getStreet() {
    return street;
  }

  public int getAvenue() {
    return avenue;
  }

  public boolean getBackwards() {
    return backwards;
  }

  public double getGasLevel() {
    return gas;
  }

  public void setGas(double gas) {
    this.gas = gas;
  }

  public void setBackwards(boolean value) {
    backwards = value;
  }

  public void setLocation(int[] location) {
    street = location[0];
    avenue = location[1];
  }

  public int[] getLocation() {
    return new int[] { street, avenue };
  }

  public void printLocation() {
    System.out.println("Now at " + getStreet() + getSuffix(getStreet()) + " St. and " + getAvenue()
        + getSuffix(getAvenue()) + " Ave, facing " + getOrientation() + ".");
    handleAdvertising();
  }

  private String getSuffix(int num) {
    if (num >= 11 && num <= 13) {
      return "th";
    } else {
      switch (num % 10) {
        case 1:
          return "st";
        case 2:
          return "nd";
        case 3:
          return "rd";
        default:
          return "th";
      }
    }
  }

  public String orientationLogic(String current, String leftOrRight) {
    if (getBackwards() && leftOrRight.equals("Left")) { // changing orientation logic if the moped is going backwards
      leftOrRight = "Right";
    } else if (backwards && leftOrRight.equals("Right")) {
      leftOrRight = "Left";
    }

    if (leftOrRight.equals("Left")) {
      switch (current) {
        case ("North"):
          return ("West");
        case ("East"):
          return ("North");
        case ("West"):
          return ("South");
        case ("South"):
          return ("East");
        default:
          return "ur orientation var is not north east south or west";
      }
    } else if (leftOrRight.equals("Right")) {
      switch (current) {
        case ("North"):
          return ("East");
        case ("East"):
          return ("South");
        case ("West"):
          return ("North");
        case ("South"):
          return ("West");
        default:
          return "ur orientation var is not north east south or west";
      }
    } else {
      return "orientation input wrong for orientationLogic class";
    }
  }

  public void correctiveMovement(String orientation) { // movement that handles gas, boundaries and backwards
    if (getBackwards() == false) {// moped moving forwards
      if ((getStreet() > 1) && (orientation.equals("South"))) { // checks for boundary
        // street--; before, not black box :(
        setLocation(new int[] { getStreet() - 1, getAvenue() }); // After! So black box! This changes the street using the setLocation method
        setGas(getGasLevel() - 0.05); // sets gas level using encapuslation!
      } else if ((getStreet() < 200) && (orientation.equals("North"))) {
        setLocation(new int[] { getStreet() + 1, getAvenue() });
        setGas(getGasLevel() - 0.05); // sets gas level using encapuslation!
      } else if ((getAvenue() > 1) && (orientation.equals("East"))) {
        setLocation(new int[] { getStreet(), getAvenue() - 1 });
        setGas(getGasLevel() - 0.05); // sets gas level using encapuslation!
      } else if ((getAvenue() < 10) && (orientation.equals("West"))) {
        setLocation(new int[] { getStreet(), getAvenue() + 1 });
        setGas(getGasLevel() - 0.05); // sets gas level using encapuslation!
      } else {
        System.out.println("You hit a boundary!");
      }
    } else {
      if ((getStreet() > 1) && (orientation.equals("South"))) { // moped moving backwards
        setLocation(new int[] { getStreet() + 1, getAvenue() });
        setGas(getGasLevel() - 0.05); // sets gas level using encapuslation!
      } else if ((getStreet() < 200) && (orientation.equals("North"))) {
        setLocation(new int[] { getStreet() - 1, getAvenue() });
        setGas(getGasLevel() - 0.05); // sets gas level using encapuslation!
      } else if ((getAvenue() > 1) && (orientation.equals("East"))) {
        setLocation(new int[] { getStreet(), getAvenue() + 1 });
        setGas(getGasLevel() - 0.05); // sets gas level using encapuslation!
      } else if ((getAvenue() < 10) && (orientation.equals("West"))) {
        setLocation(new int[] { getStreet(), getAvenue() - 1 });
        setGas(getGasLevel() - 0.05); // sets gas level using encapuslation!
      } else {
        System.out.println("You hit a boundary!");
      }
    }

  }

  public void goLeft() {
    setOrientation(orientationLogic(getOrientation(), "Left"));// sets orientation based on the current orientation
    if (getGasLevel() >= 0.05) {
      correctiveMovement(getOrientation()); // moves the moped based on its orientation.
    } else {
      System.out.println("We have run out of gas. Bye Bye!");
      System.exit(0);
    }
  }

  public void goRight() {
    setOrientation(orientationLogic(getOrientation(), "Right"));
    if (getGasLevel() >= 0.05) {
      correctiveMovement(getOrientation());
    } else {
      System.out.println("We have run out of gas. Bye Bye!");
      System.exit(0);
    }
  }

  public void goStraight() {
    setBackwards(false);
    if (getGasLevel() >= 0.05) {
      correctiveMovement(getOrientation());
    } else {
      System.out.println("We have run out of gas. Bye Bye!");
      System.exit(0);
    }
  }

  public void goBackwards() {
    setBackwards(true);
    if (getGasLevel() >= 0.05) {
      correctiveMovement(getOrientation());
    } else {
      System.out.println("We have run out of gas. Bye Bye!");
      System.exit(0);
    }
  }

  public int getGasPercent() {
    return (int) (gas * 100);
  }

  public void printGasLevel() {
    System.out.println("The gas tank is currently " + getGasPercent() + "% full.");
    if (getGasLevel() <= 0) {
      System.out.println("We have run out of gas. Bye bye!");
      System.exit(0);
    }
  }

  public void fillGas() {
    setGas(1.0);
    System.out.println("Gas tank refilled.");
  }

  public void park() {
    System.out.println("We have parked. Bye!");
    System.exit(0);
  }

  public void goToXianFoods() {
    // when facing
    if (getBackwards()) {
      goStraight();
    }
    while (getStreet() != 15) {
      if (getGasLevel() <= 0.6) {
        fillGas();
      }
      switch (getOrientation()) {
        case "North":
          if (getStreet() < 15) {
            goStraight();
            printLocation();
          } else {
            goLeft();
            printLocation();
          }
          break;
        case "South":
          if (getStreet() < 15) {
            goLeft();
            printLocation();
          } else {
            goStraight();
            printLocation();
          }
          break;
        case "East":
          if (getStreet() < 15) {
            goLeft();
            printLocation();
          } else {
            goRight();
            printLocation();
          }
          break;
        case "West":
          if (getStreet() < 15) {
            goRight();
            printLocation();
          } else {
            goLeft();
            printLocation();
          }
          break;
      }
    } // kms
    while (getAvenue() != 8) {
      if (getGasLevel() <= 0.6) {
        fillGas();
      }
      switch (getOrientation()) {
        case "North":
          if (getAvenue() < 8) {
            goLeft();
            printLocation();
          } else {
            goRight();
            printLocation();
          }
          break;
        case "South":
          if (getAvenue() < 8) {
            goRight();
            printLocation();
          } else {
            goLeft();
            printLocation();
          }
          break;
        case "East":
          if (getAvenue() < 8) {
            goLeft(); // add edge case if moped is close to boundary
            printLocation();
          } else {
            goStraight();
            printLocation();
          }
          break;
        case "West":
          if (getAvenue() < 8) {
            goStraight();
            printLocation();
          } else {
            goLeft();
            printLocation();
          }
          break;
      }
    }
    // Display the final location
    System.out.println("Arrived at Xi'an Famous Foods at " + getStreet() + getSuffix(getStreet()) +
        " St. and " + getAvenue() + getSuffix(getAvenue()) + " Ave.");
  }

  public String getHelp() {
    return "help		Display this help message\ngo left		go left\ngo right		go right\nstraight on		Moves moped in current orientation\n"
        + "back up		Moves moped backwards\nhow we doin’?		Prints gas %\nfill it up		Refill gas tank\npark		Exits program\ngo to Xi’an Famous Foods		"
        + "Maps to Xi'an Famous Foods";
  }

  void handleAdvertising() {
    if (getStreet() == 12 && getAvenue() == 4) {
      System.out.println(
          "Did you know The Strand has 18 Miles of new, used and rare books, and has been in business since 1927?");
    } else if (getStreet() == 79 && getAvenue() == 8) {
      System.out.println("Visit the American Museum of Natural History Today!");
    } else if (getStreet() == 74 && getAvenue() == 1) {
      System.out.println("Memorial Sloan Kettering! Great Kettering here!");
    } else if (getStreet() == 56 && getAvenue() == 3) {
      System.out.println("Best cuban food in NYC at Tina's Cuban Restaurant!");
    }
  }
}
