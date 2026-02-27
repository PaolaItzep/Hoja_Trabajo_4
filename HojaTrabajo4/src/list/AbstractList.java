package list;

public abstract class AbstractList<T> implements List<T> {

    protected int count = 0;

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
}