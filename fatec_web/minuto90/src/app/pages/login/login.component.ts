import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  loginForm: FormGroup;

  constructor(private fb: FormBuilder, private router: Router) {
    this.loginForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
      senha: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  onEntrar() {
    if (this.loginForm.valid) {
      const { email, senha } = this.loginForm.value;
      // Armazenar email e senha (simulação estática)
      console.log(`Email: ${email}, Senha: ${senha}`);
      this.router.navigate(['/']);
    }
  }

  irParaCadastro() {
    this.router.navigate(['/cadastro']);
  }
}
