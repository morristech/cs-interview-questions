package leetcode;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string
 */
public final class Problem151ReverseWordsInAString {
    public String reverseWords(String s) {
        if (s == null) {
            return "";
        }

        s = s.trim();

        if (s.isEmpty()) {
            return s;
        }

        final String[] sentence = s.split("\\s+", -1);
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0, j = sentence.length - 1; i < j; i++, j--) {
            swap(sentence, i, j);
        }

        for (String word : sentence) {
            stringBuilder.append(word);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString().trim();
    }

    private void swap(String[] array, int left, int right) {
        final String temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
