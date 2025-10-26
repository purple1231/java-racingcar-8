package racingcar.utils;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Parse {
    public List<Car> parseCars(String input){
        input = input.trim();

        String[] names = input.split(",");
        List<Car> cars = new ArrayList<>();

        for(String name: names){
            //혹시 모르니 trim 한번 더
            String trimmed = name.trim();
            if(!trimmed.isEmpty()){
                cars.add(new Car(trimmed));
            }
        }
        return cars;
    }


}
