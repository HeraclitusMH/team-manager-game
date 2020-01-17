package com.lucaippolito.game.developer.skill;

import com.lucaippolito.game.developer.skill.soft.SoftSkill;
import com.lucaippolito.game.developer.skill.technical.TechnicalSkill;

import java.util.HashMap;
import java.util.Map;

public class SkillMap {
    Map<TechnicalSkill,Integer> technicalSkillMap;
    Map<SoftSkill,Integer> softSkillMap;

    public SkillMap(){
       this.technicalSkillMap = new HashMap<>();
       this.softSkillMap = new HashMap<>();
    }

    public SkillMap(HashMap<TechnicalSkill,Integer> programmingMap,HashMap<SoftSkill,Integer> softSkillMap){
        this.technicalSkillMap = programmingMap;
        this.softSkillMap = softSkillMap;
    }
}
