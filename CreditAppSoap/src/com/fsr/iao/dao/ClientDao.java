package com.fsr.iao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import com.fsr.iao.*;

public class ClientDao {

	public final static int DEMAIL = -1;

	public int insertClient(String nomCli, String email, String pass) {

		int statut = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection ma_connexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/CreditApp", "root",
					"root");

			Statement mon_statement = ma_connexion.createStatement();

			ResultSet rs = mon_statement.executeQuery("SELECT Email FROM Client WHERE Email = '" + email + "'");

			if (rs.next()) {

				return DEMAIL;
			}

			statut = mon_statement.executeUpdate("INSERT INTO `Client` (`NomCli`, `Email`, `MotDePasse`) VALUES ('"
					+ nomCli + "', '" + email + "', '" + pass + "')");

			mon_statement = ma_connexion.createStatement();

			String query = "SELECT LAST_INSERT_ID()";

			rs = mon_statement.executeQuery(query);

			rs.next();

			statut = rs.getInt(1);

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return statut;
	}

	public Client login(String email, String pass) {

		Client client = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection ma_connexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/CreditApp", "root",
					"root");

			Statement mon_statement = ma_connexion.createStatement();

			ResultSet rs = mon_statement.executeQuery(
					"SELECT * FROM Client WHERE Email = '" + email + "' AND  MotDePasse =  '" + pass + "'");

			if (rs.next()) {

				client = new Client();

				client.setNumCli(rs.getInt("NumCli"));
				client.setNomCli(rs.getString("NomCli"));
				client.setEmail(rs.getString("Email"));

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return client;

	}

	public int insertCredit(double capital, long duree, double taux, double annuite, int numclient) {

		int statut = -1;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection ma_connexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/CreditApp", "root",
					"root");

			Statement mon_statement = ma_connexion.createStatement();

			statut = mon_statement.executeUpdate(

					"INSERT INTO `Credit` (`MonCre`, `DurCre`, `TauCre`, `AnnCre`, `NumCli`)"

							+ " VALUES ('" + capital + "', '" + duree + "', '" + taux + "', '" + annuite + "', '"
							+ numclient + "')");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return statut;
	}

	public List<Credit> getAllCredit(int numCli) {

		List<Credit> list = new LinkedList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection ma_connexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/CreditApp", "root",
					"root");

			Statement mon_statement = ma_connexion.createStatement();

			ResultSet rs = mon_statement.executeQuery("SELECT * FROM Credit WHERE NumCli ='" + numCli + "'");

			while (rs.next()) {

				Credit credit = new Credit();

				credit.setCapital(rs.getDouble("MonCre"));
				credit.setTaux(rs.getDouble("TauCre"));
				credit.setAnnuite(rs.getDouble("AnnCre"));
				credit.setDuree(rs.getLong("DurCre"));
				credit.setDate(rs.getString("DatCred"));
				credit.setNumCre(rs.getInt("NumCre"));
				credit.setNumclient(rs.getInt("NumCli"));

				list.add(credit);

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return list;

	}

}
