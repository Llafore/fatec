import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-detalhes',
  templateUrl: './detalhes.component.html',
  styleUrl: './detalhes.component.scss'
})
export class DetalhesComponent {
  constructor(private router: Router) {};

  onComprarClick(){
    this.router.navigate(['./cesta'])
  }
}
