package logica;

import java.util.List;

public interface MesaListener {
    
    void mesaActualizada(List<Filosofo> filosofos, Estados[] tenedores);
}
