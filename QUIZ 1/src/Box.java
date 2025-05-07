import java.util.List;
public class Box<T> {
    T[] array;
     int index1;
     int index2;
    T temp;

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getIndex1() {
        return index1;
    }

    public void setIndex1(int index1) {
        this.index1 = index1;
    }

    public int getIndex2() {
        return index2;
    }

    public void setIndex2(int index2) {
        this.index2 = index2;
    }

    public T getTemp() {
        return temp;
    }

    public void setTemp(T temp) {
        this.temp = temp;
    }

    public  <T> void swapElements(List[]lists, int index1, int index2) {

//        T temp = List.get(index1);
//        List.set(index1, List.get(index2));
//        List.set(index2, temp);
        List<T> list = lists[index1];
    }
}


