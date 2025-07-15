package src3;

import keyword.Client;

public class Main {
	public static void main(String[] args) {
		Client client = new Client();
		client.setName("João");
		client.setStaticName("Chaves");
		System.out.println(client.getName());
		System.out.println(client.getStaticName());
		System.out.println("=============================");
		Client client2 = new Client();
		System.out.println(client2.getName());
		System.out.println(client2.getStaticName());
		//System.out.println(Client.name);
	}
}
