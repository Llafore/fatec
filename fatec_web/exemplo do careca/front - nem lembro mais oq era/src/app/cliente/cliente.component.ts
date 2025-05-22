import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Cliente } from '../model/cliente';

@Component({
  selector: 'app-cliente',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './cliente.component.html',
  styleUrl: './cliente.component.css'
})
export class ClienteComponent {
  public mensagem: string = "";
  public obj: Cliente = new Cliente();

  public gravar(){
    localStorage.setItem("cliente", JSON.stringify(this.obj));
    this.mensagem = "cadastro atualizado com sucesso!";
  }

  public carregar(){
    let json = localStorage.getItem("cliente");
    if(json==null){
      window.location.href="./login";
    } else {
      this.obj = JSON.parse(json);
    }
  }

  constructor(){
    this.carregar();
  }

}
