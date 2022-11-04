package pojo;

public class usuarioImplOracle implements IUsuario{

	@Override
	public void insertarUsuario() {
		// TODO Auto-generated method stub
		System.out.println("Insertando Usuario desde usuarioImplOracle");
	}

	@Override
	public void eliminarUsuarioById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando usuario con Id: "+id);
	}

}
