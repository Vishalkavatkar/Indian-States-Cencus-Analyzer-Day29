package com.Day29;

import org.junit.Test;

/**
 * We have written the test cases here.
 */
public class TestAnalyser {
	@Test
	public void testCensusAnalyser() {
		StateCensusAnalyser analyser = new StateCensusAnalyser();
		analyser.loadData();
	}
}