// The Element interface, which defines an 'accept' method to accept a visitor.

public interface Animal {
    void accept(AnimalVisitor visitor);
}
