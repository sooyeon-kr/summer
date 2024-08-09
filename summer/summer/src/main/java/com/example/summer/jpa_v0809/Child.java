package com.example.summer.jpa_v0809;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Entity
public class Child {
    @Id
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name="parent_id")
    private Parent parent;

    public Child(int id, String name, Parent parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Parent getParent() {
        return parent;
    }

    public Child() {

    }
}

@RestController
class ChildController {
    private final ChildService childService;
    private final ParentService parentService;

    public ChildController(ChildService childService, ParentService parentService) {
        this.childService = childService;
        this.parentService = parentService;
    }

    @PostMapping("/child")
    public void saveChild() {
        Parent parent = new Parent("parent2", "parent2");
        parentService.save(parent);

        Child child = new Child(2, "child2", parent);
        childService.save(child);

        child = new Child(3, "child2", parent);
        childService.save(child);

        child = new Child(4, "child2", parent);
        childService.save(child);
    }

    @GetMapping("child/{id}")
    public Child getChild(@PathVariable int id) {
        Child child = childService.getChild(id);
        return child;
    }




}

@Service
class ChildService {

    private final ChildRepository childRepository;


    @Autowired
    ChildService(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }


    @Transactional
    public void save(Child child) {
        childRepository.save(child);
    }

    public Child getChild(int id) {
        return childRepository.findById(id).orElseThrow();
    }
}


interface ChildRepository extends JpaRepository<Child, Integer> {

}
