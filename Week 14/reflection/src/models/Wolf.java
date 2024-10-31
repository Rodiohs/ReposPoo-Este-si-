package models;

public class Wolf {
    private String name;
    private int age;
    public Wolf(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private static void sound(int intensidad){
        System.out.print("A");
        for (int i = 0; i < intensidad; i++){
            System.out.print("oo");
        }
    }
    private static void action(){
        System.out.println("The wolf howl!");
    }
}
