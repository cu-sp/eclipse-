package assignment_7;

/**
 * A virtual moped, roaming the streets of New York.
 * The signatures of a few methods are given and MUST be completed and used as indicated.
 * Create as many additional properties or methods as you want, as long as the given methods behave as indicated in the instructions.
 * Follow good object-oriented design, especially the principles of abstraction (i.e., the black box metaphor)
 * and encapsulation (i.e., methods and properties belonging to specific objects), as we have learned them.
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

    public void printLocation() {
        System.out.println("Now at " + street + getSuffix(street) + " St. and " + avenue + getSuffix(avenue) + " Ave, facing " + orientation + ".");
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
    	if(backwards&&leftOrRight.equals("Left")) {		//changing orientation logic if the moped is going backwards 
    		leftOrRight = "Right";
    	}else if (backwards&&leftOrRight.equals("Right")) {
    		leftOrRight = "Left";
    	}
    	if(leftOrRight.equals("Left")) {
            switch(current) {
            	case("North"):
            		return ("West");
            	case("East"):
            		return ("North");
            	case("West"):
            		return ("South");
            	case("South"):
            		return ("East");
            	default:
            		return "ur orientation var is not north east south or west";
            }
    	}else if (leftOrRight.equals("Right")) {
            switch(current) {
            	case("North"):
            		return ("East");
            	case("East"):
            		return ("South");
            	case("West"):
            		return ("North");
            	case("South"):
            		return ("West");
            	default:
            		return "ur orientation var is not north east south or west";
            }
    	}else {
    		return "orientation input wrong for orientationLogic class";
    	}
    }
    public void correctiveMovement(String orientation) { //movement that handles gas, boundaries and backwards
    	if(backwards == false) {//moped moving forwards 
			if((street > 1) && (orientation.equals("South"))) { //checks for boundary
				street--;
				gas -= 0.05;
			}else if((street < 200) && (orientation.equals("North"))){
				street++;
				gas -= 0.05;
			}else if ((avenue > 1) && (orientation.equals("East"))) {
				avenue++;
				gas -= 0.05;
			}else if ((avenue < 200) && (orientation.equals("West"))) {
				avenue--;
				gas -= 0.05;
			}else {
				System.out.println("You hit a boundary!");
			}
    	}else {
			if((street > 1) && (orientation.equals("South"))) { //moped moving backwards
				street++;
				gas -= 0.05;
			}else if((street < 200) && (orientation.equals("North"))){
				street--;
				gas -= 0.05;
			}else if ((avenue > 1) && (orientation.equals("East"))) {
				avenue--;
				gas -= 0.05;
			}else if ((avenue < 200) && (orientation.equals("West"))) {
				avenue++;
				gas -= 0.05;
			}else {
				System.out.println("You hit a boundary!");
			}
    	}
    	
    }
    public void goLeft() {
    	setOrientation(orientationLogic(orientation,"Left"));//sets orientation based on the current orientation 
        if (gas >= 0.05) {
            correctiveMovement(orientation); //moves the moped based on its orientation. 
        } else{
            System.out.println("We have run out of gas. Bye Bye!");
            System.exit(0);
        }
    }
    

    public void goRight() {
    	setOrientation(orientationLogic(orientation,"Right"));
        if (gas >= 0.05) {
        	correctiveMovement(orientation);
        } else{
            System.out.println("We have run out of gas. Bye Bye!");
            System.exit(0);
        } 
   }

    public void goStraight() {
    	backwards = false;
        if (gas >= 0.05) {
        	correctiveMovement(orientation);
        } else{
            System.out.println("We have run out of gas. Bye Bye!");
            System.exit(0);
        } 
    }

    public void goBackwards() {
    	backwards = true;
        if (gas >= 0.05) {
        	correctiveMovement(orientation);
        } else {
            System.out.println("We have run out of gas. Bye Bye!");
            System.exit(0);
        }
    }

    public int getGasLevel() {
        return (int) (gas * 100);
    }

    public void printGasLevel() {
        System.out.println("The gas tank is currently " + getGasLevel() + "% full.");
        if (gas <= 0) {
            System.out.println("We have run out of gas. Bye bye!");
            System.exit(0);
        }
    }

    public void fillGas() {
        gas = 1.0;
        System.out.println("Gas tank refilled.");
    }

    public void park() {
        System.out.println("We have parked. Bye!");
        System.exit(0);
    }

    public void goToXianFamousFoods() {
        while (street != 15 || avenue != 8) {
            if (street < 15) {
                goStraight();
            } else if (street > 15) {
                goBackwards();
            } else if (avenue < 8) {
                goRight();
            } else if (avenue > 8) {
                goLeft();
            }
            if (gas <= 0) {
                fillGas();
            }
        }
        System.out.println("Arrived at Xi'an Famous Foods!");
    }

    public String getHelp() {
        return "help		Display this help message\ngo left		go left\ngo right		go right\nstraight on		Moves moped in current orientation\n"
        		+ "back up		Moves moped backwards\nhow we doin’?		Prints gas %\nfill it up		Refill gas tank\npark		Exits program\ngo to Xi’an Famous Foods		"
        		+ "Maps to Xi'an Famous Foods";
    }

    public void setLocation(int[] location) {
        street = location[0];
        avenue = location[1];
    }

    public int[] getLocation() {
        return new int[]{street, avenue};
    }

    private void handleAdvertising() {
        if (street == 12 && avenue == 4) {
            System.out.print("Did you know The Strand has 18 Miles of new, used and rare books, and has been in business since 1927?");
        }
        else if (street == 79 && avenue == 8) {
        	System.out.print("Visit the American Museum of Natural History Today!");
        }
        else if (street == 74 && avenue == 1) {
        	System.out.print("Memorial Sloan Kettering! Great Kettering here!");
        }
        else if (street == 56 && avenue == 3) {
        	System.out.print("Best cuban food in NYC at Tina's Cuban Restaurant!"); 
    }
}
}