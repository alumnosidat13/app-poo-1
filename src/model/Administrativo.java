package model;

public class Administrativo extends Persona {

    @Override
    public boolean registrarAsistencia(String codIdentificador, String fechaAsistencia, String HoraAsistencia, Boolean valorAsistencia) {
        System.out.println("Aplicar lógica " +
                "para la asistencia del " +
                "administrativo");
        return true;
    }
}
