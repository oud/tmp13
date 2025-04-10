package fr.ag2rlamondiale.osp.contrat.service.mapper;

import fr.ag2rlamondiale.osp.contrat.domain.DemandeXRM;
import fr.ag2rlamondiale.osp.contrat.domain.MiseEnGestion;
import fr.ag2rlamondiale.osp.contrat.domain.PmEntreprise;
import fr.ag2rlamondiale.osp.contrat.service.dto.DemandeXRMDTO;
import fr.ag2rlamondiale.osp.contrat.service.dto.MiseEnGestionDTO;
import fr.ag2rlamondiale.osp.contrat.service.dto.PmEntrepriseDTO;
import java.util.Objects;
import java.util.UUID;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DemandeXRM} and its DTO {@link DemandeXRMDTO}.
 */
@Mapper(componentModel = "spring")
public interface DemandeXRMMapper extends EntityMapper<DemandeXRMDTO, DemandeXRM> {
    @Mapping(target = "pmEntreprise", source = "pmEntreprise", qualifiedByName = "pmEntrepriseId")
    @Mapping(target = "miseEnGestion", source = "miseEnGestion", qualifiedByName = "miseEnGestionId")
    DemandeXRMDTO toDto(DemandeXRM s);

    @Named("pmEntrepriseId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PmEntrepriseDTO toDtoPmEntrepriseId(PmEntreprise pmEntreprise);

    @Named("miseEnGestionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    MiseEnGestionDTO toDtoMiseEnGestionId(MiseEnGestion miseEnGestion);

    default String map(UUID value) {
        return Objects.toString(value, null);
    }
}
