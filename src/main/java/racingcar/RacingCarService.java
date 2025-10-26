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

    private final List<List<Integer>> roundPositions = new ArrayList<>();




    public List<Car> playGame(String input, int tryCount){

        List<Car> cars = createCars(input);

        for(int i = 0; i < tryCount; i++){
            loopRound(cars);
            saveRoundPositions(cars);
        }
        return cars;
    }
    public List<Car> createCars(String input) {

        validator.validateCarName(input);
        List<Car> cars = parser.parseCars(input);
        return cars;
    }




    //라운드 루프 반복
    private void loopRound(List<Car> cars){
        for (Car car : cars){

            int count = getRandomCount();
            car.move(count);
        }
    }

    private int getRandomCount(){
        return Randoms.pickNumberInRange(0, 9);
    }





    private void saveRoundPositions(List<Car> cars){
        List<Integer> positions = new ArrayList<>();
        for (Car car : cars) {
            positions.add(car.getPosition());
        }
        roundPositions.add(positions);
    }

    public List<List<Integer>> getRoundPositions(){
        return roundPositions;
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
