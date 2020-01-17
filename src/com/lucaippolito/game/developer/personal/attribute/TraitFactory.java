package com.lucaippolito.game.developer.personal.attribute;

import com.lucaippolito.game.developer.personal.attribute.singleTrait.Optimistic;
import com.lucaippolito.game.developer.personal.attribute.singleTrait.Raging;
import com.lucaippolito.game.developer.personal.attribute.singleTrait.SingleTraitType;

public class TraitFactory extends AbstractAttributeFactory{

    public IAttribute createRagingTrait(){
        return new Raging();
    }
    public IAttribute createOptimisticTrait(){
        return new Optimistic();
    }

    @Override
    public IAttribute enumToTrait(SingleTraitType singleTrait) {
        switch (singleTrait.){
            case SingleTraitType.RAGING:
                return createRagingTrait();
            case SingleTraitType.OPTIMISTIC:
                return createOptimisticTrait();
            default:
                return null;
        }
    }
}
