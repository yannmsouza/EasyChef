package test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO extends BancodeDados {
	public void listarUsuarios() {
		try {
			java.sql.Statement st = (java.sql.Statement) conexao.createStatement();
			ResultSet rs = ((java.sql.Statement) st).executeQuery("SELECT * FROM usuarios");
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		} catch (SQLException e) {
		}
	}

	public void loginUsuario(String email) {
		try {
			java.sql.Statement st = (java.sql.Statement) conexao.createStatement();
			ResultSet rs = ((java.sql.Statement) st)
					.executeQuery("SELECT senha FROM usuarios WHERE email= '" + email + "'");
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
		}
	}

	public static void main(String args[]) {
		UsuarioDAO u = new UsuarioDAO();
		u.listarUsuarios();
		u.loginUsuario("yannmsouza@hotmail.com");
	}
}
