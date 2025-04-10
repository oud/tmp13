package fr.ag2rlamondiale.osp.contrat.service.mapper;

import static fr.ag2rlamondiale.osp.contrat.domain.DemandeXRMAsserts.*;
import static fr.ag2rlamondiale.osp.contrat.domain.DemandeXRMTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemandeXRMMapperTest {

    private DemandeXRMMapper demandeXRMMapper;

    @BeforeEach
    void setUp() {
        demandeXRMMapper = new DemandeXRMMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getDemandeXRMSample1();
        var actual = demandeXRMMapper.toEntity(demandeXRMMapper.toDto(expected));
        assertDemandeXRMAllPropertiesEquals(expected, actual);
    }
}
