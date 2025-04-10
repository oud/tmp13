package fr.ag2rlamondiale.osp.contrat.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class PmEtablissementAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPmEtablissementAllPropertiesEquals(PmEtablissement expected, PmEtablissement actual) {
        assertPmEtablissementAutoGeneratedPropertiesEquals(expected, actual);
        assertPmEtablissementAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPmEtablissementAllUpdatablePropertiesEquals(PmEtablissement expected, PmEtablissement actual) {
        assertPmEtablissementUpdatableFieldsEquals(expected, actual);
        assertPmEtablissementUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPmEtablissementAutoGeneratedPropertiesEquals(PmEtablissement expected, PmEtablissement actual) {
        assertThat(actual)
            .as("Verify PmEtablissement auto generated properties")
            .satisfies(a -> assertThat(a.getId()).as("check id").isEqualTo(expected.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPmEtablissementUpdatableFieldsEquals(PmEtablissement expected, PmEtablissement actual) {
        assertThat(actual)
            .as("Verify PmEtablissement relevant properties")
            .satisfies(a -> assertThat(a.getIdEtablissementRPG()).as("check idEtablissementRPG").isEqualTo(expected.getIdEtablissementRPG())
            )
            .satisfies(a ->
                assertThat(a.getCodePartenaireDistributeur())
                    .as("check codePartenaireDistributeur")
                    .isEqualTo(expected.getCodePartenaireDistributeur())
            )
            .satisfies(a -> assertThat(a.getNumeroSiretSiege()).as("check numeroSiretSiege").isEqualTo(expected.getNumeroSiretSiege()))
            .satisfies(a -> assertThat(a.getCodeEtat()).as("check codeEtat").isEqualTo(expected.getCodeEtat()))
            .satisfies(a -> assertThat(a.getLibelleEtat()).as("check libelleEtat").isEqualTo(expected.getLibelleEtat()))
            .satisfies(a ->
                assertThat(a.getCodeCategoriePersonne()).as("check codeCategoriePersonne").isEqualTo(expected.getCodeCategoriePersonne())
            )
            .satisfies(a ->
                assertThat(a.getLibelleCategoriePersonne())
                    .as("check libelleCategoriePersonne")
                    .isEqualTo(expected.getLibelleCategoriePersonne())
            )
            .satisfies(a -> assertThat(a.getCodeType()).as("check codeType").isEqualTo(expected.getCodeType()))
            .satisfies(a ->
                assertThat(a.getDateCreationJuridique()).as("check dateCreationJuridique").isEqualTo(expected.getDateCreationJuridique())
            )
            .satisfies(a -> assertThat(a.getDateEtat()).as("check dateEtat").isEqualTo(expected.getDateEtat()))
            .satisfies(a ->
                assertThat(a.getDateFermetureJuridique()).as("check dateFermetureJuridique").isEqualTo(expected.getDateFermetureJuridique())
            )
            .satisfies(a -> assertThat(a.getCodeIDCC()).as("check codeIDCC").isEqualTo(expected.getCodeIDCC()))
            .satisfies(a ->
                assertThat(a.getCodeTrancheEffectif()).as("check codeTrancheEffectif").isEqualTo(expected.getCodeTrancheEffectif())
            )
            .satisfies(a ->
                assertThat(a.getLibelleTrancheEffectif()).as("check libelleTrancheEffectif").isEqualTo(expected.getLibelleTrancheEffectif())
            )
            .satisfies(a ->
                assertThat(a.getDateCessationActivite()).as("check dateCessationActivite").isEqualTo(expected.getDateCessationActivite())
            )
            .satisfies(a ->
                assertThat(a.getDateEffectifOfficiel()).as("check dateEffectifOfficiel").isEqualTo(expected.getDateEffectifOfficiel())
            )
            .satisfies(a -> assertThat(a.getEffectifOfficiel()).as("check effectifOfficiel").isEqualTo(expected.getEffectifOfficiel()))
            .satisfies(a ->
                assertThat(a.getCodeMotifCessationActivite())
                    .as("check codeMotifCessationActivite")
                    .isEqualTo(expected.getCodeMotifCessationActivite())
            )
            .satisfies(a -> assertThat(a.getSiret()).as("check siret").isEqualTo(expected.getSiret()))
            .satisfies(a ->
                assertThat(a.getCodeTypeEtablissement()).as("check codeTypeEtablissement").isEqualTo(expected.getCodeTypeEtablissement())
            )
            .satisfies(a -> assertThat(a.getLibelleEnseigne()).as("check libelleEnseigne").isEqualTo(expected.getLibelleEnseigne()))
            .satisfies(a -> assertThat(a.getCodeNIC()).as("check codeNIC").isEqualTo(expected.getCodeNIC()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertPmEtablissementUpdatableRelationshipsEquals(PmEtablissement expected, PmEtablissement actual) {
        assertThat(actual)
            .as("Verify PmEtablissement relationships")
            .satisfies(a -> assertThat(a.getDemandeXRM()).as("check demandeXRM").isEqualTo(expected.getDemandeXRM()));
    }
}
