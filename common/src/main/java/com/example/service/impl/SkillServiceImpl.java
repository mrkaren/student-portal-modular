package com.example.service.impl;

import com.example.model.Skill;
import com.example.repository.SkillRepository;
import com.example.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;

    @Override
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    @Override
    public Skill save(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Skill findById(Integer id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        skillRepository.deleteById(id);
    }
}
