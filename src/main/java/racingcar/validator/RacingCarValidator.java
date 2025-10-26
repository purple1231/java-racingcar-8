package racingcar.validator;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RacingCarValidator {
    private static final int MAX_NAME_LENGTH = 5;


    public void validateCarName(String input){
        if(input == null || input.isBlank()){
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }

        String[] names = input.split(",");
        Set<String> uniqueNames = new HashSet<>();

        for(String name: names){
            //혹시 모르니 trim 한번 더
            String trimmed = name.trim();
            if(trimmed.length() > MAX_NAME_LENGTH){
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
            if(trimmed.isEmpty()){
                throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
            }
            if (!uniqueNames.add(trimmed)) {
                throw new IllegalArgumentException("자동차 이름은 중복될 수 없습니다.");
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

