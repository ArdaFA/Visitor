// The Visitor interface, which declares a visit method for each type of concrete element.

public interface AnimalVisitor {
    void visit(Lion lion);
    void visit(Monkey monkey);
    void visit(Zebra zebra);
}

