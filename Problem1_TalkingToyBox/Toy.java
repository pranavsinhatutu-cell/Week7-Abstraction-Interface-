public abstract class Toy {
    private static int nextId = 1001;
    private final String toyId;

    public Toy(String name) {
        toyId = "TOY-" + nextId;
        nextId++;
    }

    public abstract String makeSound();

    public String getToyId() {
        return toyId;
    }
}
