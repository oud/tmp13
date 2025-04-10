package fr.ag2rlamondiale.osp.contrat.domain;

import static fr.ag2rlamondiale.osp.contrat.domain.PmEntrepriseTestSamples.*;
import static fr.ag2rlamondiale.osp.contrat.domain.PmEtablissementTestSamples.*;
import static fr.ag2rlamondiale.osp.contrat.domain.TelephoneTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import fr.ag2rlamondiale.osp.contrat.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class TelephoneTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Telephone.class);
        Telephone telephone1 = getTelephoneSample1();
        Telephone telephone2 = new Telephone();
        assertThat(telephone1).isNotEqualTo(telephone2);

        telephone2.setId(telephone1.getId());
        assertThat(telephone1).isEqualTo(telephone2);

        telephone2 = getTelephoneSample2();
        assertThat(telephone1).isNotEqualTo(telephone2);
    }

    @Test
    void pmEntrepriseTest() {
        Telephone telephone = getTelephoneRandomSampleGenerator();
        PmEntreprise pmEntrepriseBack = getPmEntrepriseRandomSampleGenerator();

        telephone.setPmEntreprise(pmEntrepriseBack);
        assertThat(telephone.getPmEntreprise()).isEqualTo(pmEntrepriseBack);

        telephone.pmEntreprise(null);
        assertThat(telephone.getPmEntreprise()).isNull();
    }

    @Test
    void pmEtablissementTest() {
        Telephone telephone = getTelephoneRandomSampleGenerator();
        PmEtablissement pmEtablissementBack = getPmEtablissementRandomSampleGenerator();

        telephone.setPmEtablissement(pmEtablissementBack);
        assertThat(telephone.getPmEtablissement()).isEqualTo(pmEtablissementBack);

        telephone.pmEtablissement(null);
        assertThat(telephone.getPmEtablissement()).isNull();
    }
}
