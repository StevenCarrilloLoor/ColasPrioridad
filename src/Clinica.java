import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Clinica {
    private PriorityQueue<Paciente> clinica;

    public Clinica() {
        clinica=new PriorityQueue<Paciente>();
    }
    public void encolar(Paciente dato){
        clinica.add(dato);

    }
    public Paciente antendido() throws Exception {
        if (clinica.isEmpty()){
            throw new Exception("No quedan elementos");
        }
        return clinica.poll();
        //clinica.remove e lo mismo
    }
    public List<Paciente> listarPacientes(){
        return clinica.stream().collect(Collectors.toList());

    }
}
