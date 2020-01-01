public class Benz implements Cars {

    @Override
    public String name() {
        return "benz";
    }

    @Override
    public String color() {
        return "Abi";
    }

    @Override
    public String engine() {
        return "v8";
    }

    @Override
    public String toString() {
        return name() + " " + color() + " "+ engine();
    }
}
