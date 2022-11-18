package com.eya.Voitures.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.eya.Voitures.entities.Categorie;
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}

