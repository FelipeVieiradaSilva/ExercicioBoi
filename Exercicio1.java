package javaapplication1;

public class JavaApplication1 {
                
    public static void main(String[] args) {
        float peso = -1, pesoTotal = 0;
        float pesoG = 0;
        float pesoM = Float.MAX_VALUE;
        int qtd = 0;
        
        while(peso != 0){
            
        peso = InOut.leInt("Digite o peso do boi:");
        
        if (peso > 0) {
            
        if(peso > pesoG) {
            pesoG = peso;
        }
        
         if(peso < pesoM){
            pesoM = peso;
         }
        pesoTotal = pesoTotal + peso;
        
        qtd++;
    }
}
        
        InOut.MsgDeInformacao("Media", "Media Peso = " + pesoTotal/qtd);
        InOut.MsgDeInformacao("Estatisticas", "Peso G = " + pesoG);
        InOut.MsgDeInformacao("Estatisticas", "Peso M = " + pesoM);
        //InOut.MsgDeAviso("Resultado", (peso > 0) ? "TB" : "NTB");
    }
    
}
