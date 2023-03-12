public class Container {
    int volume;

    public Container() {
    }

    public int contains() {
        return this.volume;
    }

    //If the amount is negative, no liquid is added. A container can hold maximum of 100 units of liquid.
    public void add(int amount) {
        if (amount < 1) {
            // Do nothing
        } else if (this.volume + amount > 100) {
            this.volume = 100;
        } else {
            this.volume += amount;
        }
    }

    //If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
    public void remove(int amount) {
        if (amount < 1) {
            // Do nothing
        } else if (this.volume - amount < 1) {
            this.volume = 0;
        } else {
            this.volume -= amount;
        }
    }

    @Override
    public String toString() {
        return this.volume + "/100";
    }
}