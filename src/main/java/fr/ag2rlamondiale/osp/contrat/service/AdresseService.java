package fr.ag2rlamondiale.osp.contrat.service;

import fr.ag2rlamondiale.osp.contrat.service.dto.AdresseDTO;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Service Interface for managing {@link fr.ag2rlamondiale.osp.contrat.domain.Adresse}.
 */
public interface AdresseService {
    /**
     * Save a adresse.
     *
     * @param adresseDTO the entity to save.
     * @return the persisted entity.
     */
    AdresseDTO save(AdresseDTO adresseDTO);

    /**
     * Updates a adresse.
     *
     * @param adresseDTO the entity to update.
     * @return the persisted entity.
     */
    AdresseDTO update(AdresseDTO adresseDTO);

    /**
     * Partially updates a adresse.
     *
     * @param adresseDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<AdresseDTO> partialUpdate(AdresseDTO adresseDTO);

    /**
     * Get all the adresses.
     *
     * @return the list of entities.
     */
    List<AdresseDTO> findAll();

    /**
     * Get the "id" adresse.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AdresseDTO> findOne(UUID id);

    /**
     * Delete the "id" adresse.
     *
     * @param id the id of the entity.
     */
    void delete(UUID id);
}
