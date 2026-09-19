public class StringInstrument extends Instrument {
    public StringInstrument() {
    }

    @Override
    public String play() {
        // Instrument.play() is abstract, so Java cannot call super.play() here.
        return "Strumming the strings";
    }
}
