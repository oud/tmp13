package fr.ag2rlamondiale.osp.contrat.service;

import fr.ag2rlamondiale.osp.contrat.service.dto.PmEntrepriseDTO;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Service Interface for managing {@link fr.ag2rlamondiale.osp.contrat.domain.PmEntreprise}.
 */
public interface PmEntrepriseService {
    /**
     * Save a pmEntreprise.
     *
     * @param pmEntrepriseDTO the entity to save.
     * @return the persisted entity.
     */
    PmEntrepriseDTO save(PmEntrepriseDTO pmEntrepriseDTO);

    /**
     * Updates a pmEntreprise.
     *
     * @param pmEntrepriseDTO the entity to update.
     * @return the persisted entity.
     */
    PmEntrepriseDTO update(PmEntrepriseDTO pmEntrepriseDTO);

    /**
     * Partially updates a pmEntreprise.
     *
     * @param pmEntrepriseDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<PmEntrepriseDTO> partialUpdate(PmEntrepriseDTO pmEntrepriseDTO);

    /**
     * Get all the pmEntreprises.
     *
     * @return the list of entities.
     */
    List<PmEntrepriseDTO> findAll();

    /**
     * Get all the PmEntrepriseDTO where DemandeXRM is {@code null}.
     *
     * @return the {@link List} of entities.
     */
    List<PmEntrepriseDTO> findAllWhereDemandeXRMIsNull();

    /**
     * Get the "id" pmEntreprise.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<PmEntrepriseDTO> findOne(UUID id);

    /**
     * Delete the "id" pmEntreprise.
     *
     * @param id the id of the entity.
     */
    void delete(UUID id);
}
