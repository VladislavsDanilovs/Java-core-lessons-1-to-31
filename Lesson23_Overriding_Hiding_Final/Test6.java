package Lesson23;

public class Test6 {

    public static void main(String[] args) {
        Animal1 a = new Mouse1();
        a.showInfoAboutAnimal();
        ((Mouse1) a).showInfoAboutMouse();
    }
}

class Animal1 {

    static String showName() {
        return "Mouse";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }

}

class Mouse1 extends Animal1 {
    static String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }

}