package fr.ag2rlamondiale.osp.contrat.service;

import fr.ag2rlamondiale.osp.contrat.service.dto.PmEtablissementDTO;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Service Interface for managing {@link fr.ag2rlamondiale.osp.contrat.domain.PmEtablissement}.
 */
public interface PmEtablissementService {
    /**
     * Save a pmEtablissement.
     *
     * @param pmEtablissementDTO the entity to save.
     * @return the persisted entity.
     */
    PmEtablissementDTO save(PmEtablissementDTO pmEtablissementDTO);

    /**
     * Updates a pmEtablissement.
     *
     * @param pmEtablissementDTO the entity to update.
     * @return the persisted entity.
     */
    PmEtablissementDTO update(PmEtablissementDTO pmEtablissementDTO);

    /**
     * Partially updates a pmEtablissement.
     *
     * @param pmEtablissementDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<PmEtablissementDTO> partialUpdate(PmEtablissementDTO pmEtablissementDTO);

    /**
     * Get all the pmEtablissements.
     *
     * @return the list of entities.
     */
    List<PmEtablissementDTO> findAll();

    /**
     * Get the "id" pmEtablissement.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<PmEtablissementDTO> findOne(UUID id);

    /**
     * Delete the "id" pmEtablissement.
     *
     * @param id the id of the entity.
     */
    void delete(UUID id);
}
