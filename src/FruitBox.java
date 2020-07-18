import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBox<T extends Fruit> {
    private final float PRECISION = 0.00001f;
    private List<T> Box;

    public FruitBox() {
        Box = new ArrayList<>();
    }

    public FruitBox(T... fruits) {
        Box = new ArrayList(Arrays.asList(fruits));
    }

    public float getWeight(){
        if(Box.size() == 0){
            return 0;
        }
        return (Box.get(0)).getWeight() * Box.size();
    }

    public void add(T fruit){
        Box.add(fruit);
    }

    public Boolean equal(FruitBox<?> other){
        return Math.abs(getWeight() - other.getWeight()) < PRECISION;
    }

    public void reload(FruitBox<? super T> other){
        if(other == this){
            return;
        }
        other.Box.addAll(Box);
        Box.clear();
    }
}
