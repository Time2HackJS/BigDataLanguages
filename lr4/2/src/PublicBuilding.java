abstract class PublicBuilding implements IBuilding {
    protected int capacity;

    PublicBuilding(int capacity) {
        this.capacity = capacity;
    }

    int getCapacity() {
        return this.capacity;
    }
}
