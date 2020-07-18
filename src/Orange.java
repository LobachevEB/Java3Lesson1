public class Orange extends Fruit{
    private final float coef = 1.5f;
    private float weight = 1;


    public float getWeight() {
        return weight;
    }

    public Orange() {
        weight *= coef;
    }
}
