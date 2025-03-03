import { Routes } from '@angular/router';
import { CadastroComponent } from './cadastro/cadastro.component';
import { ListaComponent } from './lista/lista.component';
import { UploadComponent } from './upload/upload.component';
import { LoginComponent } from './login/login.component';
import { Tela2Component } from './Tela2/tela2.component';  // Corrigido o caminho e o nome do componente

export const routes: Routes = [
  { path: 'cadastro', component: CadastroComponent },
  { path: '', component: Tela2Component },  // Página inicial
  { path: 'login', component: LoginComponent },
  { path: 'lista', component: ListaComponent },
  { path: 'upload', component: UploadComponent }
];
