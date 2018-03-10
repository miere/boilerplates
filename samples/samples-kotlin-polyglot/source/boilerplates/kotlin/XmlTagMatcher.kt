package boilerplates.kotlin

/**
 *
 */
class XmlTagMatcher {

    val re = Regex( "<([a-zA-Z]+)>([^<]+)</" )

    fun extractTags(x: String): Map<String, String> {
        val tags = mutableMapOf<String, String>()
        for ( tag in re.findAll( x ) )
            tags[tag.groupValues[1]] = tag.groupValues[2]
        return tags
    }
}