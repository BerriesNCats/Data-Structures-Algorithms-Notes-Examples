

package CollectionsFramework.OverrideAndEquals;

import java.util.Objects;

public class Money {

    int amount;
    String currencyCode;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Money)) return false;
        Money money = (Money) object;
        boolean currencyCodeEquals = (this.getCurrencyCode() == null && money.getCurrencyCode() == null) ||
                (this.getCurrencyCode() != null && this.getCurrencyCode().equals(money.getCurrencyCode()));

        return this.getAmount() == money.getAmount() && currencyCodeEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount(), getCurrencyCode());
    }

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
}
