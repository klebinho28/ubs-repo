import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private apiUrl = 'http://localhost:4200/login'; // Substitua pela URL da sua API

  constructor(private http: HttpClient) { }

  login(usuario: string, senha: string): Observable<any> {
    return this.http.post(this.apiUrl, { usuario, senha }).pipe(
      tap(response => {
        // Lógica para lidar com a resposta do backend
       
      })
    );
  }

  logout(): void {
    localStorage.removeItem('token');
  }

  isAuthenticated(): boolean {
    return !!localStorage.getItem('token');
  }

  getToken(): string | null {
    return localStorage.getItem('token');
  }
}