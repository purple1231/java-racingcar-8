package racingcar.domain;

import racingcar.domain.randomOrNot.MoveStrategy;

public class Car {

    private final String name;
    private int position = 0;
    private final MoveStrategy moveStrategy;


    public Car(String name, MoveStrategy moveStrategy){
        validateName(name);
        this.name = name;
        this.moveStrategy = moveStrategy;

    }

    private void validateName(String name){
        if(name == null || name.length() > 5){
            throw new IllegalArgumentException("자동차 이름은 1~5자 이내여야 합니다.");
        }
    }

    public void move() {
        if (moveStrategy.canMove()) {
            position++;
        }
    }


    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
