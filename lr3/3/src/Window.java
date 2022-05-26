import java.util.Objects;

public class Window {
    enum State {
        CLOSED,
        OPENED
    }

    State state;

    public Window(State state) {
        this.state = state;
    }

    public void open() {
        this.state = State.OPENED;
    }

    public void close() {
        this.state = State.CLOSED;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Window state(State state) {
        setState(state);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Window)) {
            return false;
        }
        Window window = (Window) o;
        return Objects.equals(state, window.state);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(state);
    }

    @Override
    public String toString() {
        return "{" +
            " state='" + getState() + "'" +
            "}";
    }

}
