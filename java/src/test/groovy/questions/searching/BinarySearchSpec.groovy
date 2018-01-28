package questions.searching

import questions.BinarySearch
import spock.lang.Unroll
import test.BaseSpec

final class BinarySearchSpec extends BaseSpec {
    @Unroll def "search(#a, #b) == '#c'"() {
        expect:
        BinarySearch.search(a as int[], b) == c

        where:
        a                                                       | b || c
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16] | 8 || 7
        [1, 2, 3]                                               | 0 || -1
    }
}