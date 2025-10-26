package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("자동차가 4 이상일때 전진하는지")
    void 자동차4이상() {
        Car car = new Car("pobi");
        car.move(4);


        assertEquals(1, car.getPosition());
    }

    @Test
    @DisplayName("자동차가 3 이하일때 멈추는지")
    void 자동차3이하() {
        Car car = new Car("woni");
        car.move(3);


        assertEquals(0, car.getPosition());
    }

}