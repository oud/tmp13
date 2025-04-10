package fr.ag2rlamondiale.osp.contrat.domain;

import java.util.UUID;

public class PmEtablissementTestSamples {

    public static PmEtablissement getPmEtablissementSample1() {
        return new PmEtablissement()
            .id(UUID.fromString("23d8dc04-a48b-45d9-a01d-4b728f0ad4aa"))
            .idEtablissementRPG("idEtablissementRPG1")
            .codePartenaireDistributeur("codePartenaireDistributeur1")
            .numeroSiretSiege("numeroSiretSiege1")
            .codeEtat("codeEtat1")
            .libelleEtat("libelleEtat1")
            .codeCategoriePersonne("codeCategoriePersonne1")
            .libelleCategoriePersonne("libelleCategoriePersonne1")
            .codeType("codeType1")
            .dateCreationJuridique("dateCreationJuridique1")
            .dateEtat("dateEtat1")
            .dateFermetureJuridique("dateFermetureJuridique1")
            .codeIDCC("codeIDCC1")
            .codeTrancheEffectif("codeTrancheEffectif1")
            .libelleTrancheEffectif("libelleTrancheEffectif1")
            .dateCessationActivite("dateCessationActivite1")
            .dateEffectifOfficiel("dateEffectifOfficiel1")
            .effectifOfficiel("effectifOfficiel1")
            .codeMotifCessationActivite("codeMotifCessationActivite1")
            .siret("siret1")
            .codeTypeEtablissement("codeTypeEtablissement1")
            .libelleEnseigne("libelleEnseigne1")
            .codeNIC("codeNIC1");
    }

    public static PmEtablissement getPmEtablissementSample2() {
        return new PmEtablissement()
            .id(UUID.fromString("ad79f240-3727-46c3-b89f-2cf6ebd74367"))
            .idEtablissementRPG("idEtablissementRPG2")
            .codePartenaireDistributeur("codePartenaireDistributeur2")
            .numeroSiretSiege("numeroSiretSiege2")
            .codeEtat("codeEtat2")
            .libelleEtat("libelleEtat2")
            .codeCategoriePersonne("codeCategoriePersonne2")
            .libelleCategoriePersonne("libelleCategoriePersonne2")
            .codeType("codeType2")
            .dateCreationJuridique("dateCreationJuridique2")
            .dateEtat("dateEtat2")
            .dateFermetureJuridique("dateFermetureJuridique2")
            .codeIDCC("codeIDCC2")
            .codeTrancheEffectif("codeTrancheEffectif2")
            .libelleTrancheEffectif("libelleTrancheEffectif2")
            .dateCessationActivite("dateCessationActivite2")
            .dateEffectifOfficiel("dateEffectifOfficiel2")
            .effectifOfficiel("effectifOfficiel2")
            .codeMotifCessationActivite("codeMotifCessationActivite2")
            .siret("siret2")
            .codeTypeEtablissement("codeTypeEtablissement2")
            .libelleEnseigne("libelleEnseigne2")
            .codeNIC("codeNIC2");
    }

    public static PmEtablissement getPmEtablissementRandomSampleGenerator() {
        return new PmEtablissement()
            .id(UUID.randomUUID())
            .idEtablissementRPG(UUID.randomUUID().toString())
            .codePartenaireDistributeur(UUID.randomUUID().toString())
            .numeroSiretSiege(UUID.randomUUID().toString())
            .codeEtat(UUID.randomUUID().toString())
            .libelleEtat(UUID.randomUUID().toString())
            .codeCategoriePersonne(UUID.randomUUID().toString())
            .libelleCategoriePersonne(UUID.randomUUID().toString())
            .codeType(UUID.randomUUID().toString())
            .dateCreationJuridique(UUID.randomUUID().toString())
            .dateEtat(UUID.randomUUID().toString())
            .dateFermetureJuridique(UUID.randomUUID().toString())
            .codeIDCC(UUID.randomUUID().toString())
            .codeTrancheEffectif(UUID.randomUUID().toString())
            .libelleTrancheEffectif(UUID.randomUUID().toString())
            .dateCessationActivite(UUID.randomUUID().toString())
            .dateEffectifOfficiel(UUID.randomUUID().toString())
            .effectifOfficiel(UUID.randomUUID().toString())
            .codeMotifCessationActivite(UUID.randomUUID().toString())
            .siret(UUID.randomUUID().toString())
            .codeTypeEtablissement(UUID.randomUUID().toString())
            .libelleEnseigne(UUID.randomUUID().toString())
            .codeNIC(UUID.randomUUID().toString());
    }
}
