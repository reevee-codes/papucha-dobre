package com.papuzki.papuchaservice.repository;

import com.papuzki.papuchaservice.model.Papuga;
import org.springframework.data.jpa.repository.JpaRepository;

interface PapugaRepository extends JpaRepository<Papuga, Long> {

}