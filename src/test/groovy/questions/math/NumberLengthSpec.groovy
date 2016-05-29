package questions.math

import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class NumberLengthSpec extends Specification {

    def "constructor"() {
        expect:
        new NumberLength() != null
    }

    def "getIntegerLength"() {
        expect:
        NumberLength.getIntegerLength(a) == b
        NumberLength.lenHelper(a) == b
        NumberLength.getIntegerLogLength(a) == b

        where:
        a          || b
        1          || 1
        12         || 2
        123        || 3
        1234       || 4
        12345      || 5
        123456     || 6
        1234567    || 7
        12345678   || 8
        123456789  || 9
        1234567890 || 10
    }
}