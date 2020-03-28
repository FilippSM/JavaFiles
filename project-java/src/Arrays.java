public class Arrays {
    public static void main (String[] args){
        Cat[] abc = new Cat [3];
        abc[0] = new Cat("Kitty");
        abc[1] = new Cat("Molly");
        abc[2] = new Cat("Lily");


        Dog onePerson = new Dog();
        onePerson.shows();
    }
}

class Cat {
    String name;

    public Cat (String name){
        this.name = name;
    }

    public void show() {
        System.out.println("1");
    }
}

class Dog {
    public void shows() {
        System.out.println("red");

    }
}