package DemoPractice;

import org.testng.annotations.Test;

public class Demo2 {
	@Test(groups = "regression")
	public class practice_maven2 {
		public void edit() {
			System.out.println("edit regression successfully");
		}
		@Test(groups = "smoke")
		public void againupdate() {
			System.out.println("againupdate smoke successfully");
		}

	}
}
