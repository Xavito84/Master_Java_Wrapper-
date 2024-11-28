public class WrapperInteger {
    public static void main(String[] args) {


        int intPrimitivo= 32768;
        Integer intObjeto= Integer.valueOf(intPrimitivo); // Objeto tipo Integer
        Integer intObjeto2= intPrimitivo; // Objeto tipo Integer

        int num= intObjeto2; //convertir un objeto en primitivo
        System.out.println("num = " + num);
        int num2= intObjeto.intValue(); //convertir un objeto en primitvo
        System.out.println("num2 = " + num2);

        String valorTvlcd= "67000";
        Integer valor= Integer.valueOf(valorTvlcd);
        System.out.println("valor = " + valor);

        Short shotObjeto= intObjeto.shortValue();// tendremos perdida de informacion ya que solo soporta 32767 y le damos 32768
        System.out.println("shotObjeto = " + shotObjeto);

        Byte byteObjeto= intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);// perdida de informacion ya que damos mas de lo que soporta

        Long longObjeto= intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);




    }
}
