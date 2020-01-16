package com.lucaippolito.game.skill;

import com.lucaippolito.game.soft.skill.SoftSkill;
import com.lucaippolito.game.technical.skill.ProgrammingLanguages;

import java.util.HashMap;
import java.util.Map;

public class SkillMap {
    Map<ProgrammingLanguages,Integer> programmingMap;
    Map<SoftSkill,Integer> softSkillMap;

    public SkillMap(){
       this.programmingMap = new HashMap<>();
       this.softSkillMap = new HashMap<>();
    }

    public SkillMap(HashMap<ProgrammingLanguages,Integer> programmingMap,HashMap<SoftSkill,Integer> softSkillMap){
        this.programmingMap = programmingMap;
        this.softSkillMap = softSkillMap;
    }
}
