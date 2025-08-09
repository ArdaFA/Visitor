// ConcreteVisitor2: Implements a completely different operation.
class FeedingVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Feeding the Lion with meat.");
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Feeding the Monkey with bananas.");
    }

    @Override
    public void visit(Zebra zebra) {
        System.out.println("Feeding the Zebra with hay.");
    }
}