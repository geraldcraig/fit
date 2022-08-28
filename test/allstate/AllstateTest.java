package allstate;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AllstateTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSum() {
		Assert.assertEquals(12, 5 + 7);
	}

}
