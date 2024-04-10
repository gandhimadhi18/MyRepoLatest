package Sample1;

import org.testng.annotations.Test;

public class testing_part {
	@Test
	public void test_part1() {
		System.out.println("This is part1");
			}
	
	@Test(enabled=false)
	public void test_part2() {
		System.out.println("This is part2");
			}
}
