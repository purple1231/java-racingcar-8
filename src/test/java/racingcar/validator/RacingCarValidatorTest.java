package racingcar.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RacingCarValidatorTest {

    private final RacingCarValidator validator = new RacingCarValidator();

    @Test
    @DisplayName("자동차 이름이 5자를 초과할 때 예외를 발생시키는지 테스트")
    void 자동차이름_초과() {

        String input = "pobi,helloworld";

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateCarName(input);
        });
    }

    @Test
    @DisplayName("자동차 이름이 5자를 초과할 때 예외를 발생시키는지 테스트")
    void 숫자가_아닐시() {

        String input = "three";

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateTryCount(input);
        });
    }
  
}