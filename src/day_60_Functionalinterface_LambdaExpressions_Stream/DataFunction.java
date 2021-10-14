package day_60_Functionalinterface_LambdaExpressions_Stream;

@FunctionalInterface
public interface DataFunction<T> {//generic type
    T accept(T t);
}
