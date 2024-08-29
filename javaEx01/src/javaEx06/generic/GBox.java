package javaEx06.generic;

// 제너릭 사용
public class GBox<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
