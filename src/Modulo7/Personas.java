package Modulo7;

public class Personas {

	
		private String apellido;
		private String nombre;
		
		public Personas () {
		
				}
		public Personas (String apellido, String nombre) {
			
		}
		
		 public String getApellido() {
			return apellido;
		}
		 public String getNombre() {
			return nombre;
		}
		 public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		 public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		 @Override
		public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
		}
		 @Override
		public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
		}@Override
		public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		}
		 

}