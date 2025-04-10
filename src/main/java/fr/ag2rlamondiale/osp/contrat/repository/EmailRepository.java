package fr.ag2rlamondiale.osp.contrat.repository;

import fr.ag2rlamondiale.osp.contrat.domain.Email;
import java.util.UUID;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Email entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmailRepository extends JpaRepository<Email, UUID> {}
