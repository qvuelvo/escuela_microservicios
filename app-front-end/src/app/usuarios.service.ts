import { Injectable } from '@angular/core';
import { Usuario } from 'src/entidades/Usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  listaUsuarios: Usuario[];

  constructor() {
    this.listaUsuarios = [
      {id: 1, nombre:"Pako",email:"pak@em.com",password:"123",idTemaPreferido: 1},
      {id: 1, nombre:"Choni",email:"choni@em.com",password:"1233",idTemaPreferido: 2},
    ]
   }

   public geTodosUsuarios(): Usuario[]{
     return this.listaUsuarios;
   }
}
