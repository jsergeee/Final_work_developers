class Dog extends Animal {
    public Dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void displayInfo() {
        System.out.println("Dog Name: " + name);
        System.out.println("Commands: " + commands);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name, "Cat");
    }

    @Override
    public void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Commands: " + commands);
    }
}
