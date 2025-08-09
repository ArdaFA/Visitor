// ConcreteElementC
public class Zebra implements Animal {
    public void bray() {
        System.out.println("Zebra: Neigh!");
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
