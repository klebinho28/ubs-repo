export class Paciente {

  // Informações pessoais
  pacienteSelecionado?: Paciente;

  public codigo?: number; // Código do paciente
  public nomeCompleto: string = ''; // Nome completo
  public cpf:string='';
  public nomeSocial?: string; // Nome social (opcional)
  public nomeMae?: string; // Nome da mãe (opcional)
  public nomePai?: string; // Nome do pai (opcional)

  // Dados de nascimento
  public dataNascimento: Date = new Date(); // Data de nascimento
  public sexo: 'Masculino' | 'Feminino' | 'Outro' = 'Masculino'; // Sexo

  // Localidade
  public nacionalidade: string = ''; // Nacionalidade
  public municipioNascimento: string = ''; // Município de nascimento
  public Escolaridade:string = '';
  public estabelecimentoVinculo:string='';
  public estabelecimentoCadastro:string ='';

  // Outros dados
  public racaCor: 'Branca' | 'Preta' | 'Parda' | 'Amarela' | 'Indígena' = 'Branca'; // Raça/Cor
  public frequentaEscola?: 'Sim' | 'Não'; // Frequenta escola (opcional)
 



  // Dados de deficiência
  public deficiente?: 'Sim' | 'Não'; // Se o paciente possui deficiência
  public visual?: 'Sim' | 'Não'; // Deficiência visual
  public auditiva?: 'Sim' | 'Não'; // Deficiência auditiva
  public motora?: 'Sim' | 'Não'; // Deficiência motora
  public intelectual?: 'Sim' | 'Não'; // Deficiência intelectual

  // Dados de contato
  public telefoneCelular: string = ''; // Celular
  public telefoneResidencial?: string; // Telefone residencial (opcional)
  public contatoComercial?: string; // Telefone comercial (opcional)
  public email: string = ''; // Email
  public endereco:string='';
  



  constructor(init?: Partial<Paciente>) {
    Object.assign(this,init);
}
}
