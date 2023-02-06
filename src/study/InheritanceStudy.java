package study;

class Color {

    public String color;

    public void printColor() {

        System.out.println(color);
    }
}

class Red extends Color {

//    @Override
//    public void printColor() {
//
//        System.out.println(color + " " + color);
//    }
}

public class InheritanceStudy {

    public static void main(String[] args) {

        Color color = new Color();
        color.printColor();

        Red red = new Red();
        red.color = "빨강";
        red.printColor();
    }
}
