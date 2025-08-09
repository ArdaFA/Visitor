// ConcreteElementB
public class Monkey implements Animal {
    public void screech() {
        System.out.println("Monkey: Eek-eek!");
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
