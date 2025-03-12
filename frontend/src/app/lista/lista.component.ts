import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Paciente } from '../model/paciente.model';
import { PacienteService } from '../service/paciente.service';

@Component({
  selector: 'app-lista',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css'],
  providers: [PacienteService]
})
export class ListaComponent {



  cancelarEdicao() {
    this.pacienteSelecionado = null; // Esconde o formulário de edição
  }

  pacienteSelecionado: any = {
    nomeCompleto: '',
    cpf: '',
    telefoneCelular: '',
    email: '',
    endereco: '' // <-- Adicionado aqui
  };



  mensagem: string = "";
  pacientes: Paciente[] = [];


  constructor(private service: PacienteService) {
    this.listar();
  }

  listar() {
    this.service.listar().subscribe({
      next: (data) => { this.pacientes = data; },
      error: () => { this.mensagem = "Ocorreu um erro ao carregar os pacientes."; }
    });
  }

  editar(codigo: number) {
    this.service.buscarPorCodigo(codigo).subscribe({
      next: (paciente: Paciente) => {
        console.log('Paciente encontrado:', paciente);
        this.pacienteSelecionado = { ...paciente, codigo: paciente.codigo ?? 0 };
      },
      error: (erro) => {
        console.error('Erro ao carregar os dados do paciente:', erro);
      }
    });
  }
 
  salvarEdicao(paciente: Paciente) {

    console.log("Paciente selecionado antes de envio:",paciente);

    if (!paciente || !paciente.codigo) {
      console.error("Paciente inválido!", paciente);
      return;
    }
 
    this.service.alterar(paciente).subscribe({
      next: () => {
        console.log('Paciente atualizado com sucesso!');
        this.mensagem = 'Paciente atualizado com sucesso!';
        this.listar(); // Atualiza a lista de pacientes
        this.pacienteSelecionado = null; // Fecha o formulário de edição
      },
      error: (err: any) => {
        console.error('Erro ao atualizar paciente:', err);
        this.mensagem = 'Erro ao atualizar paciente';
      }
    });
  }
 
  
 
  remover(codigo: number) {
    if (!codigo) {
      console.error('Código inválido para remoção');
      return;
    }
 
    if (confirm('Tem certeza que deseja remover este paciente?')) {
      this.service.remover(codigo).subscribe({
        next: (response) => {  
          console.log(response.mensagem);  
          this.mensagem = response.mensagem;
          this.listar();
        },
        error: (erro) => {
          console.error('Erro ao remover paciente:', erro);
          this.mensagem = 'Erro ao remover paciente';
        }
      });
    }
  }
}
 