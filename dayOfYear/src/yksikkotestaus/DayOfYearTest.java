package yksikkotestaus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DayOfYearTest {

	@Test
	//Is the result for first day of the year number 1
	public void eka() {
		int x = DayOfYear.dayOfYear(1, 1, 2020);
		assertEquals(1, x);
	}
	@Test
	//Does 1. of march give correct result if leap year
	public void toka() {
		int x = DayOfYear.dayOfYear(3, 1, 2020);
		assertEquals(61, x);
	}
	@Test
	//Does 1. of march give correct result if not leap year
	public void kolmas() {
		int x = DayOfYear.dayOfYear(3, 1, 2019);
		assertEquals(60, x);
	}

	
	@Test
	//Does last day of year give correct result if not leap year
	public void neljas() {
		int x = DayOfYear.dayOfYear(12, 31, 2019);
		assertEquals(365, x);
	}
	@Test
	//If value out of range, does it return -1
	public void viides() {
		int x = DayOfYear.dayOfYear(19, 31, 2019);
		assertEquals(-1, x);
	}
}