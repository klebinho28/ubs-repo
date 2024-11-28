import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Paciente } from '../model/paciente';
import { Observable } from 'rxjs';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';

@Injectable({
  providedIn: 'root'
})
export class PacienteService {

  constructor(private http:HttpClient) { }
  gravar(obj:Paciente):Observable<any>{
    return this.http.post("http://localhost:8080/api/paciente",obj);
  }
  alterar(obj:Paciente):Observable<any>{
    return this.http.put("http://localhost:8080/api/paciente",obj);
  }
  remover(codigo:number):Observable<any>{
    return this.http.delete("http://localhost:8080/api/paciente"+ codigo);
  }
  ler(codigo:number):Observable<any>{
    return this.http.get("http://localhost8080/api/paciente"+codigo);
  }
  listar():Observable<any>{
    return this.http.get("http://localhost:8080/api/paciente");
  }
}