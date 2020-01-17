package com.lucaippolito.game.developer.personal.attribute.psychological.status.single.status;

import com.lucaippolito.game.developer.personal.attribute.IAttribute;
import com.lucaippolito.game.developer.personal.attribute.psychological.status.SinglePsychologicalStatus;

public class Tense implements IAttribute {

    private SinglePsychologicalStatus name = SinglePsychologicalStatus.TENSE;

    public SinglePsychologicalStatus getName() { return name; }

    @Override
    public void modifier() {
    }
}
