package com.example.service;


import com.example.model.Skill;

import java.util.List;

public interface SkillService {

    List<Skill> findAll();

    Skill save(Skill skill);

    Skill findById(Integer id);

    void deleteById(Integer id);
}
