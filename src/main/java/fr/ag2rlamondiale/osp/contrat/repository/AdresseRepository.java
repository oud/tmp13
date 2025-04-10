package fr.ag2rlamondiale.osp.contrat.repository;

import fr.ag2rlamondiale.osp.contrat.domain.Adresse;
import java.util.UUID;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Adresse entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AdresseRepository extends JpaRepository<Adresse, UUID> {}
