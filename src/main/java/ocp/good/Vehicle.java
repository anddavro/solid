package ocp.good;

public interface Vehicle {

    default void accelerate() { }

    default void stop() {
        // stop car
    }
}
