// ConcreteVisitor1: Implements an operation to be performed on the animals.
class HealthCheckVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Performing health check on the Lion's teeth.");
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("Performing health check on the Monkey's agility.");
    }

    @Override
    public void visit(Zebra zebra) {
        System.out.println("Performing health check on the Zebra's stripes.");
    }
}