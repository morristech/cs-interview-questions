package api;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class Pair<Left, Right> {

    private final Left left;
    private final Right right;

    public Pair(final Left left, final Right right) {
        this.left = left;
        this.right = right;
    }

    public Left getLeft() {
        return left;
    }

    public Right getRight() {
        return right;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final Pair<?, ?> pair = (Pair<?, ?>) object;

        if (left != null ? !left.equals(pair.left) : pair.left != null) {
            return false;
        }

        return right != null ? right.equals(pair.right) : pair.right == null;
    }

    @Override
    public int hashCode() {
        int result = left != null ? left.hashCode() : 0;
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pair{"
            + "left=" + left
            + ", right=" + right
            + '}';
    }

}
