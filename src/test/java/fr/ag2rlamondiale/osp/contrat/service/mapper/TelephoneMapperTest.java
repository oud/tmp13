package fr.ag2rlamondiale.osp.contrat.service.mapper;

import static fr.ag2rlamondiale.osp.contrat.domain.TelephoneAsserts.*;
import static fr.ag2rlamondiale.osp.contrat.domain.TelephoneTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelephoneMapperTest {

    private TelephoneMapper telephoneMapper;

    @BeforeEach
    void setUp() {
        telephoneMapper = new TelephoneMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getTelephoneSample1();
        var actual = telephoneMapper.toEntity(telephoneMapper.toDto(expected));
        assertTelephoneAllPropertiesEquals(expected, actual);
    }
}
