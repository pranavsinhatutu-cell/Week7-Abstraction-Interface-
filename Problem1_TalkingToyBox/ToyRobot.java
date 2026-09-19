public class ToyRobot extends Toy {
    private String name;

    public ToyRobot(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String makeSound() {
        return name + ": Beep boop!";
    }
}
