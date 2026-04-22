// Caretaker: manages mementos
class Caretaker {
    private final java.util.List<Memento> mementoList = new java.util.ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}