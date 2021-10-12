package com.greatlearning.driver;
import com.greatlearning.balancecheck.BalanceCheck;
import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		BalanceCheck bc = new BalanceCheck();
		System.out.println("Enter the bracket expression to check its balancing");
		String exp = sc.next();
		flag = bc.bracketBalanceCheck(exp);
		if (flag == false)
			System.out.println("The entered string do not contain balanced brackets");
		else
			System.out.println("The entered string has balanced brackets");
		sc.close();

	}
}