import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../service/auth.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  errorMessage = '';

  constructor(private authService: AuthService, private router: Router, private fb: FormBuilder) {
    this.loginForm = this.fb.group({
      usuario: ['', [Validators.required, Validators.pattern(/^[a-zA-Z0-9]+$/)]],
      senha: ['', [Validators.required, Validators.pattern(/^[0-9]+$/)]]
    });
  }

  ngOnInit() {
  }

  onSubmit() {
    if (this.loginForm.valid) {
      this.authService.login(this.loginForm.value.usuario, this.loginForm.value.senha).subscribe(
        () => {
          this.router.navigate(['/']);
        },
        () => {
          this.errorMessage = 'Usuário ou senha incorretos.';
        }
      );
    }
  }
}