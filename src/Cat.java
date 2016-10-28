/**
 * Created by nmabatov on 28.10.2016.
 */
public class Cat extends Pet implements Moveable, Voice {
    public static void Voice(){
        System.out.println("Мяу");
    }

    @Override
    public void move(String newLocation) {

    }
}

class Tiger extends Cat{
    public static void Voice(){
        System.out.println("Arrrr!");
    }
}
