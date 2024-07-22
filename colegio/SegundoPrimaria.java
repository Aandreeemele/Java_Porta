package colegio;
import java.util.Scanner;
public class SegundoPrimaria {
        public static void programa() {
            System.out.println("SegundoPrimaria");

            // Estudiante
            Estudiantes estudiante1 = new Estudiantes("Santiago", "slopez@scl.edu.gt", "segundo Primaria", 8, true);
            Estudiantes estudiante2 = new Estudiantes("Gabriel", "gabri@scl.edu.gt", "segundo Primaria", 7, true);
            Estudiantes estudiante3 = new Estudiantes("Chema", "fernando@scl.edu.gt", "segundo Primaria", 7, true);
            Estudiantes estudiante4 = new Estudiantes("Jose","Jose@scl.edu.gt","segundo primaria",8,false);

            //CURSOS
            Curso curso1 = new Curso("Matemáticas","ciencia","1");
            Curso curso2 = new Curso("lenguaje","comunicación","2");
            Curso curso3 = new Curso("Sociales","ciencia","3");
            Curso curso4 = new Curso("Filosofía","Lógica","4");

            Scanner scr = new Scanner(System.in);

/*
        //NOMBRE,correo,Grado,edad y solvencia de estudiante

        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante2.getNombre());
        System.out.println(estudiante3.getNombre());
        System.out.println(estudiante4.getNombre());

        System.out.println(estudiante1.getCorreo());
        System.out.println(estudiante2.getCorreo());
        System.out.println(estudiante3.getCorreo());
        System.out.println(estudiante4.getCorreo());

        System.out.println(estudiante1.getedad());
        System.out.println(estudiante2.getedad());
        System.out.println(estudiante3.getedad());
        System.out.println(estudiante4.getedad());

        System.out.println(estudiante1.getsolvencia());
        System.out.println(estudiante2.getsolvencia());
        System.out.println(estudiante3.getsolvencia());
        System.out.println(estudiante4.getsolvencia());



        //NOMBRE,CATEGORIA Y PERIODO DE CURSOS

        System.out.println(curso1.getNombre());
        System.out.println(curso2.getNombre());
        System.out.println(curso3.getNombre());
        System.out.println(curso4.getNombre());

        System.out.println(curso1.getCategoria());
        System.out.println(curso2.getCategoria());
        System.out.println(curso3.getCategoria());
        System.out.println(curso4.getCategoria());

        System.out.println(curso1.getPeriodo());
        System.out.println(curso2.getPeriodo());
        System.out.println(curso3.getPeriodo());
        System.out.println(curso4.getPeriodo());


 */
            System.out.println(estudiante1.getNombre());
            System.out.println(estudiante2.getNombre());
            System.out.println(estudiante3.getNombre());
            System.out.println(estudiante4.getNombre());

            System.out.println(estudiante1.getNombre());
            System.out.println(estudiante2.getNombre());
            System.out.println(estudiante3.getNombre());
            System.out.println(estudiante4.getNombre());

            System.out.println(curso1.toString());
            System.out.println(curso2.toString());
            System.out.println(curso3.toString());
            System.out.println(curso4.toString());

        }
    }

