public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        
        System.out.println("Canal atual: " + smartTv.canal);
        

        smartTv.ligar();
        System.out.println("Tv ligada: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);
    }
}
