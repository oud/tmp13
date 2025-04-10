package fr.ag2rlamondiale.osp.contrat.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import fr.ag2rlamondiale.osp.contrat.web.rest.TestUtil;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class MiseEnGestionDTOTest {

    @Test
    void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(MiseEnGestionDTO.class);
        MiseEnGestionDTO miseEnGestionDTO1 = new MiseEnGestionDTO();
        miseEnGestionDTO1.setId(UUID.randomUUID());
        MiseEnGestionDTO miseEnGestionDTO2 = new MiseEnGestionDTO();
        assertThat(miseEnGestionDTO1).isNotEqualTo(miseEnGestionDTO2);
        miseEnGestionDTO2.setId(miseEnGestionDTO1.getId());
        assertThat(miseEnGestionDTO1).isEqualTo(miseEnGestionDTO2);
        miseEnGestionDTO2.setId(UUID.randomUUID());
        assertThat(miseEnGestionDTO1).isNotEqualTo(miseEnGestionDTO2);
        miseEnGestionDTO1.setId(null);
        assertThat(miseEnGestionDTO1).isNotEqualTo(miseEnGestionDTO2);
    }
}
