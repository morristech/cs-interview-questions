package api

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class TupleSpec extends Specification {

    def sut = new Tuple<>("test", 123)

    def "getLeft"() {
        expect:
        sut.getLeft() == "test"
    }

    def "getRight"() {
        expect:
        sut.getRight() == 123
    }

    def "equals/hashcode"() {
        when:
        EqualsVerifier.forClass(Tuple.class)
                .withPrefabValues(Tuple.class, new Tuple<>(1, 2), new Tuple<>(3, 4))
                .suppress(Warning.NONFINAL_FIELDS)
                .verify()

        then:
        noExceptionThrown()
    }

    def "string"() {
        given:
        def actual = sut.toString()
        def expected = "Tuple{mLeft=test, mRight=123}"

        expect:
        actual == expected
    }
}
