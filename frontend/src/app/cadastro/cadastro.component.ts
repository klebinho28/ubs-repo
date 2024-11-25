import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-cadastro',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {
  nomeCompleto = "Digite seu Nome Completo";
  nomeSocial = "Digite seu nome social";
  nomeM  = "Digite o nome completo da Mãe";
  nomePai = "Digite o nome completo do Pai"
  DataNascimento = "__/__/__"
  Sexo = "Selecione sua sexualidade"
  Nacionalidade = "Selecione sua nacionalidade"
  MunicipiodeNascimento = "ex: Ijui RS, Contagem MG etc.."
  Ra ="Branca,Negra,Parda etc."
  SituacaoFamiliar = "Situação Familiar"
  FrequentaEscola = "Escolaridade"
  EstabelecimentoVeiculo  = "2091321 CSE GERALDO DE PAULA SOUZA"
  EstabelecimentoCadastro = "2091321 CSE GERALDO DE PAULA SOUZA"
  Deficiencia = "Possui alguma deficiência "
  Visual = "Visual"
  Auditiva = "Auditiva"
  Motora = "Motora"
  Intelectual = "Intelectual"
  TelefoneCelular = "(00)00000-0000"
  TelefoneResidencial = "(00)00000-0000"
  TelefoneComercial = "(00)00000-0000"
  Contato = "Contato"
  Email = "Digite seu Email"


}
