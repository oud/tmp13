package fr.ag2rlamondiale.osp.contrat.service.impl;

import fr.ag2rlamondiale.osp.contrat.domain.Email;
import fr.ag2rlamondiale.osp.contrat.repository.EmailRepository;
import fr.ag2rlamondiale.osp.contrat.service.EmailService;
import fr.ag2rlamondiale.osp.contrat.service.dto.EmailDTO;
import fr.ag2rlamondiale.osp.contrat.service.mapper.EmailMapper;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link fr.ag2rlamondiale.osp.contrat.domain.Email}.
 */
@Service
@Transactional
public class EmailServiceImpl implements EmailService {

    private static final Logger LOG = LoggerFactory.getLogger(EmailServiceImpl.class);

    private final EmailRepository emailRepository;

    private final EmailMapper emailMapper;

    public EmailServiceImpl(EmailRepository emailRepository, EmailMapper emailMapper) {
        this.emailRepository = emailRepository;
        this.emailMapper = emailMapper;
    }

    @Override
    public EmailDTO save(EmailDTO emailDTO) {
        LOG.debug("Request to save Email : {}", emailDTO);
        Email email = emailMapper.toEntity(emailDTO);
        email = emailRepository.save(email);
        return emailMapper.toDto(email);
    }

    @Override
    public EmailDTO update(EmailDTO emailDTO) {
        LOG.debug("Request to update Email : {}", emailDTO);
        Email email = emailMapper.toEntity(emailDTO);
        email = emailRepository.save(email);
        return emailMapper.toDto(email);
    }

    @Override
    public Optional<EmailDTO> partialUpdate(EmailDTO emailDTO) {
        LOG.debug("Request to partially update Email : {}", emailDTO);

        return emailRepository
            .findById(emailDTO.getId())
            .map(existingEmail -> {
                emailMapper.partialUpdate(existingEmail, emailDTO);

                return existingEmail;
            })
            .map(emailRepository::save)
            .map(emailMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmailDTO> findAll() {
        LOG.debug("Request to get all Emails");
        return emailRepository.findAll().stream().map(emailMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EmailDTO> findOne(UUID id) {
        LOG.debug("Request to get Email : {}", id);
        return emailRepository.findById(id).map(emailMapper::toDto);
    }

    @Override
    public void delete(UUID id) {
        LOG.debug("Request to delete Email : {}", id);
        emailRepository.deleteById(id);
    }
}
