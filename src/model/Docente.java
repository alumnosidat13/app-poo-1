package model;

public class Docente extends Persona {

    @Override
    public boolean registrarAsistencia(String codIdentificador, String fechaAsistencia, String HoraAsistencia, Boolean valorAsistencia) {
        System.out.println("Aplicar lógica " +
                "para el docente");
        return true;
    }
}
