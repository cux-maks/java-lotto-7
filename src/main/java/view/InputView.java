package view;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import validator.LottoValidator;

public class InputView {
    public static Integer inputCost() {
        String cost = Console.readLine();

        Integer parsedCost = LottoValidator.isNumber(cost);

        return LottoValidator.isDivisibleByThousand(parsedCost);
    }

    public static List<Integer> inputWinningNumbers() {
        String numbers = Console.readLine();

        List<Integer> parsedNumbers = LottoValidator.isParseableString(numbers);

        return LottoValidator.hasSixElements(parsedNumbers);
    }

    public static Integer inputBonusNumber() {
        String bonusNumber = Console.readLine();

        Integer parsedBonusNumber = LottoValidator.isNumber(bonusNumber);

        return LottoValidator.isInLottoRange(parsedBonusNumber);

    }
}
