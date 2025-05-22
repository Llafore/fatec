import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrl: './produto.component.scss'
})
export class ProdutoComponent {
  constructor(private router: Router){}

  onDetalhesClick(){
    this.router.navigate(['./detalhes'])
  }
  onComprarClick(){
    this.router.navigate(['./cesta'])
  } 
}
 