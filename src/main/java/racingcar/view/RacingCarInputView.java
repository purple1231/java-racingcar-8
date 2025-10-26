package racingcar.view;
import camp.nextstep.edu.missionutils.Console;

public class RacingCarInputView {

    public String readCarNames(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputNames = Console.readLine();
        return inputNames;
    }

    public int readTryCount(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        int tryCount = Integer.parseInt(Console.readLine());
        return tryCount;
    }



}
