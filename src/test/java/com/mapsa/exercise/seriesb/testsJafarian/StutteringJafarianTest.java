package com.mapsa.exercise.seriesb.testsJafarian;

import com.mapsa.exercise.seriesb.e.Stuttering;
import com.mapsa.exercise.seriesb.e.StutteringJafarian;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StutteringJafarianTest {
	
	
	
	@Test
	public void test01() { 
		assertEquals("in... in... increasing?", StutteringJafarian.stutter("increasing"));
	}

	@Test
	public void test02() { 
		assertEquals("ad... ad... adventures?", StutteringJafarian.stutter("adventures"));
	}

	@Test
	public void test03() { 
		assertEquals("en... en... enticing?", StutteringJafarian.stutter("enticing"));
	}

	@Test
	public void test04() { 
		assertEquals("un... un... unacceptable?", StutteringJafarian.stutter("unacceptable"));
	}

	@Test
	public void test05() { 
		assertEquals("ac... ac... accountable?", StutteringJafarian.stutter("accountable"));
	}

	@Test
	public void test06() { 
		assertEquals("in... in... incredible?", StutteringJafarian.stutter("incredible"));
	}

	@Test
	public void test07() { 
		assertEquals("ex... ex... exquisite?", StutteringJafarian.stutter("exquisite"));
	}

	@Test
	public void test08() { 
		assertEquals("am... am... am?", StutteringJafarian.stutter("am"));
	}

	@Test
	public void test09() { 
		assertEquals("en... en... enduring?", StutteringJafarian.stutter("enduring"));
	}

	@Test
	public void test10() { 
		assertEquals("ou... ou... outstanding?", StutteringJafarian.stutter("outstanding"));
	}

	@Test
	public void test11() { 
		assertEquals("as... as... astonishing?", StutteringJafarian.stutter("astonishing"));
	}

	@Test
	public void test12() { 
		assertEquals("as... as... astounding?", StutteringJafarian.stutter("astounding"));
	}

	@Test
	public void test13() { 
		assertEquals("im... im... impressive?", StutteringJafarian.stutter("impressive"));
	}

	@Test
	public void test14() { 
		assertEquals("re... re... revolutionize?", StutteringJafarian.stutter("revolutionize"));
	}

	@Test
	public void test15() { 
		assertEquals("re... re... recurring?", StutteringJafarian.stutter("recurring"));
	}

	@Test
	public void test16() { 
		assertEquals("re... re... recollection?", StutteringJafarian.stutter("recollection"));
	}

	@Test
	public void test17() { 
		assertEquals("so... so... so?", StutteringJafarian.stutter("so"));
	}

	@Test
	public void test18() { 
		assertEquals("go... go... gorgeous?", StutteringJafarian.stutter("gorgeous"));
	}

	@Test
	public void test19() { 
		assertEquals("ca... ca... captivating?", StutteringJafarian.stutter("captivating"));
	}

}
