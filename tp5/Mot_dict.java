package tp5;

public class Mot_dict {
	private String mot;
	private String definition;
	public Mot_dict(String mot,String definition){
		this.mot=mot;
		this.definition=definition;
	}
	public String getMot() {
		return mot;
	}
	public String getDefinition() {
		return definition;
	}
	public void setdefintion(String definition) {
		this.definition=definition;
	}
	public void setMot(String mot) {
		this.mot=mot;
	}
	@Override
	public String toString() {
		return (mot+"="+definition);
	}
	public boolean synonyme(String def) {
		return this.definition==def;
	}
	public boolean synonyme(Mot_dict M){
		 return this.definition.equals(M.definition);
		/*return M.compareTO(defintion);*/
       }
}
