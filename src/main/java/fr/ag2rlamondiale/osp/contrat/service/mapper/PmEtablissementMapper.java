package fr.ag2rlamondiale.osp.contrat.service.mapper;

import fr.ag2rlamondiale.osp.contrat.domain.DemandeXRM;
import fr.ag2rlamondiale.osp.contrat.domain.PmEtablissement;
import fr.ag2rlamondiale.osp.contrat.service.dto.DemandeXRMDTO;
import fr.ag2rlamondiale.osp.contrat.service.dto.PmEtablissementDTO;
import java.util.Objects;
import java.util.UUID;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PmEtablissement} and its DTO {@link PmEtablissementDTO}.
 */
@Mapper(componentModel = "spring")
public interface PmEtablissementMapper extends EntityMapper<PmEtablissementDTO, PmEtablissement> {
    @Mapping(target = "demandeXRM", source = "demandeXRM", qualifiedByName = "demandeXRMId")
    PmEtablissementDTO toDto(PmEtablissement s);

    @Named("demandeXRMId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DemandeXRMDTO toDtoDemandeXRMId(DemandeXRM demandeXRM);

    default String map(UUID value) {
        return Objects.toString(value, null);
    }
}
