package com.lucaippolito.game.developer.personal.attribute;

import java.util.List;

public abstract class AbstractPersonalAttribute {
    private List<IAttribute> attributes;

    public void addAttribute(IAttribute trait){
        attributes.add(trait);
    }

    public boolean isAttributeExist(IAttribute attribute){
        for(IAttribute singleAttribute : attributes ){
            if(singleAttribute.getName() == attribute.getName()){
                return true;
            }
        }
        return false;
    }

    public List<IAttribute> getAttributes() {
        return attributes;
    }
}
