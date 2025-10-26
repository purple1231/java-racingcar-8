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

        List<Car> finalCars = racingCarService.playGame(inputNames, count);
        List<String> winnerNames = racingCarService.findWinners(finalCars);






    }

}