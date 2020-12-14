package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
public void crearEmpleado (Empleado emple) {
    controlPersis.crearEmpleado(emple);
}

public void eliminarEmpleado (Empleado emple) {
    controlPersis.eliminarEmpleado(emple);
}

public void editarEmpleado (Empleado emple) {
    controlPersis.editarEmpleado(emple);
}

public void listarEmpleados (Empleado emple) {
    controlPersis.mostrarEmpleados();
}

public void buscarEmpleado (Empleado emple) {
    controlPersis.buscarEmpleado();
}

public void crearHorario (Horario hora) {
    controlPersis.crearHorario(hora);
}

public void eliminarHorario (Horario hora) {
    controlPersis.eliminarHorario(hora);
}

public void editarHorario (Horario hora) {
    controlPersis.editarHorario(hora);
}

public void listarHorarios (Horario hora) {
    controlPersis.mostrarHorarios();
}

public void buscarHorario (Horario hora) {
    controlPersis.buscarHorario();
}

public void crearJuego (Juego jue) {
    controlPersis.crearJuego(jue);
}

public void eliminarJuego (Juego jue) {
    controlPersis.eliminarJuego(jue);
}

public void editarJuego (Juego jue) {
    controlPersis.editarJuego(jue);
}

public void listarJuegos (Juego jue) {
    controlPersis.mostrarJuegos();
}

public void buscarJuego (Juego jue) {
    controlPersis.buscarJuego();
}

public void crearPersona (Persona perso) {
    controlPersis.crearPersona(perso);
}

public void eliminarPersona (Persona perso) {
    controlPersis.eliminarPersona(perso);
}

public void editarPersona (Persona perso) {
    controlPersis.editarPersona(perso);
}

public void listarPersonas (Persona perso) {
    controlPersis.mostrarPersonas();
}

public void buscarPersona (Persona perso) {
    controlPersis.buscarPersonas();
}

public void crearTicket (Ticket tick) {
    controlPersis.crearTicket(tick);
}

public void eliminarTicket (Ticket tick) {
    controlPersis.eliminarTicket(tick);
}

public void editarTicket (Ticket tick) {
    controlPersis.editarTicket(tick);
}

public void listarTicket (Ticket tick) {
    controlPersis.mostrarTickets();
}

public void buscarTicket (Ticket tick) {
    controlPersis.buscarTicket();
}


public void crearUsuario (Usuario usu) {
    controlPersis.crearUsuario(usu);
}

public void eliminarUsuario (Usuario usu) {
    controlPersis.eliminarUsuario(usu);
}

public void editarUsuario (Usuario usu) {
    controlPersis.editarUsuario(usu);
}

public void listarUsuario (Usuario usu) {
    controlPersis.mostrarUsuarios();
}

public void buscarUsuario (Usuario usu) {
    controlPersis.buscarUsuario();
}

}
