package com.lucaippolito.game.developer.personal.attribute.singleTrait;

import com.lucaippolito.game.developer.personal.attribute.IAttribute;

public class Raging implements IAttribute {

    private SingleTraitType name = SingleTraitType.RAGING;

    public SingleTraitType getName() {
        return name;
    }

    @Override
    public void modifier() {
        //TODO
    }
}
