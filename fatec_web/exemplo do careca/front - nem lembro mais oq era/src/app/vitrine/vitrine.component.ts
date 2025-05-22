import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Produto } from '../model/produto';
@Component({
  selector: 'app-vitrine',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './vitrine.component.html',
  styleUrl: './vitrine.component.css'
})
export class VitrineComponent {
  public mensagem: string = "conheça as nossas promoções";
  public lista: Produto[] = [
    {codigo:1, nome:"Martelo", descritivo:"martelo cabo de borracha",
      valor:30.00, quantidade:10, keywords:"ferramentas manuais"},
    {codigo:2, nome:"Picareta", descritivo:"picareta cabo de borracha",
    valor:40.00, quantidade:10, keywords:"ferramentas manuais"},
    {codigo:3, nome:"Pa", descritivo:"pa cabo de borracha",
    valor:50.00, quantidade:10, keywords:"ferramentas manuais"},
    {codigo:4, nome:"Machado", descritivo:"machado cabo de borracha",
    valor:60.00, quantidade:0, keywords:"ferramentas manuais"} 
  ];

  public verDetalhe(item:Produto){
    localStorage.setItem("produto", JSON.stringify(item));
    window.location.href = "./detalhe";  
  }

}
