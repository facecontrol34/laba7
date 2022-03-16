import java.util.Scanner;

public class mainAnimal {
    public static void main(String[] args){

        System.out.println("Выберите цифру одного из следующих животных: Собака(1), Кот(2), Лошадь(3)");

        Scanner scanner = new Scanner(System.in);
        int type_animal = scanner.nextInt();

        if(type_animal == 1) {
            Dog dog = new Dog("куриная грудка", "будка");
            dog.eat();
            dog.sleep();
            dog.makeNoise();
            dog.health();
        }
        else if(type_animal == 2) {
            Cat cat = new Cat("рыбка", "дом");
            cat.eat();
            cat.sleep();
            cat.makeNoise();
            cat.health();
        }
        else if(type_animal == 3) {
            Horse horse = new Horse("сено", "сарай");
            horse.sleep();
            horse.eat();
            horse.makeNoise();
            horse.health();
        }
    }
}
