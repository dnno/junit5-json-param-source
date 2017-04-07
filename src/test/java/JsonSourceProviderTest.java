import de.rpr.junit.jupiter.params.provider.JsonSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonSourceProviderTest {

  @ParameterizedTest
  @JsonSource(value = "{firstname:'Jane', lastname: 'Doe'}", type = Person.class)
  void jsonSourceTest(Person param) {
    assertAll(
        () -> assertEquals("Jane", param.firstname),
        () -> assertEquals("Doe", param.lastname));
  }

  static class Person {

    String firstname;
    String lastname;

    @Override
    public String toString() {
      return  "Person{" + "firstname='" + firstname + '\'' +", lastname='" + lastname + '\'' + '}';
    }
  }
}
