package fr.ag2rlamondiale.osp.contrat.repository;

import fr.ag2rlamondiale.osp.contrat.domain.PmEntreprise;
import java.util.UUID;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the PmEntreprise entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PmEntrepriseRepository extends JpaRepository<PmEntreprise, UUID> {}
