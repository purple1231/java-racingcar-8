package racingcar.validator;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingCarValidator {


    public void validateCarName(String input){
        if(input == null || input.isBlank()){
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }

        String[] names = input.split(",");
        List<Car> cars = new ArrayList<>();

        for(String name: names){
            //혹시 모르니 trim 한번 더
            String trimmed = name.trim();
            if(!trimmed.isEmpty()){
                cars.add(new Car(trimmed));
            }
        }
    }


    public void validateTryCount(String input){
        try {
            int count = Integer.parseInt(input);
            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
            }

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }




}

