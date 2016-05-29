package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Node<T> {

    public T value;
    public Node<T> next;
    public Node<T> previous;

    public Node() {
    }

    public Node(final T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Node<?> node = (Node<?>) o;

        if (value != null ? !value.equals(node.value) : node.value != null) {
            return false;
        }

        if (next != null ? !next.equals(node.next) : node.next != null) {
            return false;
        }

        return previous != null ? previous.equals(node.previous) : node.previous == null;

    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        result = 31 * result + (previous != null ? previous.hashCode() : 0);
        return result;
    }
}