package fr.ag2rlamondiale.osp.contrat.domain;

import java.util.UUID;

public class MiseEnGestionTestSamples {

    public static MiseEnGestion getMiseEnGestionSample1() {
        return new MiseEnGestion().id(UUID.fromString("23d8dc04-a48b-45d9-a01d-4b728f0ad4aa")).typeMEG("typeMEG1").codeOffre("codeOffre1");
    }

    public static MiseEnGestion getMiseEnGestionSample2() {
        return new MiseEnGestion().id(UUID.fromString("ad79f240-3727-46c3-b89f-2cf6ebd74367")).typeMEG("typeMEG2").codeOffre("codeOffre2");
    }

    public static MiseEnGestion getMiseEnGestionRandomSampleGenerator() {
        return new MiseEnGestion().id(UUID.randomUUID()).typeMEG(UUID.randomUUID().toString()).codeOffre(UUID.randomUUID().toString());
    }
}
