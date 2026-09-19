public class Violin extends StringInstrument {
    public Violin() {
    }

    @Override
    public String play() {
        return super.play() + ", with a bow drawn across four strings";
    }
}
