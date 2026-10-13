package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {

        GenericBox IntegerBox = new GenericBox();
        //GenericBox<Object> objectBox = new GenericBox<>(); 권장
        IntegerBox.set(10);
        Integer result = (Integer) IntegerBox.get();
        System.out.println("result = " + result);
    }
}
