package racingcar.view;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingCarOutputView {

    public void printResultMessage(){
        System.out.println("\n실행 결과");
    }

    public void printRoundStatus(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println(); // 라운드 구분을 위한 빈 줄
    }


    public void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }

}
