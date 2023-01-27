package open.bootcamp;

/*
Crear una interfaz CocheCRUD.

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

Ejemplo:

CocheCRUD cocheCrud = new CocheCRUDImpl()
 */

import java.security.PublicKey;
import java.util.List;

public class Main {

    public interface CocheCRUD {
        void save();
        void findAll();
        void delete();
    }

    public static class CocheCRUDImpl implements CocheCRUD {

        @Override
        public void save() {}

        @Override
        public void findAll() {}

        @Override
        public void delete() {}

        String save = "Guardando";
        String findAll = "Buscar todo";
        String delete = "Borrando";

        @Override
        public String toString() {
            return "CocheCRUDImpl{" +
                    "save='" + save + '\'' +
                    ", findAll='" + findAll + '\'' +
                    ", delete='" + delete + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Coche coche = new Coche("ferrari", 1900, 2000, 300);
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        System.out.println(cocheCRUD);
    }
}