// ConcreteElementA
public class Lion implements Animal {
    public void roar() {
        System.out.println("Lion: Roaaar!");
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

