package com.qa.helloworld;

public class results {

	public static void main(String[] args) {

		double phy = 140;
		double che = 150;
		double bio = 150;
		double total = phy + che + bio;
		double result = (total / 450) * 100;

		System.out.println("Physics result: " + phy);
		System.out.println("Chemistry result: " + che);
		System.out.println("Biology result: " + bio);
		System.out.println("Overall grade: " + result + "%");

		if (result >= 60 && phy >= 0.6*150 && che >= 0.6*150 && bio >= 0.6*150) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");

		}
		
		if (phy >= 0.6*150 && che >= 0.6*150 && bio < 0.6*150) {
			System.out.println("Biology failed");
		} else if (phy >= 0.6*150 && che < 0.6*150 && bio >= 0.6*150) {
			System.out.println("Chemistry failed");
		} else if (phy < 0.6*150 && che >= 0.6*150 && bio >= 0.6*150) {
			System.out.println("Physics failed");
		} else if (phy < 0.6*150 && che < 0.6*150 && bio >= 0.6*150) {
			System.out.println("Physics and Chemistry failed");
		} else if (phy < 0.6*150 && che >= 0.6*150 && bio < 0.6*150) {
			System.out.println("Physics and Biology failed");
		} else if (phy >= 0.6*150 && che < 0.6*150 && bio < 0.6*150) {
			System.out.println("Chemistry and Biology failed");
		} else if (phy < 0.6*150 && che < 0.6*150 && bio < 0.6*150) {
			System.out.println("Physics, Chemistry and Biology failed");
		}

	}
}
