import java.util.Objects;

public class Abiturient {
    int id;
    String name;
    String surname;
    String address;
    String phone;
    int[] scores;

    public Abiturient(int id, String name, String surname, String address, String phone, int[] scores) throws ZeroScoresException {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.scores = scores;

        if (scores.length == 0) throw new ZeroScoresException(name + " " + surname);
    }

    public int getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }


    public String getSurname() {
        return this.surname;
    }


    public String getAddress() {
        return this.address;
    }


    public String getPhone() {
        return this.phone;
    }


    public int[] getScores() {
        return this.scores;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setScores(int[] scores) {
        this.scores = scores;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Abiturient)) {
            return false;
        }
        Abiturient abiturient = (Abiturient) o;
        return id == abiturient.id && Objects.equals(name, abiturient.name) && Objects.equals(surname, abiturient.surname) && Objects.equals(address, abiturient.address) && Objects.equals(phone, abiturient.phone) && Objects.equals(scores, abiturient.scores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, address, phone, scores);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", surname='" + getSurname() + "'" +
            ", address='" + getAddress() + "'" +
            ", phone='" + getPhone() + "'" +
            ", scores='" + getScores() + "'" +
            "}";
    }
}
