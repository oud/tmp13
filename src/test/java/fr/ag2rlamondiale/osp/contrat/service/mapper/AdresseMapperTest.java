package fr.ag2rlamondiale.osp.contrat.service.mapper;

import static fr.ag2rlamondiale.osp.contrat.domain.AdresseAsserts.*;
import static fr.ag2rlamondiale.osp.contrat.domain.AdresseTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdresseMapperTest {

    private AdresseMapper adresseMapper;

    @BeforeEach
    void setUp() {
        adresseMapper = new AdresseMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getAdresseSample1();
        var actual = adresseMapper.toEntity(adresseMapper.toDto(expected));
        assertAdresseAllPropertiesEquals(expected, actual);
    }
}
