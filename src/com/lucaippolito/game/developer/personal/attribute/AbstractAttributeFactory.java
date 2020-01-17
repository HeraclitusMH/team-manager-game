package com.lucaippolito.game.developer.personal.attribute;

import java.util.List;

public abstract class AbstractAttributeFactory {

    public void createAttributes(List<IAttribute> personalAttributesList, List<IAttribute> attributesToAdd){
        for(IAttribute singleAttribute : attributesToAdd){
            personalAttributesList.add(enumToTrait(singleAttribute));
        }
    }

    public abstract IAttribute enumToTrait(IAttribute singleTrait);
}
