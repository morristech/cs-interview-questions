package questions.linkedlist;

import api.Node;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class Cycle {

    public static boolean hasCycle(final Node<Integer> node) {
        if (node == null) {
            return false;
        }

        Node<Integer> first = node;
        Node<Integer> second = node;

        while (first.next != null && second.next != null) {
            first = first.next;
            second = second.next.next;

            if (first.equals(second)) {
                return true;
            }
        }

        return false;
    }
}
