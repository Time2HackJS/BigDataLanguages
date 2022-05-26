import java.util.Objects;

public class MNumber {
    private int value;

    public MNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MNumber value(int value) {
        setValue(value);
        return this;
    }

    public void print() {
        System.out.println(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MNumber)) {
            return false;
        }
        MNumber MNumber = (MNumber) o;
        return value == MNumber.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "{" +
            " value='" + getValue() + "'" +
            "}";
    }

}
