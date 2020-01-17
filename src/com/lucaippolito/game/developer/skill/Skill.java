package com.lucaippolito.game.developer.skill;

public class Skill {
    private String skillName;
    private Integer skillValue;

    public Skill(String skillName, Integer skillValue){
        this.skillName = skillName;
        setSkillValue(skillValue);
    }

    public void setSkillValue(Integer skillValue) {
        this.skillValue = skillValue;
    }

    public String getSkillName() {
        return skillName;
    }

    public Integer getSkillValue() {
        return skillValue;
    }
}
