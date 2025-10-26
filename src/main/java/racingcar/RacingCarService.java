package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.utils.Parse;
import racingcar.validator.RacingCarValidator;

import java.util.ArrayList;
import java.util.List;

public class RacingCarService {
    private final RacingCarValidator validator = new RacingCarValidator();
    private final Parse parser = new Parse();



    public List<Car> createCars(String input) {
        validator.validateCarName(input);
        return parser.parseCars(input);
    }



    public void playGame(List<Car> cars){

        for (Car car : cars) {
            int randomNumber = getRandomCount();
            car.move(randomNumber);
        }
    }

    private int getRandomCount(){
        return Randoms.pickNumberInRange(0, 9);
    }


    public List<String> findWinners(List<Car> cars){

        int max = findMaxPosition(cars);

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == max) {
                winners.add(car.getName());
            }
        }
        return winners;

    }
    private int findMaxPosition(List<Car> cars){
        int max = 0;
        for(Car car:cars){
            if(car.getPosition() > max){
                max = car.getPosition();
            }
        }
        return max;
    }



}
