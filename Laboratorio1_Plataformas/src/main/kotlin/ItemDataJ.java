//Erick Alexander Barrera Ochoa 22934 Programacion de plataformas moviles
public class ItemDataJ {

    public static void main(String[] args) {

    }

        private Object originalValue;


        public ItemDataJ(Object originalValue) {
            this.originalValue = originalValue;
        }


        public String getType() {

            if (originalValue instanceof String) {
                return "cadena";
            } else if (originalValue instanceof Integer) {
                return "entero";
            } else if (originalValue instanceof Boolean) {
                return "booleano";
            } else {
                return null;
            }
        }


        public String getInfo() {

            if (originalValue instanceof String) {

                return "L" + ((String) originalValue).length();
            } else if (originalValue instanceof Integer) {

                int value = (int) originalValue;

                if (value % 10 == 0) {
                    return "M10";
                } else if (value % 5 == 0) {
                    return "M5";
                } else if (value % 2 == 0) {
                    return "M2";
                } else {
                    return null;
                }
            } else if (originalValue instanceof Boolean) {

                return (boolean) originalValue ? "Verdadero" : "Falso";
            } else {
                return null;
            }
        }
    }



