package ddd.domaindrivendesign.vo;

import lombok.Getter;

import java.text.MessageFormat;

@Getter
public class Money {

    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {

        if (currency == null) throw new IllegalArgumentException("단위를 적어주세요.");

        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money arg) {
        if (arg == null) throw new IllegalArgumentException("더할 가격을 적어주세요");
        if (!currency.equals(arg.currency)) {
            throw new IllegalArgumentException(MessageFormat.format("화폐 단위가 다릅니다. this : {0} arg.currency : {1}", currency, arg.currency));
        }
        return new Money(amount + arg.amount, currency);
    }
}
