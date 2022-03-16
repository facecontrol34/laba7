class Cat extends Animal {
    private String unique_factor = "Любимое место сна - диван";

    Cat(String food, String location){
        super(food, location);
    }

    public void eat(){
        System.out.println("Кот поел недавно");
    }

    public void sleep(){
        System.out.println("Кот сонный");
        System.out.println(unique_factor);
    }

    public void makeNoise(){
        System.out.println("Зевает");
    }

    public void health(){
        Animal cat = new Cat(food, location);
        System.out.println("Кот на приёме у ветеринара");
        Veterinar veterinar = new Veterinar();
        veterinar.treatAnimal(cat);
    }
}
