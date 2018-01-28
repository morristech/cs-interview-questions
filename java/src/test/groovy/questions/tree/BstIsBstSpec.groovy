package questions.tree

import api.TreeNode
import spock.lang.Unroll
import test.BaseSpec

final class BstIsBstSpec extends BaseSpec {
    @Unroll def "isBst(#a) == '#b'"() {
        expect:
        BstIsBst.isBst(a) == b

        where:
        a               || b
        null            || true
        balancedTreeBST || true
    }

    @Unroll def "isBst2(#a, #b, #c) == '#d'"() {
        expect:
        BstIsBst.isBst(a as TreeNode<Integer>, b as Double, c as Double) == d

        where:
        a               | b                        | c                        || d
        null            | Double.NEGATIVE_INFINITY | Double.POSITIVE_INFINITY || true
        balancedTreeBST | Double.NEGATIVE_INFINITY | Double.POSITIVE_INFINITY || true
    }
}