import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SharedService {
  private searchSource = new BehaviorSubject<string>('');  // Valor inicial
  currentSearch = this.searchSource.asObservable();  // Observable para escutar as mudanças

  changeSearch(value: string) {
    this.searchSource.next(value);  // Atualiza o valor do BehaviorSubject
  }
}
