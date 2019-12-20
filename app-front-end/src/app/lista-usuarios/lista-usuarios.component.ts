import { Component, OnInit } from '@angular/core';
import { UsuariosService } from '../usuarios.service';
import { Usuario } from 'src/entidades/Usuario';

@Component({
  selector: 'app-lista-usuarios',
  templateUrl: './lista-usuarios.component.html',
  styleUrls: ['./lista-usuarios.component.css']
})
export class ListaUsuariosComponent implements OnInit {

  listaUsu: Usuario[];

  constructor(public srvUsu: UsuariosService) { }

  ngOnInit() {
    this.listaUsu = this.srvUsu.geTodosUsuarios()
    }

}
