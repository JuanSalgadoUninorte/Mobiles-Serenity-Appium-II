package co.com.choucair.questions;

import co.com.choucair.model.DataModel;
import co.com.choucair.ui.FistPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LastResponse implements Question<Boolean> {

    private DataModel dataModel;

    public LastResponse(DataModel dataModel) {
        this.dataModel = dataModel;
    }

    public static LastResponse lastResponseConfirmation(DataModel dataModel) {
        return new LastResponse(dataModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(FistPage.LBL_CONFIRMATION, isVisible()).forNoMoreThan(60).seconds();
        String message = Text.of(FistPage.LBL_CONFIRMATION).answeredBy(actor).toString();
        return message.equals(dataModel.getMessage());
    }
}
