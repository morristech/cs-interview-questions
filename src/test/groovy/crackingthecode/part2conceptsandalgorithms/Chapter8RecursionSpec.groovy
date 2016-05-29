package crackingthecode.part2conceptsandalgorithms

import api.Color
import spock.lang.Specification

import static api.Color.*

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class Chapter8RecursionSpec extends Specification {

    def "constructor"() {
        expect:
        new Chapter8Recursion() != null
    }

    def "getFibNumberRecursive"() {
        expect:
        Chapter8Recursion.getFibNumberRecursive(a) == b
        Chapter8Recursion.getFibNumberIterative(a) == b

        // 0 1 2 3 4 5 6 7
        // 0 1 1 2 3 5 8 13

        where:
        a  || b
        -5 || -1
        0  || 0
        1  || 1
        2  || 1
        3  || 2
        4  || 3
        5  || 5
        6  || 8
        7  || 13
    }

    def "getSubsets"() {
        expect:
        Chapter8Recursion.getSubsets(a, 0) == b

        where:
        a      || b
        null   || null
        [0]    || [[], [0]]
        [1, 2] || [[], [2], [1], [2, 1]]
    }

    def "getStringPermutations"() {
        expect:
        Chapter8Recursion.getStringPermutations("", a) == b

        where:
        a     || b
//        null  || null
//        ""    || [""]
        "abc" || ["abc", "acb", "bca", "bac", "cab", "cba"]
    }

    def "getValidParentheses"() {
        expect:
        Chapter8Recursion.getValidParentheses(a, 0, 0, "") == b

        where:
        a  || b
        -1 || null
        0  || null
        3  || ["((()))", "(()())", "(())()", "()(())", "()()()"]
    }

    def "paintFill"() {
        given:
        Color[][] a = [[RED, RED, GREEN, GREEN, GREEN],
                       [GREEN, RED, RED, GREEN, GREEN],
                       [GREEN, GREEN, RED, RED, GREEN],
                       [GREEN, GREEN, GREEN, RED, RED],
                       [GREEN, GREEN, GREEN, GREEN, RED]]

        when:
        Chapter8Recursion.paintFill(a, 0, 0, BLUE)

        then:
        a == [[BLUE, BLUE, GREEN, GREEN, GREEN],
              [GREEN, BLUE, BLUE, GREEN, GREEN],
              [GREEN, GREEN, BLUE, BLUE, GREEN],
              [GREEN, GREEN, GREEN, BLUE, BLUE],
              [GREEN, GREEN, GREEN, GREEN, BLUE]]
    }

    def "floodFill"() {
        given:
        int[][] a = [[1, 1, 1, 1, 1, 1, 1, 1],
                     [1, 1, 1, 1, 1, 1, 0, 0],
                     [1, 0, 0, 1, 1, 0, 1, 1],
                     [1, 2, 2, 2, 2, 0, 1, 0],
                     [1, 1, 1, 2, 2, 0, 1, 0],
                     [1, 1, 1, 2, 2, 2, 2, 0],
                     [1, 1, 1, 1, 1, 2, 1, 1],
                     [1, 1, 1, 1, 1, 2, 2, 1]]
        int x = 4
        int y = 4
        int newC = 3

        when:
        Chapter8Recursion.floodFill(a, x, y, newC)

        then:
        a == [[1, 1, 1, 1, 1, 1, 1, 1],
              [1, 1, 1, 1, 1, 1, 0, 0],
              [1, 0, 0, 1, 1, 0, 1, 1],
              [1, 3, 3, 3, 3, 0, 1, 0],
              [1, 1, 1, 3, 3, 0, 1, 0],
              [1, 1, 1, 3, 3, 3, 3, 0],
              [1, 1, 1, 1, 1, 3, 1, 1],
              [1, 1, 1, 1, 1, 3, 3, 1]]
    }

    def "getRepresentCents"() {
        expect:
        // starting with quarters
        Chapter8Recursion.getRepresentCents(a as int, 25) == b
        Chapter8Recursion.makeChange(a as int, 25) == b

        where:
        a    || b
        1000 || 142511
        100  || 242
        10   || 4
        1    || 1
    }
}