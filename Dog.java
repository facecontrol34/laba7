class Dog extends Animal {
    Dog(String food, String location){
        super(food, location);
    }
    private String unique_factor = "Любимая игрушка - резиновая косточка";

    public void eat(){
        System.out.println("Собака ела утром");

    }

    public void sleep(){
        System.out.println("Собака спит");
    }

    public void makeNoise(){
        System.out.println("храпит");
        System.out.println(unique_factor);
    }

    public void health(){
        Animal dog = new Dog(food, location);
        System.out.println("Собака на приёме у ветеринара");
        Veterinar veterinar = new Veterinar();
        veterinar.treatAnimal(dog);
    }
}
