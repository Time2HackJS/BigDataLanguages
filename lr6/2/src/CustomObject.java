import java.util.Objects;

public class CustomObject {
    String name;
    int hash;

    public CustomObject(String name) {
        this.name = name;
        this.hash = Objects.hash(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hash);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + this.name + "'" +
            ", hash='" + this.hash + "'" +
            "}";
    }

}
