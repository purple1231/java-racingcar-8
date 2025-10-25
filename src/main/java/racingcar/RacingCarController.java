package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.List;

public class RacingCarController {

    private final RacingCarService racingCarService = new RacingCarService();

    public void run(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputNames = Console.readLine();

        System.out.println("시도할 횟수는 몇 회인가요?");
        int tryCount = Integer.parseInt(Console.readLine());


        System.out.println("\n실행 결과");


        //List<Car> cars = racingCarService.








    }


}






//| 계층                 | 역할            | 포함되는 작업                                      | 비유                      |
//        | ------------------ | ------------- | -------------------------------------------- | ----------------------- |
//        | **Controller**     | 입력 받고, 결과 출력  | `Console.readLine()`, `System.out.println()` | 안내 데스크 직원               |
//        | **Service**        | 게임의 전반적 흐름 제어 | 자동차 생성, 반복 진행, 우승자 계산                        | 경기 운영 매니저               |
//        | **Domain (Car 등)** | 실제 데이터와 행동 담당 | `move()`, `getPosition()`                    | 실제 경주하는 자동차             |
//        | **Strategy**       | 이동 판단 로직 분리   | 랜덤 0~9 → 4 이상일 때 전진                          | 심판(“움직여도 된다 / 안 된다” 판단) |
