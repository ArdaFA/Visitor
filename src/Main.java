import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // object structure: a list of different animals.
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Monkey());
        animals.add(new Zebra());

        // Create a visitor for the health check operation.
        AnimalVisitor healthChecker = new HealthCheckVisitor();

        System.out.println("--- Health Check Day ---");
        // For each animal, accept the health checker visitor.
        for (Animal animal : animals) {
            animal.accept(healthChecker); // Double dispatch part 1
        }

        System.out.println("\n--- Feeding Time ---");
        // Create a completely new visitor for a new operation.
        // NOTE: We did NOT change any of the animal classes!
        AnimalVisitor feeder = new FeedingVisitor();

        // For each animal, accept the feeding visitor.
        for (Animal animal : animals) {
            animal.accept(feeder);
        }
    }
}