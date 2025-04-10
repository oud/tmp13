package fr.ag2rlamondiale.osp.contrat.repository;

import fr.ag2rlamondiale.osp.contrat.domain.PmEtablissement;
import java.util.UUID;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the PmEtablissement entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PmEtablissementRepository extends JpaRepository<PmEtablissement, UUID> {}
