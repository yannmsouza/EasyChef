package test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReceitaDAO extends BancodeDados {
	public void listarReceitas() {
		try {
			Statement st = (Statement) conexao.createStatement();
			ResultSet rs = ((Statement) st).executeQuery("SELECT * FROM receitas");
			while (rs.next()) {
				System.out.println(" " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		} catch (SQLException e) {
		}
	}

	public boolean adicionarReceita(Receita receita) {
		String s = "INSERT INTO receitas VALUES ('" + receita.getNome() + "'," + " '"
				+ receita.getIngredientes() + "', '" + receita.getDescricao() + "', '" + receita.getModoPreparo()
				+ "', '" + receita.getTempoPreparo() + "', '" + receita.getTeorCal() + "', '"
				+ receita.getAvaliacao() + "', '" + receita.getObservacoes() + "', '"
				+ receita.getIdUsuario() + "', '" + receita.getIdCategoria() + "')";
		System.out.println(s);
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO receitas"
					+ "(nome, ingredientes, descricao, modo_preparo, tempo_preparo, teor_calorico, avaliacao, observacoes, id_usuario, id_categoria)"
					+ " VALUES ('" + receita.getNome() + "'," + " '"
					+ receita.getIngredientes() + "', '" + receita.getDescricao() + "', '" + receita.getModoPreparo()
					+ "', '" + receita.getTempoPreparo() + "', '" + receita.getTeorCal() + "', '"
					+ receita.getAvaliacao() + "', '" + receita.getObservacoes() + "', '"
					+ receita.getIdUsuario() + "', '" + receita.getIdCategoria() + "')");
			
			return true;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public static void main(String args[]) {
		ReceitaDAO r = new ReceitaDAO();
		r.listarReceitas();
		Receita rei = new Receita("Arroz", "- Arroz - Batata", "Muito bom", "Água Fervida em 15min", "Cuidado", "", 10,
				10, 5);
		rei.setIdUsuario(1);
		rei.setIdCategoria(2);
		r.adicionarReceita(rei);
		r.listarReceitas();
	}

}
