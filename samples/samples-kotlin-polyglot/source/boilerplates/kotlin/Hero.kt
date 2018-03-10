package boilerplates.kotlin

import javax.inject.Singleton

/**
 *
 */
interface Hero {

    fun attack( h:Hero )
}

@Singleton
class Batman: Hero {

    override fun attack(h: Hero) {
        println( "Batman!!" )
    }
}