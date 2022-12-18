package net.kelompok3.springboot.crudrestfulwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.kelompok3.springboot.crudrestfulwebservice.model.kelompok3;

@Repository
public interface Kelompok3Repository extends JpaRepository<kelompok3, Long>{

}
