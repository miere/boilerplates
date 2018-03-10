package boilerplates.kotlin

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 *
 */
internal class XmlTagMatcherTest {

    @Test
    fun getMatchedTagAsExpected() {
        val matcher = XmlTagMatcher()
        val matched = matcher.extractTags( "<xml><hello>world</hello></xml>" )
        assertEquals( 1, matched.size )
        assertEquals( "world", matched["hello"] )
    }
}