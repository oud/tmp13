package fr.ag2rlamondiale.osp.contrat.service;

import fr.ag2rlamondiale.osp.contrat.service.dto.EmailDTO;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Service Interface for managing {@link fr.ag2rlamondiale.osp.contrat.domain.Email}.
 */
public interface EmailService {
    /**
     * Save a email.
     *
     * @param emailDTO the entity to save.
     * @return the persisted entity.
     */
    EmailDTO save(EmailDTO emailDTO);

    /**
     * Updates a email.
     *
     * @param emailDTO the entity to update.
     * @return the persisted entity.
     */
    EmailDTO update(EmailDTO emailDTO);

    /**
     * Partially updates a email.
     *
     * @param emailDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<EmailDTO> partialUpdate(EmailDTO emailDTO);

    /**
     * Get all the emails.
     *
     * @return the list of entities.
     */
    List<EmailDTO> findAll();

    /**
     * Get the "id" email.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<EmailDTO> findOne(UUID id);

    /**
     * Delete the "id" email.
     *
     * @param id the id of the entity.
     */
    void delete(UUID id);
}
