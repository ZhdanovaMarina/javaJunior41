package lesson3;

public class Main3 {
    public static void main(String[] args) {
        char[] adcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};

        char[] ascdqwer = new char[adcd.length + qwer.length];

      //  ascdqwer [0] = adcd[0];
       // ascdqwer [1] = adcd[1];
      //  ascdqwer [2] = adcd[2];
     //   ascdqwer [3] = adcd[3];

      //  ascdqwer[4] = qwer[0]; // 4-4=0
      //  ascdqwer[5] = qwer[1];
      //  ascdqwer[6] = qwer[2];
      //  ascdqwer[7] = qwer[3];

        for (int i = 0; i <ascdqwer.length; i++){
            if (i < adcd.length){ // сохранение их первого массива
                ascdqwer [i] = adcd[i];
            }else { // сохранение второго массива
                ascdqwer[i] = qwer[i - adcd.length];

            }
            System.out.println(ascdqwer[i]);
        }
    }
}
