package com.example.summer.jpa_v0809;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Entity
public class Parent {
    @Id
    String id;
    String name;

//    String accountNumber; // account_number

    @OneToMany(mappedBy = "parent")
    @JsonIgnoreProperties("parent") // 다음 Child보니까 또 있어, 그러면 그건 끊기
    List<Child> children;
    public Parent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Child> getChildren() {
        return children;
    }


    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    // Q. 기본 생성자가 필요한 이유?
    public Parent() {
    }
}

@RestController
class ParentController {

    ParentService parentService;

    @Autowired
    ParentController(ParentService parentService) {
        this.parentService = parentService;
    }

    @GetMapping("parent/{id}")
    public Parent getParent(@PathVariable String id) {
        return parentService.getParent(id);
    }

}

@Service
class ParentService {

    private final ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    @Transactional
    public void save(Parent parent) {
        parentRepository.save(parent);
    }

    public Parent getParent(String id) {
        return parentRepository.findById(id).orElseThrow();
    }

    // Excutor
    public Parent findParentByName(String name) {
        return parentRepository.findByName(name).orElseThrow();
    }
}

interface ParentRepository extends JpaRepository<Parent, String> {
    Optional<Parent> findByName(String Name);
}
