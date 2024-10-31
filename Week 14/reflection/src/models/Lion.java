package models;

public class Lion {
    private String name;
    private int age;
    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private static void sound(int intensidad){
        System.out.print("R");
        for (int i = 0; i < intensidad; i++){
            System.out.print("o");
        }
        System.out.println("ar!");
        }
    private static void action() {
        System.out.println("The lion stares at you!");
    }
}
