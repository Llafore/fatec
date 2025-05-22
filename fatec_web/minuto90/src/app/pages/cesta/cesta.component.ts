import { Component } from '@angular/core';

@Component({
  selector: 'app-cesta',
  templateUrl: './cesta.component.html',
  styleUrls: ['./cesta.component.scss']
})
export class CestaComponent {

  itens = [
    { nome: 'São Paulo 06', quantidade: 2, valor: 150.00, imagem: 'assets/produtos/00002/spfc-06-home01.png' }
  ];

  get total(): number {
    return this.itens.reduce((acc, item) => acc + (item.valor * item.quantidade), 0);
  }

  limparCesta(): void {
    alert('em breve...');
  }

  finalizarCesta(): void {
    alert('em breve...');
  }
}
