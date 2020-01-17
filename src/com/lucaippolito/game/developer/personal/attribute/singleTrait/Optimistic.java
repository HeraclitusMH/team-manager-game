package com.lucaippolito.game.developer.personal.attribute.singleTrait;

import com.lucaippolito.game.developer.personal.attribute.IAttribute;

public class Optimistic implements IAttribute {

    private SingleTraitType name = SingleTraitType.OPTIMISTIC;
    public SingleTraitType getName() {
        return name;
    }

    @Override
    public void modifier() {
        //TODO
    }
}
