

import com.ing.zoo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    private List<Animal> animals;
    private String zookeeperName;


    public Zoo() {
        animals = new ArrayList<>();
        initializeAnimals();
        setupZookeeper();
    }

    private void initializeAnimals(){
        // Here is where you add animals
        animals.add(new Hippo("Elsa"));
        animals.add(new Lion("Henk"));
        animals.add(new Tiger("Wally"));
        animals.add(new Pig("Dora"));
        animals.add(new Zebra("Marty"));
        animals.add(new Flamingo("Eric"));
        animals.add(new Monkey("Deo"));

    }
    private void setupZookeeper(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer hier uw naam in (Zookeeper): ");
        zookeeperName = scanner.nextLine();
    }

    String[] commands = {"hello", "give leaves", "give meat", "perform trick"};
    private void displayCommands() {
        System.out.println("Available commands:");
        for (String command : commands) {
            System.out.println("- " + command);
        }
        System.out.println();
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the command (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")){
                break;
            }

            proccesCommands(input);
        }
    }
    private void proccesCommands(String input) {
        if(input.startsWith("hello")){
            greetAnimals(input);
        } else if (input.startsWith("give leaves")) {
            feedHerbivores();
        } else if (input.startsWith("give meat")) {
            feedCarnivores();
        } else if (input.startsWith("perform trick")) {
            performTrick();
        }
    }

    private void greetAnimals(String input) {
        String[] pieces = input.split(" ");
        if (pieces.length == 2) {
            String animalName = pieces[1];
            for (Animal animal : animals) {
                if (animal.getName().equalsIgnoreCase(animalName)) {
                    animal.sayHello(zookeeperName);
                    return;
                }
            }
            System.out.println("No animal found with the name: " + animalName);
        } else {
            for (Animal animal : animals) {
                animal.sayHello(zookeeperName);
            }
        }
    }

    private void feedHerbivores(){
        for (Animal animal: animals){
            if (animal instanceof Herbivore){
                ((Herbivore) animal).eatLeaves();
            }
        }
    }
    private void feedCarnivores(){
        for (Animal animal: animals){
            if(animal instanceof Carnivore){
                ((Carnivore) animal).eatMeat();
            }
        }
    }
    private void performTrick() {
        for (Animal animal: animals){
            animal.performTrick();
        }
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.start();
    }
}