package samples.java8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import lombok.val;
import org.junit.jupiter.api.*;

/**
 *
 */
@DisplayName("Unit test for LevenshteinDistance.java")
class LevenshteinDistanceTest {

	@Test
	@DisplayName( "Can calculate the distance between two similar strings" )
	void canCalculateTheDistanceBetweenTwoSimilarStrings()
	{
		val correct = "Hello World";
		val similar = "Helo World";

		val distance = LevenshteinDistance.calculate( correct, similar );
		assertEquals( 1, distance );
	}
}
