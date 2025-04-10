package fr.ag2rlamondiale.osp.contrat.service.mapper;

import static fr.ag2rlamondiale.osp.contrat.domain.PmEntrepriseAsserts.*;
import static fr.ag2rlamondiale.osp.contrat.domain.PmEntrepriseTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PmEntrepriseMapperTest {

    private PmEntrepriseMapper pmEntrepriseMapper;

    @BeforeEach
    void setUp() {
        pmEntrepriseMapper = new PmEntrepriseMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getPmEntrepriseSample1();
        var actual = pmEntrepriseMapper.toEntity(pmEntrepriseMapper.toDto(expected));
        assertPmEntrepriseAllPropertiesEquals(expected, actual);
    }
}
