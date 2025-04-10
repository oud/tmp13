package fr.ag2rlamondiale.osp.contrat.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import fr.ag2rlamondiale.osp.contrat.web.rest.TestUtil;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class PmEtablissementDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(PmEtablissementDTO.class);
        PmEtablissementDTO pmEtablissementDTO1 = new PmEtablissementDTO();
        pmEtablissementDTO1.setId(UUID.randomUUID());
        PmEtablissementDTO pmEtablissementDTO2 = new PmEtablissementDTO();
        assertThat(pmEtablissementDTO1).isNotEqualTo(pmEtablissementDTO2);
        pmEtablissementDTO2.setId(pmEtablissementDTO1.getId());
        assertThat(pmEtablissementDTO1).isEqualTo(pmEtablissementDTO2);
        pmEtablissementDTO2.setId(UUID.randomUUID());
        assertThat(pmEtablissementDTO1).isNotEqualTo(pmEtablissementDTO2);
        pmEtablissementDTO1.setId(null);
        assertThat(pmEtablissementDTO1).isNotEqualTo(pmEtablissementDTO2);
    }
}
