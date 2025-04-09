package fr.ag2rlamondiale.osp.contrat;

import fr.ag2rlamondiale.osp.contrat.config.AsyncSyncConfiguration;
import fr.ag2rlamondiale.osp.contrat.config.EmbeddedSQL;
import fr.ag2rlamondiale.osp.contrat.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { Tmp13App.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
public @interface IntegrationTest {
}
