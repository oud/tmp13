package fr.ag2rlamondiale.osp.contrat.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class MiseEnGestionAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMiseEnGestionAllPropertiesEquals(MiseEnGestion expected, MiseEnGestion actual) {
        assertMiseEnGestionAutoGeneratedPropertiesEquals(expected, actual);
        assertMiseEnGestionAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMiseEnGestionAllUpdatablePropertiesEquals(MiseEnGestion expected, MiseEnGestion actual) {
        assertMiseEnGestionUpdatableFieldsEquals(expected, actual);
        assertMiseEnGestionUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMiseEnGestionAutoGeneratedPropertiesEquals(MiseEnGestion expected, MiseEnGestion actual) {
        assertThat(actual)
            .as("Verify MiseEnGestion auto generated properties")
            .satisfies(a -> assertThat(a.getId()).as("check id").isEqualTo(expected.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMiseEnGestionUpdatableFieldsEquals(MiseEnGestion expected, MiseEnGestion actual) {
        assertThat(actual)
            .as("Verify MiseEnGestion relevant properties")
            .satisfies(a -> assertThat(a.getTypeMEG()).as("check typeMEG").isEqualTo(expected.getTypeMEG()))
            .satisfies(a -> assertThat(a.getCodeOffre()).as("check codeOffre").isEqualTo(expected.getCodeOffre()))
            .satisfies(a -> assertThat(a.getDateEffet()).as("check dateEffet").isEqualTo(expected.getDateEffet()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMiseEnGestionUpdatableRelationshipsEquals(MiseEnGestion expected, MiseEnGestion actual) {
        // empty method
    }
}
