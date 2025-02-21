package model;

public class Alumno extends Persona {

    @Override
    public boolean registrarAsistencia(String codIdentificador, String fechaAsistencia, String HoraAsistencia, Boolean valorAsistencia) {
        System.out.println("Aplicar lógica " +
                "para el alumno");
        return false;
    }
}
