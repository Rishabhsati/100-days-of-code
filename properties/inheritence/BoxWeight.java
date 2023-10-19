package properties.inheritence;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
//        super(l, h, w);  what is this ? call the parent class constructor
//        used to initialize values which is present in parents class
          this.weight = weight;

    }
}
