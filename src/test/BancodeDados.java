package test;

import java.sql.*;

public class BancodeDados {

	private static String url = "jdbc:mysql://localhost:3306/easychef";
	private static String user = "root";
	private static String pass = "1234";
	protected static Connection conexao = null;

	public BancodeDados() {
		if (conexao == null)
			conecta();
	}

	private static boolean conecta() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conexao = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexao com Banco de Dados estabelecida.");
			return true;
		} catch (SQLException erroSQL) {
			System.out.println("Erro na conexão com o Banco " + erroSQL.getMessage());
			return false;
		} catch (ClassNotFoundException erroClass) {
			System.out.println("Erro ao carregar o Driver " + erroClass.getMessage());
			return false;
		} catch (Exception e) {
			System.out.println("Ocoreru um erro: " + e.getMessage());
			return false;
		}
	}

	public static boolean desconecta() {
		try {
			conexao.close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
}