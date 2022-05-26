import java.util.Objects;

public class House {
    private Door[] doors;
    private Window[] windows;

    public House(Door[] doors, Window[] windows) {
        this.doors = doors;
        this.windows = windows;
    }

    public int getDoorCount() {
        return this.doors.length;
    }

    public int getWindowsCount() {
        return this.windows.length;
    }

    public void closeDoors() {
        for (Door door : doors) {
            door.close();
        }
    }

    public void closeWindows() {
        for (Window window : windows) {
            window.close();
        }
    }

    public void closeEverything() {
        this.closeDoors();
        this.closeWindows();
    }

    public Door[] getDoor() {
        return this.doors;
    }

    public void setDoor(Door[] door) {
        this.doors = door;
    }

    public Window[] getWindows() {
        return this.windows;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }

    public House door(Door[] door) {
        setDoor(door);
        return this;
    }

    public House windows(Window[] windows) {
        setWindows(windows);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof House)) {
            return false;
        }
        House house = (House) o;
        return Objects.equals(doors, house.doors) && Objects.equals(windows, house.windows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doors, windows);
    }

    @Override
    public String toString() {
        return "{" +
            " door='" + getDoor() + "'" +
            ", windows='" + getWindows() + "'" +
            "}";
    }

}
