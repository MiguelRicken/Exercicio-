package atividades_pag_33;
public class Att_1_pag_33{

    public static void main(String[] args) {

           int Imp = 0, Par = 1;

           for(int i=0;i<=30;++i){  //conta de 0 a 30

                  if(i%2==0){

                         Par *= i;  //multPar é multiplicado com i

                  } else {

                         Imp += i;  //somaImp é somado com i

                  }

           }

           System.out.println("A soma dos números ímpares de 0 a 30: "+ Imp);

           System.out.println("A multiplicação dos números pares entre 0 e 30: "+ Par);

    }

}