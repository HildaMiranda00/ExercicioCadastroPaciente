
public class Paciente {
	String codigo;
	String nome;
	String dataNascimento;
	String sexo;
	String planoSaude;
	String alergia;
	String tipoSanguineo;
	
public Paciente (String codigo,String nome,String dataNascimento,String sexo,String planoSaude,String alergia,String tipoSanguineo) {
this.codigo = codigo;
this.nome = nome;
this.dataNascimento = dataNascimento;
this.sexo = sexo;
this.planoSaude = planoSaude;
this.alergia = alergia;
this.tipoSanguineo = tipoSanguineo;
}
public void Status() {
	System.out.println(this.codigo);
	System.out.println(this.nome);
	System.out.println(this.dataNascimento);
	System.out.println(this.sexo);
	System.out.println(this.planoSaude);
	System.out.println(this.alergia);
	System.out.println(this.tipoSanguineo);
}
}

