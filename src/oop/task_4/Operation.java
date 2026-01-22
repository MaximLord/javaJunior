package oop.task_4;

//Интерфейс Operation с default методом validate(int a, int b) (a,b >= 0).

@FunctionalInterface
public interface Operation {
    double execute(int a, int b);

    default boolean validate(int a, int b) {
        return a >= 0 && b >= 0;
    }

}
