import java.util.Scanner;

public class Game{
static Scanner sc = new Scanner(System.in);

public static void main(String [] args){


    System.out.println("Welcome Player in this adventure game. \n---Soul Ring--- \n      ");
    System.out.println("1. New Game");
    System.out.println("2. Options");
    System.out.println("3. Exit");
    System.out.println("\nChoose one of the options");
    int a = sc.nextInt();
    Player player = null; 

    if (a==1){

    System.out.println("Choose your Class: ");
    System.out.println("1. Warrior Class (Melee Bonus)");
    System.out.println("2. Archer Class (Ranged Bonus)");

    int choice = sc.nextInt();

    if(choice==1){
        player = new Warrior();
        System.out.println("You have Choosed Warrior Class! Melee attacks are boosted by +5");
    }else if (choice==2) {
        player = new Archer();
        System.out.println("You have Choosed Archer Class! Ranged attacks are boosted by +4");
    }else{
        System.out.println("Invalid Choice. Default is set to Warrior");
        player = new Warrior();
    }
    System.out.println("Starting the game...");
    

    }else if (a==2){

    System.out.println("Options menu (Feature coming soon!)");

    }else if (a==3){
    System.out.println("Exiting the application...");
    return;
}


    }
}


class Character {

protected int health = 100;
protected int mana = 100;
protected int stamina = 50;
protected int melee_attack = 10;
protected int range_attack = 8;



void attack(String type){
if(type.equalsIgnoreCase("m")){health = health - melee_attack;
}
else if(type.equalsIgnoreCase("r")){health = health - range_attack;
}
}
void dodge(){ stamina = stamina - 10; 
}
}

class Player extends Character{

boolean health_potion = true;
boolean mana_potion = true;
boolean stamina_potion = true;

}

class Enemy extends Character{

boolean surprise_attack = true;
void surprise_attack(){
System.out.println("The enemy performs a surprise attack!");

}

}

class NPC extends Character{

void run(){System.out.println("You scared the villager by attacking. He ran away");
}
void scream(){
System.out.println("You attacked the Villager. \nHe screamed and called the enemies");
}

}

class Warrior extends Player{
public Warrior(){ 
melee_attack += 5;

}
}


class Archer extends Player{

public Archer(){
range_attack += 4;
}
}

class Enemy_Boss extends Character{

public void attack(String type){

health -=(type.equalsIgnoreCase("m")) ? melee_attack + 5 : range_attack + 4;
}
}