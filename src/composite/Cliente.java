package composite;
public class Cliente {
    public static void main(String[] args) {
        LeafCompacto compacto1 = new LeafCompacto();
        LeafCompacto compacto2 = new LeafCompacto();
        LeafCompacto compacto3 = new LeafCompacto();
        LeafCompacto compacto4 = new LeafCompacto();
        
        CompositeCarro conjuntoCarro = new CompositeCarro(); 
        CompositeCarro conjuntoCarro1 = new CompositeCarro(); 
        CompositeCarro conjuntoCarro2 = new CompositeCarro(); 
        
        conjuntoCarro1.addTipoCarro(compacto1);
        conjuntoCarro1.addTipoCarro(compacto2);
        conjuntoCarro1.addTipoCarro(compacto3);
        
        conjuntoCarro2.addTipoCarro(compacto4);
        
        conjuntoCarro.addTipoCarro(conjuntoCarro1);
        conjuntoCarro.addTipoCarro(conjuntoCarro2);
        
        conjuntoCarro.ConstruirCarro();
    }
    
}
