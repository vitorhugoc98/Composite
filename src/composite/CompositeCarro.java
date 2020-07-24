package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCarro implements ComponentCarro{
    private List<ComponentCarro> tipoCarros = new ArrayList<ComponentCarro>(); 

    @Override
    public void ConstruirCarro() {
        for(ComponentCarro tipoCarro : tipoCarros){
            tipoCarro.ConstruirCarro();
        }
    }
    
    public void addTipoCarro(ComponentCarro tipoCarro){
        tipoCarros.add(tipoCarro); 
    }
    
    public void removeTipoCarro(ComponentCarro  tipoCarro){
        tipoCarros.remove(tipoCarro); 
    }
    
    


    
}
