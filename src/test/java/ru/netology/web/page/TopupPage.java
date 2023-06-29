package ru.netology.web.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class TopupPage {
    private SelenideElement heading= $("[data-test-id='dashboard']");

    public TopupPage() {
        heading.shouldBe(Condition.visible);
    }
    public DashboardPage transfer(String cardNumber, String amount) {
        $("[data-test-id='amount'] input").setValue(amount);
        $("[data-test-id='from'] input").setValue(cardNumber);
        $("[data-test-id='action-transfer']").click();
        return new DashboardPage();
    }
}