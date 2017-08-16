package service;

import factory.ClientDAO;
import model.Client;

public class TransactionService {

	public Client withdrawValue(int accountNo, double value) throws Exception {

		ClientDAO accountDao = new ClientDAO();
		Client client = accountDao.getAccount(accountNo);

		double balance = client.getBalance();

		if (balance < value) {
			throw new Exception("The balance for the account " + accountNo + "is smaller then the requested value.");
		}

		double newBalance = balance - value;

		accountDao.changeBalance(newBalance, accountNo);
		client.setBalance(newBalance);

		return client;
	}

	public Client payment(int accountNo, double value) {
		ClientDAO accountDao = new ClientDAO();
		Client client = accountDao.getAccount(accountNo);

		double balance = client.getBalance();
		double newBalance = balance + value;

		accountDao.changeBalance(newBalance, accountNo);
		client.setBalance(newBalance);

		return client;
	}

}
