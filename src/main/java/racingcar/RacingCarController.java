package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.view.RacingCarInputView;
import racingcar.view.RacingCarOutputView;

import java.util.List;

public class RacingCarController {

    private final RacingCarService racingCarService = new RacingCarService();
    private final RacingCarInputView racingCarInputView = new RacingCarInputView();
    private final RacingCarOutputView racingCarOutputView = new RacingCarOutputView();


    public void run(){

        String inputNames = racingCarInputView.readCarNames();
        int count = racingCarInputView.readTryCount();

        racingCarOutputView.printResultMessage();

        List<Car> cars = racingCarService.createCars(inputNames);


        for(int i = 0; i < count; i++){
            racingCarService.playGame(cars);
            racingCarOutputView.printRoundStatus(cars);
        }


        List<String> winnerNames = racingCarService.findWinners(cars);
        racingCarOutputView.printWinners(winnerNames);
    }

}