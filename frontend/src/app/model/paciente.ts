export class Paciente {

  public codigo?: number;
  public nome: string ='';
  public nomeSocial?: string ='';
  public nomeMae?: string ='';
  public nomePai?:string = '';


  //Dados de Nascimento e Sexo
  public dataNascimento = new Date();
  public sexo:'Masculino'| 'Feminino'| 'Outro' = 'Feminino';

  //Loaclidade
  public Raca!: 'Branca' | 'Preta' | 'Parda' | 'Amarela' | 'Indigina';
  public Nacionalidade:string ='';
  public MunicipioNascimento:string='';
  public FrequentaEscola?: 'Sim' | 'Não';


  public deficiencia?: 'Sim' | 'Não';
  public visual?: 'Sim' | 'Não';
  public auditiva?: 'Sim'| 'Não';
  public motora?: 'Sim' | 'Não';
  public intelectual?: 'Sim' | 'Não';

  //Dados de Contato

 public contatoCelular:string='';
 public contatoResidencial:string='';
 public contatoComercial:string='';
 public contatoEmail:string='';

 constructor(init?:Partial<Paciente>){
  Object.assign(this, init);
 }





}
