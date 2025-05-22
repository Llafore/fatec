import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { SharedService } from '../../shared.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})

export class HeaderComponent {
  public searchValue: string = '';
  constructor(private router: Router, private sharedService: SharedService){}

  onSearchClick() {
    this.sharedService.changeSearch(this.searchValue);
    this.router.navigate(['/busca']);
  }
  onHomeClick(){
    this.router.navigate(['/'])
  }
  onLoginClick(){
    this.router.navigate(['./login'])
  }
}
