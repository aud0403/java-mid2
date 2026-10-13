package generic.test.ex2;

public class Pair <T,K>{

    private T t;
    private K k;


    public void setFirst(T i) {
        this.t = i;
    }

    public void setSecond(K data) {
        this.k = data;
    }

    public T getFirst() {
        return t;
    }

    public K getSecond() {
        return k;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + t +
                ", second=" + k +
                '}';
    }
}
