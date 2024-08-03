package ExamenCuscatlan;

import ExamenCuscatlan.biblioteca.*;
import ExamenCuscatlan.repositorio.LecturaRepositorio;
import ExamenCuscatlan.repositorio.MaterialRepositorio;
import ExamenCuscatlan.repositorio.PedidoRepositorio;

public class Biblioteca {
    public static void main(String[] args) {
        // Crear repositorios
        LecturaRepositorio lecturaRepositorio = new LecturaRepositorio();
        PedidoRepositorio pedidoRepositorio = new PedidoRepositorio();
        MaterialRepositorio materialRepositorio = new MaterialRepositorio();

        // Crear instancias de lectores
        Estudiante estudiante = new Estudiante ("Carlos Mendoza", "Calle al Volcan", "7741-8888", "RJ195425");
        Docente docente = new Docente("Gabriel Monge", "Calle la Mascota", "7896547", "IOP9987");

        // Agregar lectores al repositorio
        lecturaRepositorio.agregar(estudiante);
        lecturaRepositorio.agregar(docente);

        // Crear material
        Libro libro = new Libro("El Quijote", "Pasta Dura", "Miguel de Cervantes", "Santillana");
        Revista revista = new Revista("National Geographic", "Pasta Blanda");

        // Agregar material al repositorio
        materialRepositorio.agregar(libro);
        materialRepositorio.agregar(revista);

        // Crear un pedido
        Pedido pedido = new Pedido(6, "La Divina Comedia", "L001");
        pedido.add(pedido);

        // Asociar el pedido al lector
        estudiante.agregarPedido(pedido);

        // Crear un bibliotecario y gestionar el pedido
        Bibliotecario bibliotecario = new Bibliotecario(1);
        bibliotecario.reserva(pedido, "2023-08-01");
        bibliotecario.entrega(pedido, "2023-08-15");

        // Imprimir detalles
        System.out.println("Estudiante: " + estudiante.getNombre() + " ha realizado el pedido del libro de " + libro.getAutor());
        System.out.println("Estudiante: " + estudiante.getNombre()+ " realizo un pedido del autor " + libro.getAutor());
        System.out.println("ID de usuario : " + pedido.getIdUsuario());
    }
}
