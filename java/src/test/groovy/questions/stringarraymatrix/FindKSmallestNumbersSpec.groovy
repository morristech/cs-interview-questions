package questions.stringarraymatrix

import questions.FindKSmallestNumbers
import spock.lang.Unroll
import test.BaseSpec

final class FindKSmallestNumbersSpec extends BaseSpec {
    @Unroll def "getSmallestNumbers(#a, #b) == '#c'"() {
        expect:
        FindKSmallestNumbers.getSmallestNumbers(a, b) == c

        where:
        a               | b || c
        [[3], [1], [2]] | 1 || [1]
        //        [[3], [1], [2]] | 3 | [1, 2, 3]
        //        [[1, 2, 3, 5],
        //         [-1, 2, 4, 5]] | 3 | [-1, 1, 2]
        //        [[-1, 0, 3],
        //         [1, 5, 6,],
        //         [-4, 5, 10]] | 5 | [-4, -1, 0, 1, 3]
    }
}
