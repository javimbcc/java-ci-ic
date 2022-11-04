package pojo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usuariofactory obj = new usuariofactory(new usuarioImplMongo());
		
		obj.getInsertarUsuario();
		obj.getEliminarusuarioById(1);
		
	}

}
