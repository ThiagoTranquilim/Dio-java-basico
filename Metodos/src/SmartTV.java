public class SmartTV {
    boolean lig = false;
    int canal = 1, volume = 1;

    public void Ligar(){
        lig = true;
    }

    public void Desligar(){
        lig = false;
    }

    public int AumentarVolume(){
        volume++;
        return volume;
    }

    public int DiminuirVolume(){
        volume--;
        return volume;
    }

    public int AumentarCanal(){
        canal++;
        return canal;
    }

    public int DiminuirCanal(){
        canal--;
        return canal;
    }
}
