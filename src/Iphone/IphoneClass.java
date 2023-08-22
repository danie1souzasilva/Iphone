package Iphone;

public class IphoneClass {
    private String marca = "Apple";
    private String modelo = "14 PROMax";

    public static void main(String[] args) {

        ChromeClass chrome = new ChromeClass();
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
        chrome.exibirPagina();

        TelefoneClass telefone = new TelefoneClass();
        telefone.atender();
        telefone.iniciarCorreio();
        telefone.ligar();

        SpotifyClass spotify = new SpotifyClass();
        spotify.selecionarMusica();
        spotify.tocar();
        spotify.pausar();


    }

}
