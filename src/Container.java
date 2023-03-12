public class Container {
    int volume;

    public Container() {
    }

    public int contains() {
        return this.volume;
    }

    //which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added. A container can hold maximum of 100 units of liquid.
    public void add(int amount) {

    }

    //which removes the amount of liquid given as a parameter from the container. If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
    public void remove(int amount) {

    }

    @Override
    public String toString() {
        return "Container{" +
                "volume=" + volume +
                '}';
    }
}