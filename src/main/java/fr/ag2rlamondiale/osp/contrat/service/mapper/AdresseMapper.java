package fr.ag2rlamondiale.osp.contrat.service.mapper;

import fr.ag2rlamondiale.osp.contrat.domain.Adresse;
import fr.ag2rlamondiale.osp.contrat.domain.PmEntreprise;
import fr.ag2rlamondiale.osp.contrat.domain.PmEtablissement;
import fr.ag2rlamondiale.osp.contrat.service.dto.AdresseDTO;
import fr.ag2rlamondiale.osp.contrat.service.dto.PmEntrepriseDTO;
import fr.ag2rlamondiale.osp.contrat.service.dto.PmEtablissementDTO;
import java.util.Objects;
import java.util.UUID;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Adresse} and its DTO {@link AdresseDTO}.
 */
@Mapper(componentModel = "spring")
public interface AdresseMapper extends EntityMapper<AdresseDTO, Adresse> {
    @Mapping(target = "pmEntreprise", source = "pmEntreprise", qualifiedByName = "pmEntrepriseId")
    @Mapping(target = "pmEtablissement", source = "pmEtablissement", qualifiedByName = "pmEtablissementId")
    AdresseDTO toDto(Adresse s);

    @Named("pmEntrepriseId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PmEntrepriseDTO toDtoPmEntrepriseId(PmEntreprise pmEntreprise);

    @Named("pmEtablissementId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PmEtablissementDTO toDtoPmEtablissementId(PmEtablissement pmEtablissement);

    default String map(UUID value) {
        return Objects.toString(value, null);
    }
}
