package org.miaad.radarservice.repository;

import org.miaad.radarservice.entites.Radar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource
public interface RadarRepository extends JpaRepository<Radar, Long> {

}