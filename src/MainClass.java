import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        String[] letters = {"a","b","c","d","e"};
        replace(letters,1,3);
        System.out.println(Arrays.toString(letters));

        ArrayList result = convertArrayToList(letters);
        System.out.println(result.toString());

        Apple[] apples = {new Apple(),new Apple(),new Apple()};
        Orange[] oranges = {new Orange(),new Orange(),new Orange(),new Orange()};
        FruitBox box1 = new FruitBox(apples);
        FruitBox box2 = new FruitBox();
        for (Orange orange: oranges) {
            box2.add(orange);
        }
        FruitBox box3 = new FruitBox();
        box2.reload(box3);
        System.out.printf("Box1 weight %f\n",box1.getWeight());
        System.out.printf("Box2 weight %f\n",box2.getWeight());
        System.out.printf("Box3 weight %f\n",box3.getWeight());
        System.out.printf("Is Box1 equal to Box3? %b\n",box1.equal(box3));
        for (Apple apple: apples) {
            box2.add(apple);
        }
        System.out.printf("Box2 weight %f\n",box2.getWeight());
        System.out.printf("Is Box1 equal to Box2? %b\n",box1.equal(box2));


    }

    public static <T> void replace(T[] arr,int ind1,int ind2){
        T current = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = current;
    }

    public static <T> ArrayList<T> convertArrayToList(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }


}

