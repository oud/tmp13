package fr.ag2rlamondiale.osp.contrat.domain;

import java.util.UUID;

public class EmailTestSamples {

    public static Email getEmailSample1() {
        return new Email()
            .id(UUID.fromString("23d8dc04-a48b-45d9-a01d-4b728f0ad4aa"))
            .adresseEmail("adresseEmail1")
            .codeStatut("codeStatut1")
            .codeUsageEmail("codeUsageEmail1");
    }

    public static Email getEmailSample2() {
        return new Email()
            .id(UUID.fromString("ad79f240-3727-46c3-b89f-2cf6ebd74367"))
            .adresseEmail("adresseEmail2")
            .codeStatut("codeStatut2")
            .codeUsageEmail("codeUsageEmail2");
    }

    public static Email getEmailRandomSampleGenerator() {
        return new Email()
            .id(UUID.randomUUID())
            .adresseEmail(UUID.randomUUID().toString())
            .codeStatut(UUID.randomUUID().toString())
            .codeUsageEmail(UUID.randomUUID().toString());
    }
}
