package io.grayproject.nwha.api.repository;

import io.grayproject.nwha.api.domain.ProfileTrait;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ilya Avkhimenya
 */
public interface ProfileTraitRepository extends JpaRepository<ProfileTrait, Long> {
}