package edu.thomaz.segundasemana;
public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Thomaz";
        String segundoNome = "Moreira";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
  