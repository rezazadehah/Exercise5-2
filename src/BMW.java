public class BMW implements Cars {

    @Override
    public String name() {
        return "bmw";
    }

    @Override
    public String color() {
        return "sabz";
    }

    @Override
    public String engine() {
        return "v6";
    }

    @Override
    public String toString() {
        return name() + " " + color() + " "+ engine();
    }
}
