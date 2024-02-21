package sn.esmt.produit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "personne")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonneEntity {
  @Id
  @Column(name = "reference" , length = 15)
  private String ref;
  @Column(name = "nom",length = 150,nullable = false)
  private String nom;
  @Column(name ="quantite_stock")
  private double qtStock;
}
