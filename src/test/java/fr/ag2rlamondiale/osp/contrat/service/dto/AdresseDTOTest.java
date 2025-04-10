package fr.ag2rlamondiale.osp.contrat.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import fr.ag2rlamondiale.osp.contrat.web.rest.TestUtil;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class AdresseDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(AdresseDTO.class);
        AdresseDTO adresseDTO1 = new AdresseDTO();
        adresseDTO1.setId(UUID.randomUUID());
        AdresseDTO adresseDTO2 = new AdresseDTO();
        assertThat(adresseDTO1).isNotEqualTo(adresseDTO2);
        adresseDTO2.setId(adresseDTO1.getId());
        assertThat(adresseDTO1).isEqualTo(adresseDTO2);
        adresseDTO2.setId(UUID.randomUUID());
        assertThat(adresseDTO1).isNotEqualTo(adresseDTO2);
        adresseDTO1.setId(null);
        assertThat(adresseDTO1).isNotEqualTo(adresseDTO2);
    }
}
