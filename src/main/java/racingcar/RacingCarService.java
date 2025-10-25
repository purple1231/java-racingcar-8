package racingcar;

import racingcar.domain.Car;
import racingcar.domain.randomOrNot.MoveStrategy;

import java.util.ArrayList;
import java.util.List;

public class RacingCarService {

    public List<Car> createCars(String input, MoveStrategy moveStrategy){
        input = input.trim();

        String[] names = input.split(",");
        List<Car> cars = new ArrayList<>();

        for(String name: names){
            //혹시 모르니 trim 한번 더
            String trimmed = name.trim();
            if(!trimmed.isEmpty()){
                cars.add(new Car(trimmed, moveStrategy));
            }
        }
        return cars;
    }


    //
    public void playGame(List<Car> cars, int tryCount){
        for(int i = 0; i < tryCount; i++){
            loopRound(cars);
            printRound(cars);
        }
    }

    //라운드 루프 반복
    private void loopRound(List<Car> cars){
        for (Car car : cars){
            car.move();
        }
    }

    // 라운드 결과 출력
    private void printRound(List<Car> cars){
        for (Car car : cars){
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }


    private List<String> findWinners(List<Car> cars){

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
