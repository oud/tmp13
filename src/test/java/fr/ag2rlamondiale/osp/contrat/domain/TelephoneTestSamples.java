package fr.ag2rlamondiale.osp.contrat.domain;

import java.util.UUID;

public class TelephoneTestSamples {

    public static Telephone getTelephoneSample1() {
        return new Telephone()
            .id(UUID.fromString("23d8dc04-a48b-45d9-a01d-4b728f0ad4aa"))
            .codePaysISO("codePaysISO1")
            .codeTypeTelephone("codeTypeTelephone1")
            .codeIndicatifPays("codeIndicatifPays1")
            .numeroTelephone("numeroTelephone1")
            .codeStatut("codeStatut1")
            .dateStatut("dateStatut1")
            .codeUsageTelephone("codeUsageTelephone1");
    }

    public static Telephone getTelephoneSample2() {
        return new Telephone()
            .id(UUID.fromString("ad79f240-3727-46c3-b89f-2cf6ebd74367"))
            .codePaysISO("codePaysISO2")
            .codeTypeTelephone("codeTypeTelephone2")
            .codeIndicatifPays("codeIndicatifPays2")
            .numeroTelephone("numeroTelephone2")
            .codeStatut("codeStatut2")
            .dateStatut("dateStatut2")
            .codeUsageTelephone("codeUsageTelephone2");
    }

    public static Telephone getTelephoneRandomSampleGenerator() {
        return new Telephone()
            .id(UUID.randomUUID())
            .codePaysISO(UUID.randomUUID().toString())
            .codeTypeTelephone(UUID.randomUUID().toString())
            .codeIndicatifPays(UUID.randomUUID().toString())
            .numeroTelephone(UUID.randomUUID().toString())
            .codeStatut(UUID.randomUUID().toString())
            .dateStatut(UUID.randomUUID().toString())
            .codeUsageTelephone(UUID.randomUUID().toString());
    }
}
