package fr.ag2rlamondiale.osp.contrat.domain;

import java.util.UUID;

public class DemandeXRMTestSamples {

    public static DemandeXRM getDemandeXRMSample1() {
        return new DemandeXRM().id(UUID.fromString("23d8dc04-a48b-45d9-a01d-4b728f0ad4aa"));
    }

    public static DemandeXRM getDemandeXRMSample2() {
        return new DemandeXRM().id(UUID.fromString("ad79f240-3727-46c3-b89f-2cf6ebd74367"));
    }

    public static DemandeXRM getDemandeXRMRandomSampleGenerator() {
        return new DemandeXRM().id(UUID.randomUUID());
    }
}
