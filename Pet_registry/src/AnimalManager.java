import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("1. Завести новое животное");
            System.out.println("2. Вывести список животных");
            System.out.println("3. Обучить животное новой команде");
            System.out.println("4. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    try (Counter counter = new Counter()) {
                        System.out.println("Введите имя животного:");
                        String name = scanner.nextLine();
                        System.out.println("Введите тип животного (Dog/Cat):");
                        String type = scanner.nextLine();

                        Animal animal;
                        if (type.equalsIgnoreCase("Dog")) {
                            animal = new Dog(name);
                        } else if (type.equalsIgnoreCase("Cat")) {
                            animal = new Cat(name);
                        } else {
                            System.out.println("Неверный тип животного.");
                            continue;
                        }

                        animals.add(animal);
                        counter.add();
                        System.out.println("Животное заведено.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    for (Animal animal : animals) {
                        animal.displayInfo();
                    }
                    break;

                case 3:
                    System.out.println("Введите имя животного для обучения:");
                    String animalName = scanner.nextLine();
                    for (Animal animal : animals) {
                        if (animal.name.equals(animalName)) {
                            System.out.println("Введите новую команду:");
                            String command = scanner.nextLine();
                            animal.addCommand(command);
                            System.out.println("Команда добавлена.");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Выход.");
                    return;

                default:
                    System.out.println("Неверный выбор.");
            }
        }
    }
}
