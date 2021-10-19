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

/**
 * Es la clase Asignatura que contiene el getter y setter de las asignaturas
 *
 * @author Juan Cordero
 * @version 1.0 19/10/21
 */
public class Asignatura {
    private String nombre;

    /**
     * Método para obtener el nombre de la asignatura
     * @return nombre de la asignatura
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre de la asignatura
     * @param nombre nombre de la asignatura
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para devolver la informacion de la clase en formato String
     * @return Informacion en formato String
     */
    public String toString(){
        return nombre;
    }
}
