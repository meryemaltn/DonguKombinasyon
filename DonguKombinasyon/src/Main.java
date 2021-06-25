import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int nFacto=1;
		int rFacto=1;
        int difFacto=1;
        
        Scanner inp=new Scanner(System.in);
        System.out.println("n Deðerini Giriniz: ");
        int n=inp.nextInt();
        
        System.out.println("r Deðerini Giriniz: ");
        int r=inp.nextInt();
        int dif=n-r;
        
        for(int i=1;i<=n;i++){
            
        	nFacto=nFacto*i;
        }
        System.out.println("n Sayýsýnýn Faktöriyeli : " + nFacto);
        
        for(int j=1; j<=r; j++){
            
        	rFacto=rFacto*j;
        }
        System.out.println("r Sayýsýnýn Faktöriyeli : " + rFacto);
        
        for(int k=1; k<=dif; k++){
            
        	difFacto=difFacto*k;
        }
        System.out.println("(n-r)'nin Faktöriyeli : " + difFacto);
        
        int x = rFacto*difFacto;
        int comb = nFacto/x;
        
        System.out.println(n + " Sayýsýnýn " + r + "'li Kombinasyonu = " + comb);
        }
}
	