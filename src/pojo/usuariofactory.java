package pojo;

public class usuariofactory {
	
	IUsuario usr;
	
	public usuariofactory(IUsuario usr) {
		this.usr = usr;
	}
	public void getInsertarUsuario() {
		usr.insertarUsuario();
	}
	
	public void getEliminarusuarioById(int id) {
		usr.eliminarUsuarioById(id);
	}

}
