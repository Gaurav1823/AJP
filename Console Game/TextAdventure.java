import java.util.Scanner;
class TextAdventure {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String choice = "";
int health = 100;
boolean hasKey = false;

System.out.println("You were coming back from your village late at night. The roads were poorly lit, and trees lined both sides. Suddenly, a creature appeared in front of your car. You swerved to avoid it but lost control, crashing into the trees on the side. Everything went black. \nWhen you regain consciousness, you find yourself in a mysterious forest. A path splits into two...");

while (!choice.equals("exit")) {System.out.print("\nChoose 'left' (Cave) or 'right' (Village) or type 'exit' to quit: ");
choice = sc.nextLine().toLowerCase();

if (choice.equals("left")) {
System.out.println("You enter a dark cave as you hear loud screeching noise outside...");
System.out.print("Inside, you see a treasure chest. Open it? (yes/no): ");
String chestChoice = sc.nextLine().toLowerCase();

if (chestChoice.equals("yes")) {System.out.println("You found a **Key**! This may be useful...");
hasKey = true;
} else {System.out.println("You ignore the chest and leave.");
}
} else if (choice.equals("right")) {
System.out.println("You arrive at an abandoned village...");
System.out.print("A mysterious door stands ahead. Try to open it? (yes/no): ");
String doorChoice = sc.nextLine().toLowerCase();

if (doorChoice.equals("yes") && hasKey) {System.out.println("You **unlock the door with the Key** and find a hidden passage which leads towards a light!");
System.out.println("Congratulations! You found the secret exit and you wake up in your car and all of it was just a dream.");
break;
} else if (doorChoice.equals("yes")) {System.out.println("The door is locked... Maybe there's a key somewhere?");
} else {System.out.println("You ignore the door and wander away forever. Never waking up AGAIN! ");
}
} else if (!choice.equals("exit")) {System.out.println("Invalid choice. Try again.");
}
}
System.out.println("Game Over.");
sc.close();
}
}