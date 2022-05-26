import java.util.Objects;

public class Door {
    enum State {
        CLOSED,
        OPENED
    }

    State state;

    public Door(State state) {
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

    public Door state(State state) {
        setState(state);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Door)) {
            return false;
        }
        Door Door = (Door) o;
        return Objects.equals(state, Door.state);
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
