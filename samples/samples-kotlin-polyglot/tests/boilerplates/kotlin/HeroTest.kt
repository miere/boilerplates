package boilerplates.kotlin

import kikaha.core.cdi.DefaultCDI
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import javax.inject.Inject

/**
 *
 */
class HeroTest {

    @Inject lateinit var batman:Hero
    @Inject lateinit var cityHero:Hero

    @BeforeEach fun inject(){
        DefaultCDI.newInstance().injectOn(this)
    }

    @Test
    fun attack() {
        batman.attack( cityHero )
    }
}