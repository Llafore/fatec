import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { BuscaComponent } from './pages/busca/busca.component';
import { LoginComponent } from './pages/login/login.component';
import { CadastroComponent } from './pages/cadastro/cadastro.component';
import { DetalhesComponent } from './pages/detalhes/detalhes.component';
import { CestaComponent } from './pages/cesta/cesta.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'busca', 
    component : BuscaComponent
  },
  { 
    path: 'login',
    component: LoginComponent 
  },
  { path: 'cadastro',
    component: CadastroComponent 
  },
  {
    path: 'detalhes',
    component: DetalhesComponent
  },
  {
    path: 'cesta',
    component: CestaComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
