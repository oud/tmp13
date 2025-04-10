package fr.ag2rlamondiale.osp.contrat.service;

import fr.ag2rlamondiale.osp.contrat.service.dto.TelephoneDTO;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Service Interface for managing {@link fr.ag2rlamondiale.osp.contrat.domain.Telephone}.
 */
public interface TelephoneService {
    /**
     * Save a telephone.
     *
     * @param telephoneDTO the entity to save.
     * @return the persisted entity.
     */
    TelephoneDTO save(TelephoneDTO telephoneDTO);

    /**
     * Updates a telephone.
     *
     * @param telephoneDTO the entity to update.
     * @return the persisted entity.
     */
    TelephoneDTO update(TelephoneDTO telephoneDTO);

    /**
     * Partially updates a telephone.
     *
     * @param telephoneDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<TelephoneDTO> partialUpdate(TelephoneDTO telephoneDTO);

    /**
     * Get all the telephones.
     *
     * @return the list of entities.
     */
    List<TelephoneDTO> findAll();

    /**
     * Get the "id" telephone.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TelephoneDTO> findOne(UUID id);

    /**
     * Delete the "id" telephone.
     *
     * @param id the id of the entity.
     */
    void delete(UUID id);
}
