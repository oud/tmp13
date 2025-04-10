package fr.ag2rlamondiale.osp.contrat.service.mapper;

import fr.ag2rlamondiale.osp.contrat.domain.MiseEnGestion;
import fr.ag2rlamondiale.osp.contrat.service.dto.MiseEnGestionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link MiseEnGestion} and its DTO {@link MiseEnGestionDTO}.
 */
@Mapper(componentModel = "spring")
public interface MiseEnGestionMapper extends EntityMapper<MiseEnGestionDTO, MiseEnGestion> {}
