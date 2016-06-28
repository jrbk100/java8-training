package course

import spock.lang.Specification

/**
 * Tests the {@link Testing} class
 */
class TestingSpec extends Specification {

  def "the first element is first"() {
    given:
    def testing = new Testing()
    expect:
    testing.getFirst() == "first"
  }
}
