package fr.ag2rlamondiale.osp.contrat.domain;

import static fr.ag2rlamondiale.osp.contrat.domain.AdresseTestSamples.*;
import static fr.ag2rlamondiale.osp.contrat.domain.DemandeXRMTestSamples.*;
import static fr.ag2rlamondiale.osp.contrat.domain.EmailTestSamples.*;
import static fr.ag2rlamondiale.osp.contrat.domain.PmEntrepriseTestSamples.*;
import static fr.ag2rlamondiale.osp.contrat.domain.TelephoneTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import fr.ag2rlamondiale.osp.contrat.web.rest.TestUtil;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class PmEntrepriseTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(PmEntreprise.class);
        PmEntreprise pmEntreprise1 = getPmEntrepriseSample1();
        PmEntreprise pmEntreprise2 = new PmEntreprise();
        assertThat(pmEntreprise1).isNotEqualTo(pmEntreprise2);

        pmEntreprise2.setId(pmEntreprise1.getId());
        assertThat(pmEntreprise1).isEqualTo(pmEntreprise2);

        pmEntreprise2 = getPmEntrepriseSample2();
        assertThat(pmEntreprise1).isNotEqualTo(pmEntreprise2);
    }

    @Test
    void adressesTest() {
        PmEntreprise pmEntreprise = getPmEntrepriseRandomSampleGenerator();
        Adresse adresseBack = getAdresseRandomSampleGenerator();

        pmEntreprise.addAdresses(adresseBack);
        assertThat(pmEntreprise.getAdresses()).containsOnly(adresseBack);
        assertThat(adresseBack.getPmEntreprise()).isEqualTo(pmEntreprise);

        pmEntreprise.removeAdresses(adresseBack);
        assertThat(pmEntreprise.getAdresses()).doesNotContain(adresseBack);
        assertThat(adresseBack.getPmEntreprise()).isNull();

        pmEntreprise.adresses(new HashSet<>(Set.of(adresseBack)));
        assertThat(pmEntreprise.getAdresses()).containsOnly(adresseBack);
        assertThat(adresseBack.getPmEntreprise()).isEqualTo(pmEntreprise);

        pmEntreprise.setAdresses(new HashSet<>());
        assertThat(pmEntreprise.getAdresses()).doesNotContain(adresseBack);
        assertThat(adresseBack.getPmEntreprise()).isNull();
    }

    @Test
    void emailsTest() {
        PmEntreprise pmEntreprise = getPmEntrepriseRandomSampleGenerator();
        Email emailBack = getEmailRandomSampleGenerator();

        pmEntreprise.addEmails(emailBack);
        assertThat(pmEntreprise.getEmails()).containsOnly(emailBack);
        assertThat(emailBack.getPmEntreprise()).isEqualTo(pmEntreprise);

        pmEntreprise.removeEmails(emailBack);
        assertThat(pmEntreprise.getEmails()).doesNotContain(emailBack);
        assertThat(emailBack.getPmEntreprise()).isNull();

        pmEntreprise.emails(new HashSet<>(Set.of(emailBack)));
        assertThat(pmEntreprise.getEmails()).containsOnly(emailBack);
        assertThat(emailBack.getPmEntreprise()).isEqualTo(pmEntreprise);

        pmEntreprise.setEmails(new HashSet<>());
        assertThat(pmEntreprise.getEmails()).doesNotContain(emailBack);
        assertThat(emailBack.getPmEntreprise()).isNull();
    }

    @Test
    void telephonesTest() {
        PmEntreprise pmEntreprise = getPmEntrepriseRandomSampleGenerator();
        Telephone telephoneBack = getTelephoneRandomSampleGenerator();

        pmEntreprise.addTelephones(telephoneBack);
        assertThat(pmEntreprise.getTelephones()).containsOnly(telephoneBack);
        assertThat(telephoneBack.getPmEntreprise()).isEqualTo(pmEntreprise);

        pmEntreprise.removeTelephones(telephoneBack);
        assertThat(pmEntreprise.getTelephones()).doesNotContain(telephoneBack);
        assertThat(telephoneBack.getPmEntreprise()).isNull();

        pmEntreprise.telephones(new HashSet<>(Set.of(telephoneBack)));
        assertThat(pmEntreprise.getTelephones()).containsOnly(telephoneBack);
        assertThat(telephoneBack.getPmEntreprise()).isEqualTo(pmEntreprise);

        pmEntreprise.setTelephones(new HashSet<>());
        assertThat(pmEntreprise.getTelephones()).doesNotContain(telephoneBack);
        assertThat(telephoneBack.getPmEntreprise()).isNull();
    }

    @Test
    void demandeXRMTest() {
        PmEntreprise pmEntreprise = getPmEntrepriseRandomSampleGenerator();
        DemandeXRM demandeXRMBack = getDemandeXRMRandomSampleGenerator();

        pmEntreprise.setDemandeXRM(demandeXRMBack);
        assertThat(pmEntreprise.getDemandeXRM()).isEqualTo(demandeXRMBack);
        assertThat(demandeXRMBack.getPmEntreprise()).isEqualTo(pmEntreprise);

        pmEntreprise.demandeXRM(null);
        assertThat(pmEntreprise.getDemandeXRM()).isNull();
        assertThat(demandeXRMBack.getPmEntreprise()).isNull();
    }
}
