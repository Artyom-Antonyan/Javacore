package homeworks;

public class BoxTest {
    public static void main(String[] args) {

        Box myBox = new Box(10, 15, 20);
        Box myBox2 = new Box(16.6, 4, 2.8);
        double vol = myBox.volume();

        System.out.println("Boxi caval: " + vol);
        System.out.println("Boxi caval2: " + myBox2.volume());

    }
}
