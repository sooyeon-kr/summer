package com.example.summer.dbjpa;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChildService {
    ChildRepository childRepository;

    public ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    @Transactional
    public ChildRes save(ChildReq childReq) {
        Child child = childRepository.save(childReq.toEntity());
        return ChildRes.from(child);
    }
}
