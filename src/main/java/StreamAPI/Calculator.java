package StreamAPI;

@FunctionalInterface
public interface Calculator<T> {
    public T calculate(T first, T second);
}
