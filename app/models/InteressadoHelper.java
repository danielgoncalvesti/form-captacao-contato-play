package models;

import java.util.List;

public class InteressadoHelper {

	public static void salvar(Interessado interessado){
		interessado.save();
	}
	public static List<Interessado> getInteressadoByEmail(String emailTentado) {
		List<Interessado> interessado = Interessado.find.query().where()
				.ilike("email", emailTentado)
				.setFirstRow(0)
				.setMaxRows(1)
				.findPagedList()
				.getList();
		
		return interessado;
	}
}
