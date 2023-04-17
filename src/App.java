import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int idade; 
        //String sexo;
        double mensalidade = 0.0;

        System.out.println("informe o seu sexo (M/F)");
        String sexo = input.nextLine().toUpperCase();

        System.out.println("Informe a sua idade");
        idade = input.nextInt();

        if(sexo.equals("M")){
            if(idade <=15){
             mensalidade = 60;
            }else if(idade >= 16 && idade <=18){
                mensalidade = 75;
            }else if(idade >= 19 && idade <= 30){
                mensalidade = 90;
            }else if(idade>=31 && idade <=40){
                mensalidade = 85;
            }else{
                mensalidade = 80;
            }
        } else if(sexo.equals("F")){
            if(idade <= 18){
                mensalidade = 60;
            }else if(idade >=19 && idade <=25){
                mensalidade = 90;
            }else if(idade >=26 && idade <=40){
                mensalidade = 85;
            }else{
                mensalidade = 80;
            }
        }
        System.out.println("A mensalidade é de : R$ " + mensalidade );
    } 
}
