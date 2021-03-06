package api.util

import test.BaseSpec

final class SwapSpec extends BaseSpec {
    def "swap"() {
        given:
        def actual = [1, 2] as Integer[]
        def expected = [2, 1] as Integer[]

        when:
        Swap.swap(actual, 0, 1)

        then:
        actual as int[] == expected as int[]
    }
}
