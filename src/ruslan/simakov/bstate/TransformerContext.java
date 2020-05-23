package ruslan.simakov.bstate;

public class TransformerContext implements TransformerState {

    private TransformerState transformerState;

    public TransformerState getTransformerState() {
        return transformerState;
    }

    public void setTransformerState(TransformerState transformerState) {
        this.transformerState = transformerState;
    }

    @Override
    public void action() {
        transformerState.action();
    }
}
