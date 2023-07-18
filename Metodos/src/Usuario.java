public class Usuario {
    public static void main(String [] args){
        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada: " + smartTv.lig);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.Ligar();
        System.out.println("TV ligada: " + smartTv.lig);

        smartTv.AumentarCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.AumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.Desligar();
        System.out.println("TV ligada: " + smartTv.lig);

        smartTv.DiminuirCanal();
        System.out.println("Canal: " + smartTv.canal);

        smartTv.DiminuirVolume();
        System.out.println("Volume: " + smartTv.volume);


    }
}
