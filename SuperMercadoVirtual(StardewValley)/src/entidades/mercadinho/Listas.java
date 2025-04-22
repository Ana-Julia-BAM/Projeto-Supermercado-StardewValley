package entidades.mercadinho;

import java.util.List;
import entidades.Produto;
import entidades.foodType.ComidaAnimal;
import entidades.foodType.ComidaHumana;
import entidades.seedType.Muda;
import entidades.seedType.Semente;

public class Listas {
    private List<Produto> produtos;

    public Listas(List<Produto> produtos) {
        this.produtos = produtos;
        produtosPredefinidos();
    }

    private void produtosPredefinidos(){
        produtos.add(new Semente("Grão de café", 30.00, "433", 25, "Semente" , 10));
        produtos.add(new Semente("Sementes de Flor-Miçanga", 50.00, "455", 20 , "Semente", 8));
        produtos.add(new Semente("Sementes antigas", 30.00, "499", 4, "Semente", 10));
        produtos.add(new Semente("Sementes de Abacaxi", 240.00, "833", 10, "Semente", 14));
        produtos.add(new Semente("Sementes de carambola", 200.00, "486", 7, "Semente", 13));
        produtos.add(new Semente("Sementes de Melão", 80.00, "479", 20, "Semente", 12));
        produtos.add(new Semente("Sementes de milho", 150.00, "487", 15, "Semente" , 14));
        produtos.add(new Semente("Sementes de mirtilo", 80.00, "481", 14, "Semente", 13));
        produtos.add(new Semente("Sementes de papoula", 100.00, "453", 8, "Semente", 7));
        produtos.add(new Semente("Sementes de pimenta", 40.00, "482", 18, "Semente", 5));
        produtos.add(new Semente("Sementes de rabanete", 40.00, "484", 30, "Semente", 6));
        produtos.add(new Semente("Sementes de repolho roxo", 100.00, "485", 26, "Semente", 9));
        produtos.add(new Semente("Sementes de tomante", 50.00, "480",40, "Semente", 11));
        produtos.add(new Semente("Sementes de trigo", 10.00, "483", 50, "Semente", 4));
        produtos.add(new Semente("Sementes de abóbora", 100.00, "490", 22, "Semente", 13));
        produtos.add(new Semente("Sementes de alcachofra", 30.00, "489", 13, "Semente", 8));
        produtos.add(new Semente("Sementes de amaranto", 70.00, "299", 6, "Semente", 7));
        produtos.add(new Semente("Sementes de berinjela", 20.00, "488", 66, "Semente", 7));
        produtos.add(new Semente("Sementes de beterraba", 20.00, "494", 70, "Sementes", 6));
        produtos.add(new Semente("Sementes de couve flor", 80.00, "475", 45, "Semente", 12));
        produtos.add(new Semente("Sementes de fada", 200.00, "425", 24, "Semente", 12));
        produtos.add(new Semente("Sementes de Girassol", 200.00, "431", 36, "SSemente", 8));
        produtos.add(new Semente("Sementes de inhame", 60.00, "492", 19, "Semente", 10));
        produtos.add(new Semente("Sementes de oxicoco", 240.00, "493", 12, "Semente", 7));
        produtos.add(new Semente("Sementes de Morango", 100.00, "745", 55, "Semente", 8));
        produtos.add(new Semente("Sementes de Melão-Poeiro", 20.00, "PowdermelonSeeds", 32, "Semente", 7));
        produtos.add(new Semente("Sementes de Cenoura", 15.00, "CarrotSeeds", 84, "Semente", 3));
        produtos.add(new Muda("Mudas de lúpulo", 60.00, "303", 37, "Muda", 11));
        produtos.add(new Muda("Mudas de uva", 60.00, "302", 45, "Muda", 10));
        produtos.add(new Muda("Mudas de feijão", 60.00, "474", 100, "Muda", 10));



        produtos.add(new ComidaHumana("Abóbora", 320.00,"276", 30, "Vegetal", 0, 0));
        produtos.add(new ComidaHumana("Alho",60.00,"000",25,"Vegetal",9,20));
        produtos.add(new ComidaHumana("Batata",80.00,"192",50,"Vegetal",11,25));
        produtos.add(new ComidaHumana("Berinjela",60.00,"272",10,"Vegetal",9,20));
        produtos.add(new ComidaHumana("Milho",50.00,"270",25,"Vegetal",11,25));
        produtos.add(new ComidaHumana("Tomate",60.00,"256",25,"Vegetal",9,20));
        produtos.add(new ComidaHumana("Banana",150.00,"91",25,"Fruta",33,75));
        produtos.add(new ComidaHumana("Amora",20.00,"410",30,"Fruta",11,25));
        produtos.add(new ComidaHumana("Cereja",80.00,"638",10,"Fruta",17,38));
        produtos.add(new ComidaHumana("Coco",100.00,"88",35,"Fruta",0,0));
        produtos.add(new ComidaHumana("Laranja",100.00,"635",80,"Fruta",17,38));
        produtos.add(new ComidaHumana("Morango",120.00,"400",40,"Fruta",22,50));
        produtos.add(new ComidaHumana("Mirtilo",50.00,"258",40,"Fruta",11,25));
        produtos.add(new ComidaHumana("Uva",160.00,"258",40,"Fruta",11,25));
        produtos.add(new ComidaHumana("Salada", 160.00, "196", 50,"Culinária", 50, 113));
        produtos.add(new ComidaHumana("Peixe Cozido",100.00,"198",5,"Culinária",33,75));
        produtos.add(new ComidaHumana("Pizza",300.00,"206",20,"Culinária",67,150));
        produtos.add(new ComidaHumana("Pão",60.00,"217",50,"Culinária",22,50));
        produtos.add(new ComidaHumana("Bolo Rosa",480.00,"221",25,"Favorito da Haley",112,250));
        produtos.add(new ComidaHumana("Bolinhos de caranguejo",275.00,"732",3,"Culinária",101,225));
        produtos.add(new ComidaHumana("Sorvete",120.00,"233",50,"Culinári",45,100));
        produtos.add(new ComidaHumana("Espaguete",120.00,"224",34,"Culinária",33,75));
        produtos.add(new ComidaHumana("Rolinhos de arroz",220.00,"228",10,"Culinária",45,100));
        produtos.add(new ComidaHumana("Sashimi",75.00,"227",5,"Culinária",33,75));
        produtos.add(new ComidaHumana("Biscoitos",140.00,"223",50,"Culinária",40,90));
        produtos.add(new ComidaHumana("Bolo de chocolate",200.00,"220",40,"Culinári",67,100));
        produtos.add(new ComidaHumana("Taco de peixe",500.00,"213",25,"Culinária",74,165));
        produtos.add(new ComidaHumana("Enroladinhos de pimenta",200.00,"215",15,"Culinária",58,130));
        produtos.add(new ComidaHumana("Panquecas",80.00,"211",15,"Culinária",40,90));
        produtos.add(new ComidaHumana("Brusqueta",210.00,"618",9,"Culinária",50,113));
        produtos.add(new ComidaAnimal("Feno", 50.00, "Feno", 100, "Animais", 0, 0));
        produtos.add(new ComidaAnimal("Grama", 100.00, "297", 100, "Animais", 0, 0));





        for(Produto produto : produtos) {
            produto.ajustarQuantidade();
        }
    }



    public List<Produto> getProdutos() {
        return produtos;
    }
}