package hideonbush.springboot.semiproject5v.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilesConfig {

    @Bean
    public UrlBasedViewResolver tilesViewResolver() {
        UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
        tilesViewResolver.setViewClass( TilesView.class );

        return tilesViewResolver;
    }

    @Bean
    TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        String[] defs = { "classpath:tiles.xml" };
        tilesConfigurer.setDefinitions( defs );

        return tilesConfigurer;
    }
}