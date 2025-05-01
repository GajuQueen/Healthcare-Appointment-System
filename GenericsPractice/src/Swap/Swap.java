package Swap;
import java.util.List;

public class Swap<T>{
    T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public static<T> void swapElements(List<T> list, int index1, int index2 ) {
//        Checking if the indices are valid
        if(index1 < 0 || index2 < 0 || index1 >= list.size() || index2 >= list.size()){
            throw new IndexOutOfBoundsException("Invalid input");
        }

//        Swapping
     T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
