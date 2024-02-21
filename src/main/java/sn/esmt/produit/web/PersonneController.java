package sn.esmt.produit.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.produit.entity.PersonneEntity;
import sn.esmt.produit.service.PersonneService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@AllArgsConstructor
public class PersonneController {
  private PersonneService personneService;
  @PostMapping
  public PersonneEntity save(PersonneEntity personneEntity){
    return personneService.save(personneEntity);
  }
  @GetMapping
  public List<PersonneEntity> all(){
    return personneService.getAll().get();
  }

  @PutMapping
  public PersonneEntity update(String nom,PersonneEntity personneEntity){
    return personneService.update(nom,personneEntity);
  }

  @DeleteMapping
  public void delete(String nom){
    personneService.get(nom);
  }
  @GetMapping("/nom")
  public Optional<PersonneEntity> get(String nom){
    return personneService.get(nom);
  }

}
