import java.util.Objects;
public class Pair <k, v> {
    k key;
    v value;

    public Pair(k key, v value) {
        if (key == null) {
            throw new NullPointerException("key is null");
        }
        this.key = key;
        this.value = value;
    }

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        if (key == null) {
            throw new NullPointerException("key is null");
        }
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ", value= " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?> other)) return false;
        return Objects.equals(key, other.key) && Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    Pair<String, Integer> pair = Pair.create("Name", 30);
    public static <K, V> Pair<K, V> create(K key, V value) {
        return new Pair<>(key, value);
    }
}
