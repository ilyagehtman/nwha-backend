package io.grayproject.nwha.api.repository;

import io.grayproject.nwha.api.domain.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ilya Avkhimenya
 */
public interface ThingRepository extends JpaRepository<Thing, Long> {

}