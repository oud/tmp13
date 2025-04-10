package fr.ag2rlamondiale.osp.contrat.service.mapper;

import fr.ag2rlamondiale.osp.contrat.domain.PmEntreprise;
import fr.ag2rlamondiale.osp.contrat.service.dto.PmEntrepriseDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PmEntreprise} and its DTO {@link PmEntrepriseDTO}.
 */
@Mapper(componentModel = "spring")
public interface PmEntrepriseMapper extends EntityMapper<PmEntrepriseDTO, PmEntreprise> {}
