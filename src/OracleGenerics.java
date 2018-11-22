public class OracleGenerics {

    public static void main(String[] args) {

        // Type inference works in Java SE 7 and later
        Box<Integer> integerBox = new Box<>();

        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

        // Parameterized type
        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());

        // Raw type
        Box rawBox = new Box();

        // Unchecked error message
        Box<Integer> bi;
        bi = createBox();

        // Bounded type parameters
        Box<Integer> integerBox1 = new Box<>();
        integerBox1.set(new Integer(10));
//        integerBox1.inspect("some text");
    }

    static Box createBox() {
        return new Box();
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}

/**
 * Generic version of the Box class.
 *
 * @param <T> the type of the value being boxed
 */
class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}

interface Pair<K, V> {
    public K getKey();

    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n) {
        this.n = n;
    }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }
}