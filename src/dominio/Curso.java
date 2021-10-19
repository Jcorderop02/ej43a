/*
 * Copyright [2021] [Juan Cordero]
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dominio;

import java.util.ArrayList;

/**
 * Es la clase curso que contiene una ArrayList de asignaturas y contiene los getter y setters del nombre del curso
 *
 * @author Juan Cordero
 * @version 1.0 19/10/21
 */
public class Curso {
    private String nombre;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();

    /**
     * Método para obtener el nombre del curso
     * @return Nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del curso
     * @param nombre Nuevo curso
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener las asignaturas de la ArrayList
     * @return nombre de la asignatura
     */
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    /**
     * Método para establecer el nombre de las asignaturas de la ArrayList
     * @param asignaturas Nombre de las asignaturas
     */
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    /**
     * Método para añadir asignaturas a la ArrayList
     * @param asignatura nombre de la asignatura que se añade
     */
    public void addAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }

    @Override
    /**
     * Método para devolver la información de la clase en formato String
     * @return Informacion en formato String
     */
    public String toString() {
        String mensaje = "Curso: " + "\nNombre: " + nombre + "\nAsignaturas: " + "\n";
        for (int i = 0; i < asignaturas.size(); i++){
            mensaje += "- " + asignaturas.get(i) +"\n";
        }
        return mensaje;
    }
}
