package com.test;

class BankAccount {

	private String Account;
	private static double leftmoney = 0.0;
	
	public BankAccount(String zhanghu,int yue) {
		Account = zhanghu;
		leftmoney = yue;
	}
	
	public void setAccount() {
		this.Account = Account;
	}
	
	public String getAccount() {
		return Account;
	}
	
	public void setleftmoney(double balance) {
		leftmoney = balance;
	}
	
	public double getleftmoney() {
		return leftmoney;
	}
	
	public void savemoney(double money) {
		leftmoney+=money;
	}

	public void getmoney(double money) {
		if(leftmoney>=money) {
			leftmoney-=money;
		}
		else {
			System.out.println("���㣡�����벻����"+leftmoney+"�Ľ��");
		}
	}
	
	public void inquireAbout() {
		System.out.println("�˻����Ϊ��"+getleftmoney());
	}
}

public class test_BankAccount{
	public static void main(String[] args) {
		BankAccount ba = new BankAccount("100001",500);
		System.out.println("�˻����Ϊ��"+ba.getleftmoney());
		ba.savemoney(200);
		System.out.println("����200Ԫ�����Ϊ��"+ba.getleftmoney());
		ba.getmoney(100);
		System.out.println("ȡ��100Ԫ�����Ϊ��"+ba.getleftmoney());
		ba.getmoney(1000);
	}
}
vkjkbbkkn
