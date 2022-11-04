package pojo;

public class usuarioImplMongo implements IUsuario {

	@Override
	public void insertarUsuario() {
		System.out.println("Insertando usuario desde Mongo");

	}

	@Override
	public void eliminarUsuarioById(int id) {
		System.out.println("Eliminando usuario con Id: "+id);

	}

}
