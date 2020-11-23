package com.fsr.iao;

import com.fsr.iao.dao.ClientDao;

public class CreditWS {

	public double calculAnnuelle(double taux) {
		return Math.pow(1 + taux, (double) 1 / 12) - 1;
	}

	public double calculAnnuite(double capital, double t, long duree) {
		double taux = calculAnnuelle(t);

		return (Math.pow(1 + taux, duree) * taux * capital) / (Math.pow(1 + taux, duree) - 1);

	}

	public double calculCapital(double annuite, double t, long duree) {
		double taux = calculAnnuelle(t);

		return (Math.pow(1 + taux, duree) * annuite - annuite) / (Math.pow(1 + taux, duree) * taux);
	}

	public long calculDuree(double capital, double t, double annuite) {
		double taux = calculAnnuelle(t);

		return (long) ((Math.log(annuite / (annuite - taux * capital)) / (Math.log(1 + taux))) + 0.5);
	}

	public Client login(String email, String pass) {

		ClientDao dao = new ClientDao();

		return dao.login(email, pass);

	}

	public int insertClient(String nomCli, String email, String pass) {
		ClientDao dao = new ClientDao();

		return dao.insertClient(nomCli, email, pass);

	}

	public int insertCredit(double capital, long duree, double taux, double annuite, int numclient) {

		ClientDao dao = new ClientDao();

		return dao.insertCredit(capital, duree, taux, annuite, numclient);

	}

	public Credit[] getAllCredit(int numCli) {

		ClientDao dao = new ClientDao();

		Object[] objs = dao.getAllCredit(numCli).toArray();

		Credit[] credits = new Credit[objs.length];

		for (int i = 0; i < objs.length; i++) {

			credits[i] = (Credit) objs[i];
		}

		return credits;
	}

}
