import { Injectable } from '@angular/core';
import { Usuario } from 'src/entidades/Usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuariosService {

  listaUsuarios: Usuario[];

  constructor() { }
}
