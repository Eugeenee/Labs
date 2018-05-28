package laba7_1;

public class Output {
    public static void getName(Object obj){
        if (obj instanceof Cat)
            ((Cat) obj).printName();
        if (obj instanceof Dog)
            ((Dog) obj).printName();
        if (obj instanceof Bird)
            ((Bird) obj).printName();
        if (obj instanceof Lamp)
            ((Lamp) obj).printName();
    }
    public static void main(String[] args){
        getName(new Cat());
    }
}
