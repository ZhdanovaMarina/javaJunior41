package lesson10.HW;

public class LibraryCatalog {

    public Books[] book = new Books[50];

    public void addBook(Books books){
        for (int i = 0; i < book.length; i++){
            if (book [i] == null){
                book [i] = books;
                break;
            }
        }
    }

    public void displayBooks (){
        for (int i = 0; i < book.length; i++){
            if (book[i] != null){
                book[i].displayBook();
            } else break;
        }
    }


    public Magazines[] magazin = new Magazines[50];

    public void addMagazin(Magazines magazines){
        for (int i = 0; i < magazin.length; i++){
            if (magazin [i] == null){
                magazin [i] = magazines;
                break;
            }
        }
    }

    public void displayMagazines(){
        for (int i = 0; i < magazin.length; i++){
            if (magazin[i] != null){
                magazin[i].displayMagazin();
            } else break;
        }
    }


}
