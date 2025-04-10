package fr.ag2rlamondiale.osp.contrat.service.mapper;

import static fr.ag2rlamondiale.osp.contrat.domain.MiseEnGestionAsserts.*;
import static fr.ag2rlamondiale.osp.contrat.domain.MiseEnGestionTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiseEnGestionMapperTest {

    private MiseEnGestionMapper miseEnGestionMapper;

    @BeforeEach
    void setUp() {
        miseEnGestionMapper = new MiseEnGestionMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getMiseEnGestionSample1();
        var actual = miseEnGestionMapper.toEntity(miseEnGestionMapper.toDto(expected));
        assertMiseEnGestionAllPropertiesEquals(expected, actual);
    }
}
