public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        /*if(plano =="B"){
            System.out.println("100 Minutos de ligação");
        }else if(plano =="M"){
            System.out.println("100 Minutos de ligação");
            System.out.println("WhatsApp e Instagram ilimitado");
        }else if(plano =="T"){
            System.out.println("100 Minutos de ligação");
            System.out.println("WhatsApp e Instagram ilimitados");
            System.out.println("5Gb YouTube");
        }else{
            System.out.println("Sem Plano Contratado");
        }*/
        switch (plano) {
            default:{
                System.out.println("Sem Plano Contratado");
                break;
            }
            case "T": {
                System.out.println("5Gb YouTube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram ilimitados");
            }
            case "B": {
                System.out.println("100 Minutos de ligações");
            }
        }
    }
}

