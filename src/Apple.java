public class Apple extends Fruit {
    private final float coef = 1.0f;
    private float weight = 1;


    public float getWeight() {
        return weight;
    }

    public Apple() {
        weight *= coef;
    }
}
