
package Datos;

import Entidades.Carrera;
import Entidades.Docente;
import Entidades.Facultades;
import Entidades.Materia;
import java.util.ArrayList;

public class LLenadoListas {
    public ArrayList<Facultades>lFacultades = new ArrayList<>();
    
     public void llenadoDeListasEstaticas(){
        //FACULTAD DE INGENIERIA Y ARQUITECTURA
        this.lFacultades.add(new Facultades("Facultad de Ingenieria y Arquitectura"));
        this.lFacultades.get(0).lCarreras= new ArrayList<>();
        
        //CARRERAS
        
        //Ing. Desarrollo de Software
        this.lFacultades.get(0).lCarreras.add(new Carrera("Ingenieria en Desarrollo de Software"));
        this.lFacultades.get(0).lCarreras.get(0).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(0).lCarreras.get(0).lMaterias.add(new Materia("021", "Desarrollo del Pensamiento Matematico Avanzado", 
                new Docente("Claudia", "del Aguila"), "Lunes", "6:45 am - 8;25 am", "Miércoles", "8:25 am - 10:55 am", "C23"));
        this.lFacultades.get(0).lCarreras.get(0).lMaterias.add(new Materia("034", "Programacion Orientada a Objetos", 
                new Docente("Arturo", "de Leon"), "Martes", "10:05 am - 11:45 am", "Jueves", "6:45 am - 8:25 am", "B45"));
        this.lFacultades.get(0).lCarreras.get(0).lMaterias.add(new Materia("027", "Manejo de Estructura de Datos", 
                new Docente("Carlos", "Martinez"), "Miercoles", "2:00 pm - 3:30 pm", "Jueves", "10:05 am ' 11:45 am", "C35"));
        this.lFacultades.get(0).lCarreras.get(0).lMaterias.add(new Materia("022", "Desarrollo del Pensamiento Teologico", 
                new Docente("Ernesto", "Grijalva"), "Lunes", "8:25 am - 10:05 am", "Viernes", "9:15 am - 10:55 am", "G22"));
        this.lFacultades.get(0).lCarreras.get(0).lMaterias.add(new Materia("030", "COnfiguracion de Redes Informaticas", 
                new Docente("Rafael", ""), "Martes", "8:25 am - 10:05 am", "Viernes", "6:45 am - 8:25 am", "C31"));
        
        //Ing. en Sistemas
        this.lFacultades.get(0).lCarreras.add(new Carrera("Ingenieria en Sistemas Informaticos"));
        this.lFacultades.get(0).lCarreras.get(1).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(0).lCarreras.get(1).lMaterias.add(new Materia("132", "Estadistica", 
                new Docente("Steven", "Melara"), "Lunes", "10:05 am ' 11:45 am", "Miercoles", "10:05 am - 11:45 am", "C21"));
        this.lFacultades.get(0).lCarreras.get(1).lMaterias.add(new Materia("143", "Fisica I", 
                new Docente("Francisco", "Tejada"), "Martes", "8:25 am - 10:05 am", "Jueves", "8:25 am - 10:05 am", "C32"));
        this.lFacultades.get(0).lCarreras.get(1).lMaterias.add(new Materia("135", "Tecnologias Web", 
                new Docente("Jefferson", "Guevara"), "Martes", "10:05 am - 11:45 am", "Miércoles", "8:25 am - 10:05 am", "B32"));
        this.lFacultades.get(0).lCarreras.get(1).lMaterias.add(new Materia("142", "Sistemas Operativos", 
                new Docente("Esmeralda", "Torres"), "Jueves", "10:05 am - 11:45 am", "Viernes", "10:05 am - 11:45 am", "A32"));
        this.lFacultades.get(0).lCarreras.get(1).lMaterias.add(new Materia("137", "Auditoria de Sistemas", 
                new Docente("Christopher", "Perez"), "Martes", "2:00 pm - 3:30 pm", "Viernes", "2:00 pm - 3:30 pm", "C11"));
        
        //Ing. Industrial
        this.lFacultades.get(0).lCarreras.add(new Carrera("Ingenieria Industrial"));
        this.lFacultades.get(0).lCarreras.get(2).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(0).lCarreras.get(2).lMaterias.add(new Materia("342", "Ingenieria Economica", 
                new Docente("Felipe", "Zepeda"), "Lunes", "10:05 am - 11:45 am", "Miercoles", "10:05 am - 11:45 am", "C33"));
        this.lFacultades.get(0).lCarreras.get(2).lMaterias.add(new Materia("349", "Mecanica de los Solidos III", 
                new Docente("Pedro", "Alvarez"), "Martes", "8:25 am - 10:05 am", "Jueves", "8:25 am - 10:05 am", "C14"));
        this.lFacultades.get(0).lCarreras.get(2).lMaterias.add(new Materia("355", "Ingenieria de Metodos", 
                new Docente("Luisa", "Gutierrez"), "Lunes", "8:25 am - 10:05 am", "Martes", "10:05 am - 11:45 am", "B21"));
        this.lFacultades.get(0).lCarreras.get(2).lMaterias.add(new Materia("344", "Higiene y Seguridad Industrial", 
                new Docente("Rodolfo", "España"), "Juves", "6:45 am - 8:25 am", "Viernes", "6:45 am - 8:25 am", "C33"));
        this.lFacultades.get(0).lCarreras.get(2).lMaterias.add(new Materia("353", "Tecnologia Industrial I", 
                new Docente("Alba", "Medina"), "Miercoles", "8:25 am - 10:05 am", "Viernes", "8:25 am - 10:05 am", "B39"));
        
        //Arquitectura
        this.lFacultades.get(0).lCarreras.add(new Carrera("Arquitectura"));
        this.lFacultades.get(0).lCarreras.get(3).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(0).lCarreras.get(3).lMaterias.add(new Materia("174", "Diseño Arquitectonico I", 
                new Docente("Ramon", "Fernandez"), "Lunes", "2:00 pm - 3:30 pm", "Martes", "2:00 pm - 3:30 pm", "C22"));
        this.lFacultades.get(0).lCarreras.get(3).lMaterias.add(new Materia("180", "Taller de Maquetas", 
                new Docente("Patricia", "Escobar"), "Miercoles", "3:55 pm - 4:45 pm", "Jueves", "3:55 pm - 4:45 pm", "C45"));
        this.lFacultades.get(0).lCarreras.get(3).lMaterias.add(new Materia("185", "Medio Ambiente", 
                new Docente("Andres", "Perez"), "Martes", "3:55 pm - 4:45 pm", "Jueves", "2:00 pm - 3:30 pm", "C11"));
        this.lFacultades.get(0).lCarreras.get(3).lMaterias.add(new Materia("176", "Vivienda", 
                new Docente("Mauricio", "Nuñez"), "Lunes", "3:55 pm - 4:45 pm", "Viernes", "3:55 pm - 4:45 pm", "C33"));
        this.lFacultades.get(0).lCarreras.get(3).lMaterias.add(new Materia("171", "Urbanismo I", 
                 new Docente("Nuria", "Ayala"), "Jueves", "4:50 pm - 5:40 pm", "Viernes", "2:00 pm - 3:30 pm", "G13"));
        
        //Ing. Agronomica
        this.lFacultades.get(0).lCarreras.add(new Carrera("Inegnieria Agronomica"));
        this.lFacultades.get(0).lCarreras.get(4).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(0).lCarreras.get(4).lMaterias.add(new Materia("070", "Biología General", 
                new Docente("Yesenia", "Aguilar"), "Lunes", "8:25 am - 10:05 am", "Miercoles", "8:25 am - 10:05 am", "H12"));
        this.lFacultades.get(0).lCarreras.get(4).lMaterias.add(new Materia("083", "Estadistica Aplicada", 
                new Docente("Jesus", "Portillo"), "Martes", "8:25 am - 10:05 am", "Jueves", "8:25 am - 10:05 am", "G7"));
        this.lFacultades.get(0).lCarreras.get(4).lMaterias.add(new Materia("072", "Genetica General", 
                new Docente("Adriana", "Lopez"), "Martes", "10:05 am - 11:45 am", "Viernes", "10:05 am - 11:45 am", "H32"));
        this.lFacultades.get(0).lCarreras.get(4).lMaterias.add(new Materia("077", "Cultivos Perennes", 
                new Docente("Alfonso", "Barillas"), "Lunes", "10:05 am - 11:45 am", "Jueves", "10:05 am - 11:45 am", "H17"));
        this.lFacultades.get(0).lCarreras.get(4).lMaterias.add(new Materia("085", "Bioquimica", 
                new Docente("Rafael", "Luna"), "Miercoles", "10:05 am - 11:45 am", "Viernes", "8:25 am - 10:05 am", "C25"));
        
        //=================================================================================================================(5)
        
        //FACULTAD DE CIENCIAS Y HUMANIDADES
        this.lFacultades.add(new Facultades("Facultad de Ciencias y Humanidades"));
        this.lFacultades.get(1).lCarreras = new ArrayList<>();
        
        //Lic. en Ciencias Juridicas
        this.lFacultades.get(1).lCarreras.add(new Carrera("Licenciatura en Ciencias Juridicas"));
        this.lFacultades.get(1).lCarreras.get(0).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(1).lCarreras.get(0).lMaterias.add(new Materia("122", "Derecho Tributario", 
                new Docente("Oscar", "Murillo"), "Lunes", "11:50 am - 12:40 pm", "Miercoles", "11:50 am - 12:40 pm", "B21"));
        this.lFacultades.get(1).lCarreras.get(0).lMaterias.add(new Materia("131", "Derecho Civil II", 
                new Docente("Teresa", "Moran"), "Martes", "2:00 pm - 3:30 pm", "Jueves", "2:00 pm - 3:30 pm", "B12"));
        this.lFacultades.get(1).lCarreras.get(0).lMaterias.add(new Materia("127", "Derecho Internacional", 
                new Docente("Michelle", "Anaya"), "Martes", "3:55 pm - 4:45 pm", "Viernes", "3:55 pm - 4:45 pm", "B25"));
        this.lFacultades.get(1).lCarreras.get(0).lMaterias.add(new Materia("134", "Criminologia", 
                new Docente("Pablo", "Cortez"), "Lunes", "2:00 pm - 3:30 pm", "Jueves", "3:55 pm - 4:45 pm", "B33"));
        this.lFacultades.get(1).lCarreras.get(0).lMaterias.add(new Materia("128", "Derecho Agroambiental", 
                new Docente("Josue", "Sanchez"), "Miercoles", "2:00 pm - 3:30 pm", "Viernes", "2:00 pm - 3:30 pm", "B25"));
        
        //lic. en Educacion Basica
        this.lFacultades.get(1).lCarreras.add(new Carrera("Licenciatura en Educacion Basica"));
        this.lFacultades.get(1).lCarreras.get(1).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(1).lCarreras.get(1).lMaterias.add(new Materia("144", "Educacion y Sociedad", 
                new Docente("Patricia", "Callado"), "Lunes", "6:45 am - 8:25 am", "Miercoles", "6:45 am - 8:25 am", "B31"));
        this.lFacultades.get(1).lCarreras.get(1).lMaterias.add(new Materia("140", "Historia de El Salvador", 
                new Docente("Milena", "Estevez"), "Martes", "6:45 am - 8:25 am", "Jueves", "6:45 am - 8:25 am", "B24"));
        this.lFacultades.get(1).lCarreras.get(1).lMaterias.add(new Materia("147", "Bilogia y Nutricion Humana", 
                new Docente("Mauricio", "Figueroa"), "Martes", "8:25 am - 10:05 am", "Viernes", "8:25 am - 10:05 am", "B32"));
        this.lFacultades.get(1).lCarreras.get(1).lMaterias.add(new Materia("151", "Educacion Inclusiva", 
                new Docente("Luis", "Quinteros"), "Lunes", "8:25 am - 10:05 am", "Jueves", "8:25 am - 10:05 am", "B43"));
        this.lFacultades.get(1).lCarreras.get(1).lMaterias.add(new Materia("147", "Investigacion Educativa I", 
                new Docente("Karla", "Arevalos"), "Miercoles", "8:25 am - 10:05 am", "Viernes", "10:05 am - 11:45 am", "B03"));
        
        //Lic. en Idioma Ingles
        this.lFacultades.get(1).lCarreras.add(new Carrera("Licenciatura en Idioma Ingles"));
        this.lFacultades.get(1).lCarreras.get(2).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(1).lCarreras.get(2).lMaterias.add(new Materia("090", "Gramatica", 
                new Docente("Luis", "Polanco"), "Lunes", "3:55 pm - 4:45 pm", "Miercoles", "3:55 pm - 4:45 pm", "B13"));
        this.lFacultades.get(1).lCarreras.get(2).lMaterias.add(new Materia("091", "English Phonetics", 
                new Docente("Karina", "Alfaro"), "Martes", "3:55 pm - 4:45 pm", "Jueves", "3:55 pm - 4:45 pm", "B05"));
        this.lFacultades.get(1).lCarreras.get(2).lMaterias.add(new Materia("092", "Semiotics", 
                new Docente("Fernando", "Chicas"), "Martes", "4:50 pm - 5:40 pm", "Viernes", "4:50 pm - 5:40 pm", "B21"));
        this.lFacultades.get(1).lCarreras.get(2).lMaterias.add(new Materia("093", "English Literature", 
                new Docente("Paolo", "Osorio"), "Lunes", "4:50 pm - 5:40 pm", "Jueves", "4:50 pm - 5:40 pm", "B36"));
        this.lFacultades.get(1).lCarreras.get(2).lMaterias.add(new Materia("094", "Oratory and Protocol", 
                new Docente("Fernanda", "Pleitez"), "Miercoles", "4:50 pm - 5:40 pm", "Viernes", "5:45 pm - 6:35 pm", "B16"));
        
        //Lic. en en Periodismo
        this.lFacultades.get(1).lCarreras.add(new Carrera("Licenciatura en Periodismo"));
        this.lFacultades.get(1).lCarreras.get(3).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(1).lCarreras.get(3).lMaterias.add(new Materia("040", "Fotografia", 
                new Docente("Johanna", "Padilla"), "Lunes", "8:25 am - 10:05 am", "Miercoles", "8:25 am - 10:05 am", "B34"));
        this.lFacultades.get(1).lCarreras.get(3).lMaterias.add(new Materia("041", "Semiotica", 
                new Docente("Karen", "Lopez"), "Martes", "8:25 am - 10:05 am", "Jueves", "8:25 am - 10:05 am", "B22"));
        this.lFacultades.get(1).lCarreras.get(3).lMaterias.add(new Materia("042", "Taller de Periodismo para Radio", 
                new Docente("Oscar", "Pacheco"), "Martes", "10:05 am - 11:45 am", "Viernes", "10:05 am - 11:45 am", "B17"));
        this.lFacultades.get(1).lCarreras.get(3).lMaterias.add(new Materia("043", "Opinion Publica", 
                new Docente("Federico", "Linares"), "Lunes", "10:05 am - 11:45 am", "Jueves", "10:05 am - 11:45 am", "B28"));
        this.lFacultades.get(1).lCarreras.get(3).lMaterias.add(new Materia("044", "Comunicacion Politica", 
                new Docente("Melissa", "Torres"), "Miercoles", "10:05 am - 11:45 am", "Viernes", "6:45 am - 8:25 am", "B12"));
        //=========================================================================================================================(4)
        
        //Facultad ciencias empresariales(2)
        this.lFacultades.add(new Facultades("Facultad de Ciencias Empresariales"));
        this.lFacultades.get(2).lCarreras = new ArrayList<>();
        
        //Diseño Grafico(0)
        this.lFacultades.get(2).lCarreras.add(new Carrera("Diseño Grafico Publicitario"));
        this.lFacultades.get(2).lCarreras.get(0).lMaterias = new ArrayList<>();
        //Materias
        lFacultades.get(2).lCarreras.get(0).lMaterias.add(new Materia("0100", "Teoria de la Comunicacion", 
                new Docente("Raul", "Medina"), "Lunes", "6:45 am - 8:25 am", "Miercoles", "6:45 am - 8:25 am", "A25"));
        lFacultades.get(2).lCarreras.get(0).lMaterias.add(new Materia("0101", "Dibujo Humoristico Publicitario", 
                new Docente("Rene", "Orellana"), "Martes", "6:45 am - 8:25 am", "Jueves", "6:45 am - 8:25 am", "A35"));
        lFacultades.get(2).lCarreras.get(0).lMaterias.add(new Materia("0102", "Medios de Comunicacion", 
                new Docente("Marlon", "Moran"), "Martes", "8:25 am - 10:05 am", "Viernes", "8:25 am - 10:05 am", "B30"));
        lFacultades.get(2).lCarreras.get(0).lMaterias.add(new Materia("0103", "Empaques y Envases", 
                new Docente("Sofia", "Galdamez"), "Miercoles", "8:25 am - 10:05 am", "Viernes", "6:45 am - 8:25 am", "B46"));
        
        //Administracion de Empresas
        this.lFacultades.get(2).lCarreras.add(new Carrera("Administracion de Empresas"));
        this.lFacultades.get(2).lCarreras.get(1).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(2).lCarreras.get(1).lMaterias.add(new Materia("0200", "Contabilidad I", 
                new Docente("Mario", "Rivera"), "Lunes", "3:55 pm - 4:45 pm", "Miercoles", "3:55 pm - 4:45 pm", "A21"));
        this.lFacultades.get(2).lCarreras.get(1).lMaterias.add(new Materia("0201", "Matematica Financiera", 
                new Docente("Rolando", "Moran"), "Martes", "3:55 pm - 4:45 pm", "Jueves", "3:55 pm - 4:45 pm", "A21"));
        this.lFacultades.get(2).lCarreras.get(1).lMaterias.add(new Materia("0202", "Costeo Directo", 
                new Docente("Jose", "Sandoval"), "Martes", "4:50 pm - 5:40 pm", "Viernes", "4:50 pm - 5:40 pm", "A21"));
        this.lFacultades.get(2).lCarreras.get(1).lMaterias.add(new Materia("0203", "Gestion de Personal", 
                new Docente("Marlene", "Gutierrez"), "Lunes", "4:50 pm - 5:40 pm", "Jueves", "4:50 pm - 5:40 pm", "A35"));
        this.lFacultades.get(2).lCarreras.get(1).lMaterias.add(new Materia("0204", "SIstemas Presupuestarios", 
                new Docente("Juan", "Rivas"), "Miercoles", "4:50 pm - 5:40 pm", "Viernes", "5:45 pm - 6:35 pm", "A35"));
        
        //Mercadeo
        this.lFacultades.get(2).lCarreras.add(new Carrera("Mercadeo"));
        this.lFacultades.get(2).lCarreras.get(2).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(2).lCarreras.get(2).lMaterias.add(new Materia("0300", "Introduccion a la Economia", 
                new Docente("Josue", "Acosta"), "Lunes", "10:05 am - 11:45 am", "Miercoles", "10:05 am - 11:45 am", "B30"));
        this.lFacultades.get(2).lCarreras.get(2).lMaterias.add(new Materia("0301", "Contabilidad de Costos", 
                new Docente("Daniel", "Moran"), "Martes", "10:05 am - 11:45 am", "Jueves", "10:05 am - 11:45 am", "B30"));
        this.lFacultades.get(2).lCarreras.get(2).lMaterias.add(new Materia("0302", "Mercadeo Directo Integrado", 
                new Docente("David", "Galindo"), "Martes", "11:50 am - 12:40 pm", "Viernes", "11:50 am - 12:40 pm", "B30"));
        this.lFacultades.get(2).lCarreras.get(2).lMaterias.add(new Materia("0303", "Relaciones Publicas", 
                new Docente("Miguel", "Valle"), "Lunes", "11:50 am - 12:40 pm", "Jueves", "11:50 am - 12:40 pm", "B30"));
        this.lFacultades.get(2).lCarreras.get(2).lMaterias.add(new Materia("0304", "Ventas Internacionales", 
                new Docente("Claudia", "Rivas"), "Miercoles", "11:50 am - 12:40 pm", "Viernes", "10:05 am - 11:45 am", "B30"));
        
        //Lic en sistemas Informaticos Administrativos
        this.lFacultades.get(2).lCarreras.add(new Carrera("Lic en sistemas Informaticos Administrativos"));
        this.lFacultades.get(2).lCarreras.get(3).lMaterias = new ArrayList<>();
        //Materias
        this.lFacultades.get(2).lCarreras.get(3).lMaterias.add(new Materia("0400", "Programacion a Objetos I", 
                new Docente("Wilson", "Cordoba"), "Lunes", "2:00 pm - 3:30 pm", "Miercoles", "2:00 pm - 3:30 pm", "A45"));
        this.lFacultades.get(2).lCarreras.get(3).lMaterias.add(new Materia("0401", "Gestion Financiera", 
                new Docente("Alex", "Colocho"), "Martes", "2:00 pm - 3:30 pm", "Jueves", "2:00 pm - 3:30 pm", "A45"));
        this.lFacultades.get(2).lCarreras.get(3).lMaterias.add(new Materia("0402", "Sistemas Organizacionales", 
                new Docente("Andrea", "Bertrand"), "Martes", "3:55 pm - 4:45 pm", "Viernes", "3:55 pm - 4:45 pm", "A45"));
        this.lFacultades.get(2).lCarreras.get(3).lMaterias.add(new Materia("0403", "Programacion en Web II", 
                new Docente("Mario", "Galdamez"), "Lunes", "3:55 pm - 4:45 pm", "Jueves", "3:55 pm - 4:45 pm", "B45"));
        this.lFacultades.get(2).lCarreras.get(3).lMaterias.add(new Materia("0404", "Desarrollo de Software", 
                new Docente("Pedro", "Carcamo"), "Miercoles", "3:55 pm - 4:45 pm", "Viernes", "2:00 pm - 3:30 pm", "B45"));
        
        
        //Turismo
        lFacultades.get(2).lCarreras.add(new Carrera("Turismo"));
        lFacultades.get(2).lCarreras.get(4).lMaterias = new ArrayList<>();
        //Materias
        lFacultades.get(2).lCarreras.get(4).lMaterias.add(new Materia("0500", "Administracion Gastronomico", 
                new Docente("Raul", "Olivares"), "Lunes", "6:45 am - 8:25 am", "Miercoles", "6:45 am - 8:25 am", "A20"));
        lFacultades.get(2).lCarreras.get(4).lMaterias.add(new Materia("0501", "Relaciones Publicas y Eventos", 
                new Docente("Carlos", "Amaya"), "Martes", "6:45 am - 8:25 am", "Jueves", "6:45 am - 8:25 am", "A20"));
        lFacultades.get(2).lCarreras.get(4).lMaterias.add(new Materia("0502", "Gestion Hotelera", 
                new Docente("Carolina", "Oliva"), "Martes", "8:25 am - 10:05 am", "Viernes", "8:25 am - 10:05 am", "A20"));
        lFacultades.get(2).lCarreras.get(4).lMaterias.add(new Materia("0503", "Legislacion Turistica", 
                new Docente("Christian", "Osorio"), "Lunes", "8:25 am - 10:05 am", "Jueves", "8:25 am - 10:05 am", "A20"));
        lFacultades.get(2).lCarreras.get(4).lMaterias.add(new Materia("0504", "Gestion de Riesgos", 
                new Docente("Margarita", "Olivorio"), "Miercoles", "8:25 am - 10:05 am", "Viernes", "6:45 am - 8:25 am", "A20"));
        
        //============================================================================================================================================(5)
        
        //Facultad de enfermeria 
        this.lFacultades.add(new Facultades("Facultad en Ciencias de la Salud"));
        this.lFacultades.get(3).lCarreras = new ArrayList<>();
        
        //Medicina
        lFacultades.get(3).lCarreras.add(new Carrera("Medicina"));
        lFacultades.get(3).lCarreras.get(0).lMaterias = new ArrayList<>();
        //Materias
        lFacultades.get(3).lCarreras.get(0).lMaterias.add(new Materia("0600", "Inmunologia", 
                new Docente("Mariano", "Salazar"), "Lunes", "4:50 pm - 5:40 pm", "Miercoles", "4:50 pm - 5:40 pm", "E21"));
        lFacultades.get(3).lCarreras.get(0).lMaterias.add(new Materia("0601", "Nutricion", 
                new Docente("Jose", "Navarro"), "Martes", "4:50 pm - 5:40 pm", "Jueves", "4:50 pm - 5:40 pm", "E21"));
        lFacultades.get(3).lCarreras.get(0).lMaterias.add(new Materia("0602", "Fisiopatologia", 
                new Docente("Marina", "Hernandez"), "Martes", "5:45 pm - 6:35 pm", "Viernes", "5:45 pm - 6:35 pm", "E21"));
        lFacultades.get(3).lCarreras.get(0).lMaterias.add(new Materia("0603", "Medicina I", 
                new Docente("Coralia", "Villalobos"), "Lunes", "5:45 pm - 6:35 pm", "Jueves", "5:45 pm - 6:35 pm", "E21"));
        lFacultades.get(3).lCarreras.get(0).lMaterias.add(new Materia("0604", "Psicquiatria", 
                new Docente("Ana", "Mendez"), "Miercoles", "5:45 pm - 6:35 pm", "Viernes", "4:50 pm - 5:40 pm", "E21"));
        
        //Enfermeria
        lFacultades.get(3).lCarreras.add(new Carrera("Enfermeria"));
        lFacultades.get(3).lCarreras.get(1).lMaterias = new ArrayList<>();
        //Materias
        lFacultades.get(3).lCarreras.get(1).lMaterias.add(new Materia("0700", "Bioquimica Humana", 
                new Docente("Vanessa", "Lopez"), "Lunes", "2:00 pm - 3:30 pm", "Miercoles", "2:00 pm - 3:30 pm", "E20"));
        lFacultades.get(3).lCarreras.get(1).lMaterias.add(new Materia("0701", "Enfermeria en Salud Comunitaria I", 
                new Docente("Gabriela", "Moran"), "Martes", "2:00 pm - 3:30 pm", "Jueves", "2:00 pm - 3:30 pm", "E20"));
        lFacultades.get(3).lCarreras.get(1).lMaterias.add(new Materia("0702", "Enfermeria Quirurgica", 
                new Docente("Gabriela", "Moran"), "Martes", "3:55 pm - 4:45 pm", "Viernes", "3:55 pm - 4:45 pm", "E20"));
        lFacultades.get(3).lCarreras.get(1).lMaterias.add(new Materia("0703", "Etica Social", 
                new Docente("Rodrigo", "Vizcarra"), "Lunes", "3:55 pm - 4:45 pm", "Jueves", "3:55 pm - 4:45 pm", "E20"));
        lFacultades.get(3).lCarreras.get(1).lMaterias.add(new Materia("0704", "Microbiologia y Parasitologia", 
                new Docente("Mario", "Hernandez"), "Miercoles", "3:55 pm - 4:45 pm", "Viernes", "2:00 pm - 3:30 pm", "E20"));
        //======================================================================================================================================================(2)
   
    }
}
