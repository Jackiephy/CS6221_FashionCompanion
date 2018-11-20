package org.fashion.main.repository;

import java.util.List;
import java.util.Map;

import org.fashion.main.domain.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothesRepository extends JpaRepository<Clothes, Long>{

}
